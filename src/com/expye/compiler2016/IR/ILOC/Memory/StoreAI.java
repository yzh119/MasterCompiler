package com.expye.compiler2016.IR.ILOC.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class StoreAI extends Memory {
    Address r2;
    VirtualRegister r1;
    Immediate c3;
    public StoreAI(VirtualRegister r1, Address r2, Immediate c3) {
        this.r1 = r1;
        this.r2 = r2;
        this.c3 = c3;
    }

    @Override
    public String toString() {
        return "StoreAI " + r1.toString() + " " + r2.toString() + " " + c3.toString();
    }
}
