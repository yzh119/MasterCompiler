package com.expye.compiler2016.AST.Stmt;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class BreakStmt extends StmtBase {
    public IterationStmt it;
    public BreakStmt(IterationStmt it) {
        this.it = it;
    }
    @Override
    public void toILOC() {}
}
