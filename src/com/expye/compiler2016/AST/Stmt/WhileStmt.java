package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class WhileStmt extends StmtBase {
    public Exp cond;
    public Stmt stmt;
    public WhileStmt(Exp cond, Stmt stmt) {
        this.cond = cond;
        this.stmt = stmt;
    }
}
