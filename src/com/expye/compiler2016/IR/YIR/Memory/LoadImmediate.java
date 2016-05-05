package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class LoadImmediate extends Memory {
    public IRRegister rd;
    Immediate imm;
    public LoadImmediate(IRRegister rd, Immediate imm) {
        this.rd = rd;
        this.imm = imm;
    }

    @Override
    public String toString() {
        return rd.toString() + " = move " + imm.toString();
    }

    @Override
    public String toMIPS(Allocator alloc) {
        boolean rdH =
                alloc.realRegs[alloc.table.get(rd)] != null;
        if (rdH) {
            return "li  " + alloc.realRegs[alloc.table.get(rd)] + ", " + imm;
        }
        return "li  $v0, " + imm + "\n" +
                "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
    }
}
