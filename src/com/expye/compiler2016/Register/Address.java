package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Address {
    public IRRegister reg;
    public Immediate offset;
    public int size;
    public Address(IRRegister reg, Immediate offset, int size) {
        this.reg = reg;
        this.offset = offset;
        this.size = size;
    }
}
