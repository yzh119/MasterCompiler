package com.expye.compiler2016.IR;

import com.expye.compiler2016.Exception.CompilationError;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.IR.CFG.BasicBlock;
import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.YIR.*;
import com.expye.compiler2016.IR.YIR.ControlFlow.ControlFlow;
import com.expye.compiler2016.IR.YIR.ControlFlow.Jump;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/20.
 */
public class convertYIRtoCFG {
    public static int cnt = 0;
    public static void printIR(PrintStream out) {
        for (CFG cfg: Program.functions) {
            out.println("func " + cfg.flable +
                    cfg.flable.prototype.para.stream().map(x -> x.reg.toString()).reduce("", (x, y)-> x + " " + y) + " {");
            for (BasicBlock bb: cfg.blockList) {
                out.println(bb.label + ":");
                for (Instruction ins: bb.internal) {
                    out.println("\t" + ins);
                }
                out.println();
            }
            out.println("}\n");
        }
    }

    public static void main(String[] args) {
        Program.functions = new ArrayList<>();
        Program.globalMem = new ArrayList<>();
        List<Instruction> basicBlock = null;
        List<BasicBlock> thisFunction = null;
        boolean inGlobal = true;
        for (Instruction ins: YIR.YIRInstance.Linear) {
            if (ins instanceof GlobalLabel) {
                inGlobal = true;
                continue;
            }

            if (!(ins instanceof FuncLabel)) {
                if (inGlobal) {
                    Program.globalMem.add(ins);
                    continue;
                }
            }

            if (ins instanceof FuncLabel) {
                inGlobal = false;
            // The procedure is used for judge whether a function has a return value.
            // Not done yet!
            //    if (basicBlock != null)
            //        throw new CompilationError("Maybe you haven't return in this function!");
                basicBlock = null;
                thisFunction = new ArrayList<>();
                Program.functions.add(new CFG((FuncLabel) ins, thisFunction));
                continue;
            }

            if (ins instanceof Label) {
                if (basicBlock != null) {
                    basicBlock.add(
                            new Jump((Label)ins)
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
    }
}
