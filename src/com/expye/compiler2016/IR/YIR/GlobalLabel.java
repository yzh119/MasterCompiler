package com.expye.compiler2016.IR.YIR;

/**
 * Created by expye(Zihao Ye) on 2016/4/25.
 */
public class GlobalLabel extends Label {
    public static GlobalLabel globalInstance =
            new GlobalLabel("global");

    protected GlobalLabel(String label) {
        super(label);
    }
}
