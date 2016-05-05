package com.expye.compiler2016.IR.YIR;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Allocator.MachineRegister;
import com.expye.compiler2016.Label.FuncLabel;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.VirtualRegister;
import com.expye.compiler2016.Utility.Utility;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class Call extends Instruction {
    FuncLabel l;
    public IRRegister rd;
    public List<VirtualRegister> arguments =
            new ArrayList<>();

    public Call(IRRegister rd, FuncLabel l, List<VirtualRegister> arguments) {
        this.rd = rd;
        this.arguments = arguments;
        this.l = l;
    }

    @Override
    public String toString() {
        return (this.rd == null ? "": rd.toString() + " = " ) +  "call " + l.toString() +
                arguments.stream().map(VirtualRegister::toString).reduce("", (x, y)-> x + " " + y);
    }

    @Override
    public String toMIPS(Allocator alloc) {
        StringBuilder ret = new StringBuilder();
        int callerSave = max(arguments.size() - 3, 0) * 4;
        if (callerSave != 0)
            ret.append("add $sp, $sp, -").append(callerSave).append("\n");
/*
        boolean isBuiltin = false;
        if (l.prototype != null) {
            if (l.prototype == Utility.getIntDec || l.prototype == Utility.getStringDec) {
                isBuiltin = true;
            }
            if (l.prototype == Utility.printDec || l.prototype == Utility.printlnDec
                    || l.prototype == Utility.sizeDec || l.prototype ==  Utility.stringLength
                    || l.prototype == Utility.toStringDec || l.prototype == Utility.stringParseInt) {
                if (arguments.get(0) instanceof Immediate) {
                    ret.append("li ").append(MachineRegister.builtinArgRegister[0])
                            .append(", ").append(arguments.get(0)).append("\n");
                } else {
                    boolean argH =
                            alloc.realRegs[alloc.table.get(arguments.get(0))] != null;
                    if (argH) {
                        ret.append("move ").append(MachineRegister.builtinArgRegister[0])
                                .append(", ").append(alloc.realRegs[alloc.table.get(arguments.get(0))]).append("\n");
                    } else {
                        ret.append("lw  ").append(MachineRegister.builtinArgRegister[0])
                                .append(", ").append(alloc.offsetOfEachRegister.get(
                                alloc.table.get(arguments.get(0))
                        ) + callerSave).append("($sp)\n");
                    }
                }
                isBuiltin = true;
            }

            if (l.prototype == Utility.stringConcatenate || l.prototype == Utility.stringEq
                    || l.prototype == Utility.stringLt || l.prototype == Utility.stringOrd) {
                for (int i = 0; i < 2; i++)
                    if (arguments.get(i) instanceof Immediate) {
                        ret.append("li ").append(MachineRegister.builtinArgRegister[i])
                                .append(", ").append(arguments.get(i)).append("\n");
                    } else {
                        boolean argH =
                                alloc.realRegs[alloc.table.get(arguments.get(i))] != null;
                        if (argH) {
                            ret.append("move ").append(MachineRegister.builtinArgRegister[i])
                                    .append(", ").append(alloc.realRegs[alloc.table.get(arguments.get(i))]).append("\n");
                        } else {
                            ret.append("lw  ").append(MachineRegister.builtinArgRegister[i])
                                    .append(", ").append(alloc.offsetOfEachRegister.get(
                                    alloc.table.get(arguments.get(i))
                            ) + callerSave).append("($sp)\n");
                        }
                    }
                isBuiltin = true;
            }
            if (l.prototype == Utility.stringSubstring) {
                for (int i = 0; i < 3; i++)
                    if (arguments.get(i) instanceof Immediate) {
                        ret.append("li ").append(MachineRegister.builtinArgRegister[i])
                                .append(", ").append(arguments.get(i)).append("\n");
                    } else {
                        boolean argH =
                                alloc.realRegs[alloc.table.get(arguments.get(i))] != null;
                        if (argH) {
                            ret.append("move ").append(MachineRegister.builtinArgRegister[i])
                                    .append(", ").append(alloc.realRegs[alloc.table.get(arguments.get(i))]).append("\n");
                        } else {
                            ret.append("lw  ").append(MachineRegister.builtinArgRegister[i])
                                    .append(", ").append(alloc.offsetOfEachRegister.get(
                                    alloc.table.get(arguments.get(i))
                            ) + callerSave).append("($sp)\n");
                        }
                    }
                isBuiltin = true;
            }
        }

        if (!isBuiltin) */
        for (int i = 0; i < min(arguments.size(), 3); i++)
            if (arguments.get(i) instanceof Immediate) {
                ret.append("li ").append(MachineRegister.builtinArgRegister[i])
                        .append(", ").append(arguments.get(i)).append("\n");
            } else {
                boolean argH =
                        alloc.realRegs[alloc.table.get(arguments.get(i))] != null;
                if (argH) {
                    ret.append("move ").append(MachineRegister.builtinArgRegister[i])
                            .append(", ").append(alloc.realRegs[alloc.table.get(arguments.get(i))]).append("\n");
                } else {
                    ret.append("lw  ").append(MachineRegister.builtinArgRegister[i])
                            .append(", ").append(alloc.offsetOfEachRegister.get(
                            alloc.table.get(arguments.get(i))
                    ) + callerSave).append("($sp)\n");
                }
            }

        for (int i = 3; i < arguments.size(); i++) {
            VirtualRegister arg = arguments.get(i);
            if (arg instanceof IRRegister) {
                boolean argH =
                        alloc.realRegs[alloc.table.get(arg)] != null;
                if (argH) {
                    ret.append("sw  ").append(alloc.realRegs[alloc.table.get(arg)]).append(", ").append(4 * i).append("($sp)\n");
                } else {
                    ret.append("lw  $v0, ").append(alloc.offsetOfEachRegister.get(alloc.table.get(arg)) + callerSave)
                            .append("($sp)\n")
                            .append("sw  $v0, ").append(4 * (i - 3)).append("($sp)\n");
                }
            } else {
                ret.append("li  $v0, ").append(arg).append("\n").append("sw  $v0, ").append(4 * (i - 3)).append("($sp)\n");
            }
        }

        ret.append("jal ").append(l.toMIPS(alloc));

        if (rd != null) {
            boolean rdH =
                    alloc.realRegs[alloc.table.get(rd)] != null;
            if (rdH) {
                ret.append("\nmove ").append(alloc.realRegs[alloc.table.get(rd)]).append(", $v0");
            } else
                ret.append("\nsw  $v0, ").append(alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + callerSave).append("($sp)");
        }
        if (callerSave != 0)
            ret.append("\nadd $sp, $sp, ").append(callerSave);
        return ret.toString();
    }
}
