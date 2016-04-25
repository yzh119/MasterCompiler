package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class IRRegister extends VirtualRegister {
    int uID;
    public IRRegister() {
        uID = cID++;
    }

    @Override
    public String toString() {
        return "$r" + String.valueOf(uID);
    }

}
