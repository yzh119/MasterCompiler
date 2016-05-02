package com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns;

import com.expye.compiler2016.IR.YIR.Arithmetic.Arithmetic;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class RemIns extends BinaryIns{
    public RemIns(IRRegister rd, IRRegister r1, VirtualRegister r2) {
        super(rd, r1, r2);
    }

    @Override
    public String toString() {
        return r1.toString() + " = rem " + r2.toString() + " " + rd.toString();
    }
}
