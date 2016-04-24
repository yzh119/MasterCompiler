package com.expye.compiler2016.IR.ILOC.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class CloadA0 extends Memory {
    Address r1;
    ValRegister r2, r3;
    public CloadA0(Address r1, ValRegister r2, ValRegister r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    @Override
    public String toString() {
        return "cloadA0 " + r1.toString() + " " + r2.toString() + " " + r3.toString();
    }
}