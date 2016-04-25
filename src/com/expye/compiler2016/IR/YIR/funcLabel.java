package com.expye.compiler2016.IR.YIR;

import com.expye.compiler2016.AST.Dec.FuncDec;

/**
 * Created by expye(Zihao Ye) on 2016/4/25.
 */
public class FuncLabel extends Label {
    public FuncDec prototype;

    public FuncLabel(FuncDec prototype, String label) {
        super(label);
        this.prototype = prototype;
    }

    @Override
    public String toString() {
        return label;
    }
}
