package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class ValRegister extends VirtualRegister {
    int uID;

    public ValRegister() {
        this.uID = cID++;
    }

    @Override
    public String toString() {
        return "$r" + String.valueOf(uID);
    }
}
