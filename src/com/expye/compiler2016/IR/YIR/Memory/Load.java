package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.Utility;

/**
 * Created by expye(Zihao Ye) on 2016/4/26.
 */
public class Load extends Memory {
    public IRRegister rd;
    public Address addr;
    public Load(IRRegister rd, Address addr) {
        this.rd = rd;
        this.addr = addr;
    }

    @Override
    public String toString() {
        if (addr.staticVar == null)
            return rd.toString() + " = load " + Utility.i32 + " " + addr.reg.toString() + " " + addr.offset;
        return rd.toString() + " = load " + Utility.i32 + " " + addr.staticVar;
    }

    @Override
    public String toMIPS(Allocator alloc) {
        boolean rdH =
                alloc.realRegs[alloc.table.get(rd)] != null;
        if (addr.staticVar != null) {
            if (rdH)
                return "lw  " + alloc.realRegs[alloc.table.get(rd)] + ", " + addr.staticVar;
            return "lw  $v0, " + addr.staticVar + "\n" +
                    "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
        } else {
            boolean rsH
                    = alloc.realRegs[alloc.table.get(addr.reg)] != null;
            if (rdH && rsH) {
                return "lw  " + alloc.realRegs[alloc.table.get(rd)] + ", " +
                        addr.offset +
                        "(" + alloc.realRegs[alloc.table.get(addr.reg)] + ")";
            }

            if (rdH) {
                return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(addr.reg)) + "($sp)\n" +
                        "lw  " + alloc.realRegs[alloc.table.get(rd)] + ", " + addr.offset + "($v0)\n";
            }

            if (rsH) {
                return "lw  $v0, " + addr.offset + "(" + alloc.realRegs[alloc.table.get(addr.reg)] + ")\n" +
                        "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
            }

            return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(addr.reg)) + "($sp)\n" +
                    "lw  $v1, " + addr.offset + "($v0)\n" +
                    "sw  $v1, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
        }
    }
}
