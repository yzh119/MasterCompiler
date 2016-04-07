package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SubscriptVarExp extends Exp {
    Exp le;
    List<Exp> offset;
    public SubscriptVarExp(Exp le, List<Exp> offset, ClassDec type) {
        this.le = le;
        this.offset = offset;
        this.type = type;
        if (le.isLvalue) this.isLvalue = true;
    }
}
