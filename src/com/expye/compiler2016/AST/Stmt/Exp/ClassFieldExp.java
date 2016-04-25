package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.VarDec.VarDec;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class ClassFieldExp extends Exp {
    Exp le = null;
    int offset;
    public ClassFieldExp(Exp le, String field) {
        this.le = le;
        this.type = le.type;
        this.offset = this.type.getOffset(field);
        System.out.println(this.offset);
        this.isLvalue = true;
    }

    @Override
    public void emit() {}
}
