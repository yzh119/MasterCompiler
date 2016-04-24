package com.expye.compiler2016.IR.ILOC.RegisterToRegisterCopy;

import com.expye.compiler2016.IR.ILOC.Instruction;
import com.expye.compiler2016.Register.ValRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class RegisterToRegisterCopy extends Instruction{
    VirtualRegister r1, r2;
    RegisterToRegisterCopy(VirtualRegister r1, VirtualRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
