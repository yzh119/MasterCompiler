package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.Utility;

/**
 * Created by expye(Zihao Ye) on 2016/4/26.
 */
public class Store extends Memory {
    public IRRegister rs;
    public Address addr;
    public Store(IRRegister rs, Address addr) {
        this.rs = rs;
        this.addr = addr;
    }

    @Override
    public String toString() {
        if (addr.staticVar == null)
            return "store " + Utility.i32 + " " + addr.reg.toString() + " " + rs.toString() +" " + addr.offset;
        return "store " + Utility.i32 + " " + addr.staticVar.toString() + " " + rs.toString();
    }
}
