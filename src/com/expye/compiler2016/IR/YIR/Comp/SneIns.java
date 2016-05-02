package com.expye.compiler2016.IR.YIR.Comp;

import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class SneIns extends Comp {
    public SneIns(IRRegister rd, IRRegister r1, VirtualRegister r2) {
        super(rd, r1, r2);
    }

    @Override
    public String toString() {
        return rd.toString() + " = sne " + r1.toString() + " " + r2.toString();
    }
}
