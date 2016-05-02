package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class IRRegister extends VirtualRegister {
    int uID;
    public Address addr;
    public static int cID = 0;
    public static int gID = 0;
    public static void init() {
        cID = gID = 0;
    }
    public static void reSetCounterToNewFunc() {
        gID = cID; cID = 0;
    }
    public static void reSetCounterToGlobal() { cID = gID; }

    public IRRegister() {
        uID = cID++;
    }

    public IRRegister(int nop) {}

    public IRRegister(Address addr) {
        uID = cID++;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "$r" + String.valueOf(uID);
    }

}
