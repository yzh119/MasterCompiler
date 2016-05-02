package com.expye.compiler2016.IR.YIR.Arithmetic.UnaryIns;

import com.expye.compiler2016.IR.YIR.Arithmetic.Arithmetic;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/5/1.
 */
public class UnaryIns extends Arithmetic{
    public IRRegister rs, rd;
    public UnaryIns(IRRegister rd, IRRegister rs) {
        this.rs = rs;
        this.rd = rd;
    }
}
