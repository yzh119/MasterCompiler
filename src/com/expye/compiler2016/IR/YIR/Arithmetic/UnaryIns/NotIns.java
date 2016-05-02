package com.expye.compiler2016.IR.YIR.Arithmetic.UnaryIns;

import com.expye.compiler2016.IR.YIR.Arithmetic.Arithmetic;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class NotIns extends UnaryIns{
    public NotIns(IRRegister rd, IRRegister rs) {
        super(rd, rs);
    }

    @Override
    public String toString() {
        return rd.toString() + " = not " +  rs.toString();
    }
}
