package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/26.
 */
public class Load extends Memory {
    IRRegister rd;
    Address addr;
    public Load(IRRegister rd, Address addr) {
        this.rd = rd;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return rd.toString() + " = load " + addr.size + " " + addr.reg.toString() + " " + addr.offset;
    }
}
