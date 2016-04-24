package com.expye.compiler2016.IR.ILOC.Memory;

import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class LoadI extends Memory {
    Immediate c1;
    ValRegister r2;
    public LoadI(Immediate c1, ValRegister r2) {
        this.c1 = c1;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return "loadI " + c1.toString() + " " + r2.toString();
    }
}
