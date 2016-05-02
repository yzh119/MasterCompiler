package com.expye.compiler2016.Register;

import com.expye.compiler2016.Label.GlobalVarLabel;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Address {
    public IRRegister reg;
    public Immediate offset;
    public GlobalVarLabel staticVar;
    public Address(IRRegister reg, Immediate offset) {
        this.reg = reg;
        this.offset = offset;
    }

    public Address(GlobalVarLabel staticVar) {
        this.staticVar = staticVar;
        this.offset = new Immediate(0);
    }
}
