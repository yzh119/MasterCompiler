package com.expye.compiler2016.Register;

import com.expye.compiler2016.IR.YIR.GlobalLabel;

/**
 * Created by expye(Zihao Ye) on 2016/4/27.
 */
public class GlobalRegister extends IRRegister {
    public static int gID = 0;

    public static void nit() {
        gID = 0;
    }

    public GlobalRegister() {
        cID = gID++;
    }

    public GlobalRegister(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "$g" + gID;
    }
}
