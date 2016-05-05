package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/30.
 */
public class LoadAdress extends Memory{
    public IRRegister rd;
    Address addr;
    public LoadAdress(IRRegister rd, Address addr) {
        this.rd = rd;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return rd.toString() + " = la " + addr.staticVar.toString();
    }

    @Override
    public String toMIPS(Allocator alloc) {
        boolean rdH =
                alloc.realRegs[alloc.table.get(rd)] != null;
        if (rdH) {
            return "la  " + alloc.realRegs[alloc.table.get(rd)] + ", " + addr.staticVar;
        }
        return "la  $v0, " + addr.staticVar + "\n" +
                "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
    }
}
