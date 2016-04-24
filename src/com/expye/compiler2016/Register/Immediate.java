package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Immediate extends VirtualRegister {
    public int val;

    public Immediate(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
