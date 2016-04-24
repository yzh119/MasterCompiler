package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Address extends VirtualRegister {
    int uID;
    int size;
    public Address(int size) {
        uID = cID++;
        this.size = size;
    }

    @Override
    public String toString() {
        return "$r" + String.valueOf(uID);
    }
}
