package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class IRRegister extends VirtualRegister {
    int uID;
    public Address addr;
    public IRRegister() {
        uID = cID++;
    }
    public IRRegister(Address addr) {
        uID = cID++;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "$r" + String.valueOf(uID);
    }

}
