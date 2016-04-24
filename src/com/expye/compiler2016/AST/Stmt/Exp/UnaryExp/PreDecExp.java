package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class PreDecExp extends UnaryExp {
    public PreDecExp(Exp op) {
        super(op);
    }

    @Override
    public void toILOC() {}
}
