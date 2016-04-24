package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ReturnStmt extends StmtBase {
    Exp ret = null;
    public ReturnStmt(Exp ret) {
        this.ret = ret;
    }
    public ReturnStmt() {}

    @Override
    public void toILOC() {}
}
