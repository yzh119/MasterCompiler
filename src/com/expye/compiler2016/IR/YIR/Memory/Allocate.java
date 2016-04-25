package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Allocate extends Memory {
    IRRegister r1;
    IRRegister r2;
    public Allocate(IRRegister r1, IRRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return r1.toString() + "alloc " + r2.toString();
    }
}
