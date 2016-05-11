package com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/22.
 */
public class XorIns extends BinaryIns {
    public XorIns(IRRegister rd, IRRegister r1, VirtualRegister r2) {
        super(rd, r1, r2);
    }

    @Override
    public String toString() {
        return rd.toString() + " = xor " + r1.toString() + " " + r2.toString();
    }

    @Override
    public String toMIPS(Allocator alloc) {
        boolean rdH = alloc.realRegs[alloc.table.get(rd)] != null,
                r1H = alloc.realRegs[alloc.table.get(r1)] != null,
                r2H = !(r2 instanceof IRRegister) || alloc.realRegs[alloc.table.get(r2)] != null;

        if (rdH && r1H && r2H) {
            return "xor " +
                    alloc.realRegs[alloc.table.get(rd)] + ", " +
                    alloc.realRegs[alloc.table.get(r1)] + ", " +
                    ((r2 instanceof IRRegister) ? alloc.realRegs[alloc.table.get(r2)] : r2.toString());
        }
        if (rdH && r1H) {
            return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(r2)) + "($sp)\n" +
                    "xor " +
                    alloc.realRegs[alloc.table.get(rd)] + ", " +
                    alloc.realRegs[alloc.table.get(r1)] + ", $v0";
        }
        if (rdH && r2H) {
            return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(r1)) + "($sp)\n" +
                    "xor " +
                    alloc.realRegs[alloc.table.get(rd)] + ", $v0, " +
                    ((r2 instanceof IRRegister) ? alloc.realRegs[alloc.table.get(r2)] : r2.toString());
        }
        if (rdH) {
            return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(r1)) + "($sp)\n" +
                    "lw  $v1, " + alloc.offsetOfEachRegister.get(alloc.table.get(r2)) + "($sp)\n" +
                    "xor " +
                    alloc.realRegs[alloc.table.get(rd)] + ", " +
                    "$v0, $v1\n";
        }
        if (r1H && r2H) {
            return "xor $v0, " +
                    alloc.realRegs[alloc.table.get(r1)] + ", " +
                    ((r2 instanceof IRRegister) ? alloc.realRegs[alloc.table.get(r2)] : r2.toString()) + "\n" +
                    "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
        }
        if (r1H) {
            return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(r2)) + "($sp)\n" +
                    "xor $v0, " +
                    alloc.realRegs[alloc.table.get(r1)] + ", $v0\n" +
                    "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
        }
        if (r2H) {
            return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(r1)) + "($sp)\n" +
                    "xor $v0, $v0, " +
                    ((r2 instanceof IRRegister) ? alloc.realRegs[alloc.table.get(r2)] : r2.toString()) + "\n" +
                    "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
        }
        return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(r1)) + "($sp)\n" +
                "lw  $v1, " + alloc.offsetOfEachRegister.get(alloc.table.get(r2)) + "($sp)\n" +
                "xor $v0, $v0, $v1\n" +
                "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
    }
}
