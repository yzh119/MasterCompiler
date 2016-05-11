package com.expye.compiler2016.IR.YIR;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Move extends Instruction{
    public IRRegister rd, rs;
    public Move(IRRegister rd, IRRegister rs) {
        this.rd = rd;
        this.rs = rs;
    }

    @Override
    public String toString() {
        return rd.toString() + " = move " + rs.toString();
    }

    @Override
    public String toMIPS(Allocator alloc) {
        boolean rdH = alloc.realRegs[alloc.table.get(rd)] != null,
                rsH = alloc.realRegs[alloc.table.get(rs)] != null;
        if (rdH && rsH) {
            return "move " +
                    alloc.realRegs[alloc.table.get(rd)] + ", " +
                    alloc.realRegs[alloc.table.get(rs)];
        }
        if (rdH && !rsH) {
            return "lw  $v0, " +
                    alloc.offsetOfEachRegister.get(alloc.table.get(rs)) +
                    "($sp)\n" +
                    "move " + alloc.realRegs[alloc.table.get(rd)] +
                    ", $v0";
        }
        if (!rdH && rsH) {
            return "sw  " + alloc.realRegs[alloc.table.get(rs)] +
                    ", " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
        }
        return "lw  $v0, " +
                alloc.offsetOfEachRegister.get(alloc.table.get(rs)) +
                "($sp)\n" +
                "sw $v0, " +
                alloc.offsetOfEachRegister.get(alloc.table.get(rd)) +
                "($sp)";
    }
}
