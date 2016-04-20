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
    public ClassFieldExp(Exp le, String field, ClassDec type) {
        this.le = le;
        for (int i = 0; i < le.type.declNames.size(); i++)
            if (le.type.declNames.get(i).equals(field))
                this.offset = i;
        this.type = type;
        if (le.isLvalue) this.isLvalue = true;
    }
}
