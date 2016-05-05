package com.expye.compiler2016.Allocator;

import com.expye.compiler2016.IR.CFG.BasicBlock;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.BinaryIns;
import com.expye.compiler2016.IR.YIR.Arithmetic.UnaryIns.UnaryIns;
import com.expye.compiler2016.IR.YIR.Call;
import com.expye.compiler2016.IR.YIR.Comp.Comp;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.Allocate;
import com.expye.compiler2016.IR.YIR.Memory.Load;
import com.expye.compiler2016.IR.YIR.Memory.LoadAdress;
import com.expye.compiler2016.IR.YIR.Memory.LoadImmediate;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.Register.ArgsRegister;
import com.expye.compiler2016.Register.IRRegister;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by expye(Zihao Ye) on 2016/5/1.
 */
public class Allocator {
    public ArrayList<IRRegister> regs = new ArrayList<>();
    public ArrayList<ArgsRegister> args = new ArrayList<>();
    public Map<MachineRegister, Integer> machineRegToOffset =
            new HashMap<>();
    public MachineRegister[] realRegs;
    public Map<IRRegister, Integer> table = new HashMap<>();
    CFG cfg;
    public int allocSize;
    public ArrayList<Integer> offsetOfEachRegister = new ArrayList<>();
    public String frameStart;
    public String frameEnd;
    public Allocator(CFG cfg) {
        this.cfg = cfg;
        if (cfg.flable.prototype != null)
        cfg.flable.prototype.para.forEach(
                dec -> {
                    table.put(dec.reg, regs.size());
                    regs.add(dec.reg);
                    args.add((ArgsRegister) dec.reg);
                }
        );
        for (BasicBlock basicBlock: cfg.blockList) {
            for (Instruction ins: basicBlock.internal) {
                if (ins instanceof BinaryIns) {
                    if (table.get(((BinaryIns) ins).rd) == null) {
                        table.put(((BinaryIns) ins).rd, regs.size());
                        regs.add(((BinaryIns) ins).rd);
                    }
                }
                if (ins instanceof UnaryIns) {
                    if (table.get(((UnaryIns) ins).rd) == null) {
                        table.put(((UnaryIns) ins).rd, regs.size());
                        regs.add(((UnaryIns) ins).rd);
                    }
                }
                if (ins instanceof Comp) {
                    if (table.get(((Comp) ins).rd) == null) {
                        table.put(((Comp) ins).rd, regs.size());
                        regs.add(((Comp) ins).rd);
                    }
                }
                if (ins instanceof Call) {
                    if (((Call) ins).rd == null) continue;
                    if (table.get(((Call) ins).rd) == null) {
                        table.put(((Call) ins).rd, regs.size());
                        regs.add(((Call) ins).rd);
                    }
                }
                if (ins instanceof Move) {
                    if (table.get(((Move) ins).rd) == null) {
                        table.put(((Move) ins).rd, regs.size());
                        regs.add(((Move) ins).rd);
                    }
                }
                if (ins instanceof Allocate) {
                    if (table.get(((Allocate) ins).rd) == null) {
                        table.put(((Allocate) ins).rd, regs.size());
                        regs.add(((Allocate) ins).rd);
                    }
                }
                if (ins instanceof Load) {
                    if (table.get(((Load) ins).rd) == null) {
                        table.put(((Load) ins).rd, regs.size());
                        regs.add(((Load) ins).rd);
                    }
                }
                if (ins instanceof LoadAdress) {
                    if (table.get(((LoadAdress) ins).rd) == null) {
                        table.put(((LoadAdress) ins).rd, regs.size());
                        regs.add(((LoadAdress) ins).rd);
                    }
                }
                if (ins instanceof LoadImmediate) {
                    if (table.get(((LoadImmediate) ins).rd) == null) {
                        table.put(((LoadImmediate) ins).rd, regs.size());
                        regs.add(((LoadImmediate) ins).rd);
                    }
                }
            }
        }
    }

    public void printReg(PrintStream out) {
        for (IRRegister reg: regs) {
            out.println(reg);
        }
    }
}
