package com.expye.compiler2016.IR.ILOC.Arithmetic.ArithmeticImmediate;

import com.expye.compiler2016.IR.ILOC.Arithmetic.Arithmetic;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class DivIIns extends Arithmetic{
    ValRegister r1, r3;
    Immediate c2;
    public DivIIns(ValRegister r1, Immediate c2, ValRegister r3) {
        this.r1 = r1;
        this.c2 = c2;
        this.r3 = r3;
    }

    @Override
    public String toString() {
        return "divI " + r1.toString() + " " + c2.toString() + " " + r3.toString();
    }

}
