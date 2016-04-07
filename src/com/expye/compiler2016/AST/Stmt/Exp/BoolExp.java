package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class BoolExp extends Exp {
    Boolean val;
    public BoolExp(Boolean val) {
        this.val = val;
        this.type = ClassDec.boolClass;
    }
}