package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class SubExp extends BinExp {
    public SubExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
    }
}
