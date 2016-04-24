package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.Environment.Scope;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class StmtBase implements Stmt {
    public Scope currentScope = null;

    @Override
    public void toILOC() {}
}
