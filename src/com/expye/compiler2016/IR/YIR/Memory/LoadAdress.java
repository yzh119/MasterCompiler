package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/30.
 */
public class LoadAdress extends Memory{
    public IRRegister rd;
    Address addr;
    public LoadAdress(IRRegister rd, Address addr) {
        this.rd = rd;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return rd.toString() + " = la " + addr.staticVar.toString();
    }
}
