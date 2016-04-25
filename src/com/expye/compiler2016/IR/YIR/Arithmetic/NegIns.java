package com.expye.compiler2016.IR.YIR.Arithmetic;

import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class NegIns extends Arithmetic {
    IRRegister rs, rd;
    public NegIns(IRRegister rd, IRRegister rs) {
        this.rs = rs;
        this.rd = rd;
    }

    @Override
    public String toString() {
        return rd.toString() + " = neg " + rd.toString();
    }
}
