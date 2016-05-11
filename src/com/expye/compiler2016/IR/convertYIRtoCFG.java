package com.expye.compiler2016.IR;

import com.expye.compiler2016.IR.CFG.BasicBlock;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.YIR.Call;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.ControlFlow.ControlFlow;
import com.expye.compiler2016.IR.YIR.ControlFlow.JumpIns;
import com.expye.compiler2016.IR.YIR.ControlFlow.RetIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Label.FuncLabel;
import com.expye.compiler2016.Label.Label;
import com.expye.compiler2016.Register.Immediate;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by expye(Zihao Ye) on 2016/4/20.
 */
public class convertYIRtoCFG {
    public static void printIR(PrintStream out) {

        for (Instruction ins: Program.globalMem) {
            out.println("\t" + ins);
        }

        for (CFG cfg: Program.functions) {
            out.println("func " + cfg.flable +
                    ((cfg.flable.prototype != null) ? cfg.flable.prototype.para.stream().map(x -> x.reg.toString()).reduce("", (x, y)-> x + " " + y): "") + " {");
            for (BasicBlock bb: cfg.blockList) {
                out.println(bb.label + ":");
                for (Instruction ins: bb.internal) {
                    out.println("\t" + ins);
                }
                out.println();
            }
            out.println("}");
        }
    }

    public static void main(String[] args) {
        List<Instruction> basicBlock = null;
        List<BasicBlock> thisFunction = null;
        Program.preMain.blockList.get(0).internal.add(new Call(null, FuncLabel.originLabel , new ArrayList<>()));
        Program.preMain.blockList.get(0).internal.add(new RetIns(new Immediate(0)));
        Program.functions.add(Program.preMain);
        for (Instruction ins: YIR.YIRInstance.Linear) {
            if (ins instanceof FuncLabel) {
                if (basicBlock != null)
                    basicBlock.add(new RetIns(null));
                basicBlock = null;
                thisFunction = new ArrayList<>();
                Program.functions.add(new CFG((FuncLabel) ins, thisFunction));
                continue;
            }

            if (ins instanceof Label) {
                if (basicBlock != null) {
                    basicBlock.add(
                            new JumpIns((Label)ins)
                    );
                }
                basicBlock = new ArrayList<>();
                thisFunction.add(new BasicBlock((Label) ins, basicBlock));
                continue;
            }

            if (ins instanceof ControlFlow) {
                if (basicBlock != null) basicBlock.add(ins);
                basicBlock = null;
                continue;
            }

            if (basicBlock != null) basicBlock.add(ins);
        }
        if (basicBlock != null) basicBlock.add(new RetIns(null));
        trivialOptimize();
    }

    public static Map<Label, Label> realLinkedTo = new HashMap<>();

    public static Label find(CFG cfg, Label lb) {
        Label ret = realLinkedTo.get(lb);
        if (ret == null) {
            int x = cfg.getPosition(lb);
            if (cfg.blockList.get(x).internal.size() > 1) {
                ret = lb;
                realLinkedTo.put(lb, lb);
            } else {
                if (cfg.blockList.get(x).internal.get(0) instanceof JumpIns) {
                    ret = find(cfg, ((JumpIns) cfg.blockList.get(x).internal.get(0)).label);
                    realLinkedTo.put(lb, ret);
                } else ret = lb;
            }
        }
        return ret;
    }

    private static void trivialOptimize() {
        for (CFG cfg: Program.functions) {
            realLinkedTo.clear();
            for (BasicBlock basicblock : cfg.blockList) {
                Instruction ins = basicblock.internal.get(basicblock.internal.size() - 1);
                if (ins instanceof Cbr) {
                    ((Cbr) ins).ifFalse = find(cfg, ((Cbr) ins).ifFalse);
                    ((Cbr) ins).ifTrue = find(cfg, ((Cbr) ins).ifTrue);
                }
                if (ins instanceof JumpIns) {
                    ((JumpIns) ins).label = find(cfg, ((JumpIns) ins).label);
                }
            }
        }
    }
}
