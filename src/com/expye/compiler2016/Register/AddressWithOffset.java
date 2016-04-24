package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class AddressWithOffset extends Address {
    public Immediate offset;
    public AddressWithOffset(Immediate offset, int size) {
        super(size);
        this.offset = offset;
    }

    @Override
    public String toString() {
        return super.toString() + "+" + offset.toString();
    }
}
