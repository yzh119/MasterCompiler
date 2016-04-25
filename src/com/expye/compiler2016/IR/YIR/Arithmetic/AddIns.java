package com.expye.compiler2016.IR.YIR.Arithmetic;

import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class AddIns extends Arithmetic {
    IRRegister r1, rd;
    VirtualRegister r2;
    public AddIns(IRRegister rd, IRRegister r1, VirtualRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.rd = rd;
    }

    @Override
    public String toString() {
        return rd.toString() + " = add " +  r1.toString() + " " + r2.toString();
    }
}
