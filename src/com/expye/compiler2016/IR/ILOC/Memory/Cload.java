package com.expye.compiler2016.IR.ILOC.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class Cload extends Memory {
    Address r1;
    ValRegister r2;
    public Cload(Address r1, ValRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return "cload " + r1.toString() + " " + r2.toString();
    }
}
