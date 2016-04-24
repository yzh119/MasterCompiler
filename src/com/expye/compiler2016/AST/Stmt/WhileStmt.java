package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.ILOC.Label;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class WhileStmt extends IterationStmt {
    public Exp cond;
    public Stmt stmt;
    public WhileStmt(Exp cond, Stmt stmt) {
        super();
        this.cond = cond;
        this.stmt = stmt;
    }

    @Override
    public void toILOC() {}
}
