package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.Utility;

/**
 * Created by expye(Zihao Ye) on 2016/4/26.
 */
public class Load extends Memory {
    public IRRegister rd;
    public Address addr;
    public Load(IRRegister rd, Address addr) {
        this.rd = rd;
        this.addr = addr;
    }

    @Override
    public String toString() {
        if (addr.staticVar == null)
            return rd.toString() + " = load " + Utility.i32 + " " + addr.reg.toString() + " " + addr.offset;
        return rd.toString() + " = load " + Utility.i32 + " " + addr.staticVar;
    }
}
