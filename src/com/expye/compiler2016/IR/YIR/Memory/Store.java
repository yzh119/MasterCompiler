package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.Utility;

/**
 * Created by expye(Zihao Ye) on 2016/4/26.
 */
public class Store extends Memory {
    public IRRegister rs;
    public Address addr;
    public Store(IRRegister rs, Address addr) {
        this.rs = rs;
        this.addr = addr;
    }

    @Override
    public String toString() {
        if (addr.staticVar == null)
            return "store " + Utility.i32 + " " + addr.reg.toString() + " " + rs.toString() +" " + addr.offset;
        return "store " + Utility.i32 + " " + addr.staticVar.toString() + " " + rs.toString();
    }

    @Override
    public String toMIPS(Allocator alloc) {
        if (alloc.table.get(rs) == null) System.out.println(rs);
        boolean rsH =
                alloc.realRegs[alloc.table.get(rs)] != null;
        if (addr.staticVar != null) {
            if (rsH)
                return "sw  " + alloc.realRegs[alloc.table.get(rs)] + ", " + addr.staticVar;
            return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rs)) + "($sp)\n" +
                    "sw  $v0, " + addr.staticVar;
        } else {
            boolean rdH =
                    alloc.realRegs[alloc.table.get(addr.reg)] != null;
            if (rsH && rdH) {
                return "sw  " + alloc.realRegs[alloc.table.get(rs)] + ", " +
                        addr.offset +
                        "(" + alloc.realRegs[alloc.table.get(addr.reg)] + ")";
            }
            if (rsH) {
                return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(addr.reg)) + "($sp)\n" +
                        "sw  " + alloc.realRegs[alloc.table.get(rs)] + ", " + addr.offset + "($v0)";
            }
            if (rdH) {
                return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rs)) + "($sp)\n" +
                        "sw  $v0, " + addr.offset + "(" + alloc.realRegs[alloc.table.get(addr.reg)] + ")";
            }
            return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rs)) + "($sp)\n" +
                    "lw  $v1, " + alloc.offsetOfEachRegister.get(alloc.table.get(addr.reg)) + "($sp)\n" +
                    "sw  $v0, " + addr.offset + "($v1)";
        }
    }
}
