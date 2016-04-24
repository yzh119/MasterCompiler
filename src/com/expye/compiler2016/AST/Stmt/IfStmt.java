package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class IfStmt extends StmtBase {
    public Exp condition;
    public Stmt stmt1;
    public Stmt stmt2;
    public IfStmt(Exp cond, Stmt yes, Stmt no) {
        condition = cond;
        stmt1 = yes;
        stmt2 = no;
    }

    @Override
    public void toILOC() {}
}
