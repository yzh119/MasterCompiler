package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Allocate extends Memory {
    public IRRegister rd;
    VirtualRegister size;
    public Allocate(IRRegister rd, VirtualRegister size) {
        this.rd = rd;
        this.size = size;
    }

    @Override
    public String toString() {
        return rd.toString() + " = alloc " + size.toString();
    }

    @Override
    public String toMIPS(Allocator alloc) {
        boolean rdH =
                alloc.realRegs[alloc.table.get(rd)] != null;
        if (size instanceof IRRegister) {
            boolean rsH =
                    alloc.realRegs[alloc.table.get(size)] != null;
            if (rdH && rsH) {
                return "li  $v0,  9\n" +
                        "move $a0, " + alloc.realRegs[alloc.table.get(size)] + "\n" +
                        "syscall\n" +
                        "move " + alloc.realRegs[alloc.table.get(rd)] + ", $v0";
            }
            if (rsH) {
                return "li  $v0,  9\n" +
                        "move $a0, " + alloc.realRegs[alloc.table.get(size)] + "\n" +
                        "syscall\n" +
                        "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
            }
            if (rdH) {
                return "li  $v0,  9\n" +
                        "lw  $a0, " + alloc.offsetOfEachRegister.get(alloc.table.get(size)) + "($sp)\n" +
                        "syscall\n" +
                        "move " + alloc.realRegs[alloc.table.get(rd)] + ", $v0";
            }
            return "li  $v0,  9\n" +
                    "lw  $a0, " + alloc.offsetOfEachRegister.get(alloc.table.get(size)) + "($sp)\n" +
                    "syscall\n" +
                    "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
        } else {
            if (rdH) {
                return "li  $a0, " + size + "\n" +
                        "li  $v0,  9\n" +
                        "syscall\n" +
                        "move " + alloc.realRegs[alloc.table.get(rd)] + ", $v0";
            }
            return "li  $a0, " + size + "\n" +
                    "li  $v0,  9\n" +
                    "syscall\n" +
                    "sw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(rd)) + "($sp)";
        }
    }
}
