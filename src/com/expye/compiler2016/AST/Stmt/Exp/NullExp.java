package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class NullExp extends Exp {
    public NullExp() {
        this.type = ClassDec.nullClass;
    }
}
