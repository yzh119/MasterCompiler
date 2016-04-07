package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.VarDec.VarDec;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SimpleVarExp extends Exp {
    VarDec pt;
    public SimpleVarExp(VarDec pt) {
        this.pt = pt;
        this.type = pt.cd;
        this.isLvalue = true;
    }
}
