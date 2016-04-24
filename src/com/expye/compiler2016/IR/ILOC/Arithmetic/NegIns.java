package com.expye.compiler2016.IR.ILOC.Arithmetic;

import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class NegIns extends Arithmetic {
    ValRegister r1, r2;
    public NegIns(ValRegister r1, ValRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return "neg " + r1.toString() + " " + r2.toString();
    }
}
