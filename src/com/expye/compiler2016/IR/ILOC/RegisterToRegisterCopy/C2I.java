package com.expye.compiler2016.IR.ILOC.RegisterToRegisterCopy;

import com.expye.compiler2016.Register.ValRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class C2I extends RegisterToRegisterCopy {
    public C2I(VirtualRegister r1, VirtualRegister r2) {
        super(r1, r2);
    }

    @Override
    public String toString() {
        return "c2i " + r1.toString() + " " + r2.toString();
    }
}
