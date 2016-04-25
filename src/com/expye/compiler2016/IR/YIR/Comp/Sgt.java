package com.expye.compiler2016.IR.YIR.Comp;

import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Sgt extends Comp {
    IRRegister r1, rd;
    VirtualRegister r2;
    public Sgt (IRRegister rd, IRRegister r1, VirtualRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.rd = rd;
    }

    @Override
    public String toString() {
        return rd.toString() + " = sgt " + r1.toString() + " " + r2.toString();
    }
}
