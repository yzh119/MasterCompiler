package com.expye.compiler2016.IR.ILOC.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Allocate extends Memory {
    Address r1;
    ValRegister r2;
    public Allocate(Address r1, ValRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return r1.toString() + "alloc " + r2.toString();
    }
}
