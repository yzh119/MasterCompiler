package com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns;

import com.expye.compiler2016.IR.YIR.Arithmetic.Arithmetic;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/5/1.
 */
public class BinaryIns extends Arithmetic{
    public IRRegister r1, rd;
    public VirtualRegister r2;
    public BinaryIns(IRRegister rd, IRRegister r1, VirtualRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.rd = rd;
    }
}
