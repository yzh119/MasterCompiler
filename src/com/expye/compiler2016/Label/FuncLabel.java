package com.expye.compiler2016.Label;

import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.Allocator.Allocator;

/**
 * Created by expye(Zihao Ye) on 2016/4/25.
 */
public class FuncLabel extends Label {
    public FuncDec prototype;
    public static FuncLabel originLabel = null;
    public FuncLabel(FuncDec prototype, String label) {
        super(label);
        this.prototype = prototype;
        if (label.equals("func_main")) originLabel = this;
    }

    @Override
    public String toString() {
        return label;
    }

    @Override
    public String toMIPS(Allocator alloc) {
        return label;
    }
}
