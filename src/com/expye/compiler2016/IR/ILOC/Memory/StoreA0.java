package com.expye.compiler2016.IR.ILOC.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class StoreA0 extends Memory {
    Address r2;
    VirtualRegister r1, r3;
    public StoreA0(VirtualRegister r1, Address r2, VirtualRegister r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    @Override
    public String toString() {
        return "storeA0 "  + r1.toString() + " " + r2.toString() + " " + r3.toString();
    }
}
