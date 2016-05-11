package com.expye.compiler2016.IR.YIR.ControlFlow;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class RetIns extends ControlFlow {
    public VirtualRegister reg;
    public RetIns(VirtualRegister reg) {
        this.reg = reg;
    }

    @Override
    public String toString() {
        if (reg != null)
            return "ret " + reg.toString();
        else
            return "ret ";
    }

    @Override
    public String toMIPS(Allocator alloc) {
        if (reg == null)
        return alloc.frameEnd + "\n" +
                "jr $ra";
        return (reg instanceof Immediate ? "li $v0, " + reg.toString() + "\n" :
                        alloc.realRegs[alloc.table.get(reg)] != null ?
                                "move $v0, " + alloc.realRegs[alloc.table.get(reg)] + "\n":
                                "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(reg)) + "($sp)\n"
                ) + alloc.frameEnd + "jr $ra";
    }
}
