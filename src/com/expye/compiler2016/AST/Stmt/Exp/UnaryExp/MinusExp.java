package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class MinusExp extends UnaryExp {
    public MinusExp(Exp op) {
        super(op);
    }

    @Override
    public void toILOC() {}
}
