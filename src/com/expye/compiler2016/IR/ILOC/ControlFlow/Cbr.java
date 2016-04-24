package com.expye.compiler2016.IR.ILOC.ControlFlow;

import com.expye.compiler2016.IR.ILOC.Label;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Cbr extends ControlFlow {
    ValRegister r1;
    Label l1, l2;

    public Cbr(ValRegister r1, Label l1, Label l2) {
        this.r1 = r1;
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public String toString() {
        return "cbr " + r1.toString() + "\n" +
                l1.toString() + "\n" +
                l2.toString();
    }
}
