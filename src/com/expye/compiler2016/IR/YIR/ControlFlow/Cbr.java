package com.expye.compiler2016.IR.YIR.ControlFlow;

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
}
