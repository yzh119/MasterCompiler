package com.expye.compiler2016.Register;

/**
 * Created by expye(Zihao Ye) on 2016/4/27.
 */
public class ArgsRegister extends IRRegister {
    public static int aID = 0;
    public static void init() {
        aID = 0;
    }

    public ArgsRegister() {
        aID = aID++;
    }
}
