package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class AddressWithOffset extends IRRegister {
    public Immediate offset;
    int type;
    public AddressWithOffset(Immediate offset, int size) {
        this.offset = offset;
        type = size;
    }

    @Override
    public String toString() {
        return super.toString() + "+" + offset.toString();
    }
}
