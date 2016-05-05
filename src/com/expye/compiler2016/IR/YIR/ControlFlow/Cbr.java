package com.expye.compiler2016.IR.YIR.ControlFlow;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Label.Label;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Cbr extends ControlFlow {
    public IRRegister r;
    public Label ifTrue, ifFalse;

    public Cbr(IRRegister r, Label ifTrue, Label ifFalse) {
        this.r = r;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    @Override
    public String toString() {
        return "br " + r.toString() + " "+
                ifTrue.toString() + " " +
                ifFalse.toString();
    }

    @Override
    public String toMIPS(Allocator alloc) {
        boolean rH = alloc.realRegs[alloc.table.get(r)] != null;
        if (rH) {
            return "bnez " + alloc.realRegs[alloc.table.get(r)] + ", " + ifTrue.toMIPS(alloc) + "\n" +
                    "b " + ifFalse.toMIPS(alloc);
        }
        return "lw  $v0, " + alloc.offsetOfEachRegister.get(alloc.table.get(r)) + "($sp)\n" +
                "bnez $v0, " + ifTrue.toMIPS(alloc) + "\n" +
                "b " + ifFalse.toMIPS(alloc);
    }
}
