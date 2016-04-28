package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/25.
 */
public class ReturnRegister extends IRRegister {
    public static ReturnRegister returnInstance =
            new ReturnRegister();

    private ReturnRegister() {
        super();
    }

    @Override
    public String toString() {
        return "$v0";
    }
}
