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
        offset = 0;
        for (VarDec elem: le.type.declElems) {
            if (elem.getName().equals(field))
                break;
            if (elem.cd == ClassDec.boolClass)
                offset++;
            else
                offset += 4;
        }
        this.type = type;
        this.isLvalue = true;
    }

    @Override
    public void toILOC() {}
}
