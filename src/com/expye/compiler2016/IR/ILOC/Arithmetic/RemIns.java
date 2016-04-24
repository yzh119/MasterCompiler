package com.expye.compiler2016.IR.ILOC.Arithmetic;

import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class RemIns extends Arithmetic {
    ValRegister r1, r2, r3;
    public RemIns(ValRegister r1, ValRegister r2, ValRegister r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    @Override
    public String toString() {
        return "rem " + r1.toString() + " " + r2.toString() + " " + r3.toString();
    }
}
