package com.expye.compiler2016.IR.YIR.Arithmetic;

import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/22.
 */
public class AndIns extends Arithmetic {
    IRRegister r1, rd;
    VirtualRegister r2;
    public AndIns(IRRegister rd, IRRegister r1, VirtualRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.rd = rd;
    }

    @Override
    public String toString() {
        return rd.toString() + " = and " + r1.toString() + " " + r2.toString();
    }
}