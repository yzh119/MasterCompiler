package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ForStmt extends StmtBase {
    public Exp exp1;
    public Exp exp2;
    public Exp exp3;
    public Stmt stmt;
    public ForStmt(Exp exp1, Exp exp2, Exp exp3, Stmt stmt) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
        this.stmt = stmt;
    }
}
