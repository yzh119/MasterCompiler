package com.expye.compiler2016.AST.Stmt;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class CompoundStmt extends StmtBase {
    List<Stmt> stmts = null;
    public CompoundStmt(List<Stmt> stmts) {
        this.stmts = stmts;
    }

    @Override
    public void emit() {
        for (Stmt stmt: stmts) {
            stmt.emit();
        }
    }
}
