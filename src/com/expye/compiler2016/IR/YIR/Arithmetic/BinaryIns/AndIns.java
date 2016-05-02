package com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns;

import com.expye.compiler2016.IR.YIR.Arithmetic.Arithmetic;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/22.
 */
public class AndIns extends BinaryIns{
    public AndIns(IRRegister rd, IRRegister r1, VirtualRegister r2) {
        super(rd, r1, r2);
    }

    @Override
    public String toString() {
        return rd.toString() + " = and " + r1.toString() + " " + r2.toString();
    }
}
