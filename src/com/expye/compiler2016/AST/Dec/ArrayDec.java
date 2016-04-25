package com.expye.compiler2016.AST.Dec;

import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.Utility;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class ArrayDec extends ClassDec{
    /*
    public static ArrayDec arrayClass =
            new ArrayDec(null, -1);
            */

    public ClassDec baseType;
    public int dim;
    public ArrayDec(ClassDec baseType, int dim) {
        super(null);
        this.baseType = baseType;
        this.dim = dim;
        this.currentScope = new Scope(null);
        this.currentScope.addEntry("size", Utility.sizeDec);
    }

    @Override
    public String toString() {
        return baseType.toString() + String.valueOf(dim);
    }

    @Override
    public void emit() {}
}
