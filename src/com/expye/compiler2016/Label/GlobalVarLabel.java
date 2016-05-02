package com.expye.compiler2016.Label;

/**
 * Created by expye(Zihao Ye) on 2016/4/30.
 */
public class GlobalVarLabel extends Label {
    public GlobalVarLabel(String label) {
        super("global_variable_" + label);
    }

    public GlobalVarLabel(int x) {
        super("str_literal_" + String.valueOf(x));
    }
    @Override
    public String toString() {
        return label;
    }
}
