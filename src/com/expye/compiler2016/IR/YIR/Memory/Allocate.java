package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Allocate extends Memory {
    IRRegister rd;
    VirtualRegister size;
    public Allocate(IRRegister rd, VirtualRegister size) {
        this.rd = rd;
        this.size = size;
    }

    @Override
    public String toString() {
        return rd.toString() + " = alloc " + size.toString();
    }
}
