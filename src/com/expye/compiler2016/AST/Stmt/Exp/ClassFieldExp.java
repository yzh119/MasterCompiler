package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class ClassFieldExp extends Exp {
    Exp le = null;
    public List<Exp> para = null;
    String field;
    public ClassFieldExp(Exp le, String field, ClassDec type) {
        this.le = le;
        this.field = field;
        this.type = type;
        if (le.isLvalue) this.isLvalue = true;
    }
}
