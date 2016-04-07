package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class ExprStmt extends StmtBase {
    Exp expr;
    public ExprStmt(Exp expr) {
        this.expr = expr;
    }
}
