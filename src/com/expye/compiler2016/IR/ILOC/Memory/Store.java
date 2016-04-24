package com.expye.compiler2016.IR.ILOC.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Store extends Memory {
    Address r2;
    VirtualRegister r1;
    public Store(VirtualRegister r1, Address r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return "store " + r1.toString() + " " + r2.toString();
    }
}
