package com.expye.compiler2016.IR.ILOC.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class CloadAI extends Memory {
    Address r1;
    VirtualRegister r3;
    Immediate c2;

    public CloadAI(Address r1, Immediate c2, VirtualRegister r3) {
        this.r1 = r1;
        this.c2 = c2;
        this.r3 = r3;
    }

    @Override
    public String toString() {
        return "cloadAI " + r1.toString() + " " + c2.toString() + " " + r3.toString();
    }
}
