package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/26.
 */
public class Store extends Memory {
    IRRegister rs;
    Address addr;
    public Store(IRRegister rs, Address addr) {
        this.rs = rs;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "store " + addr.size + " " + addr.reg.toString() + " " + rs.toString() +" " + addr.offset;
    }
}
