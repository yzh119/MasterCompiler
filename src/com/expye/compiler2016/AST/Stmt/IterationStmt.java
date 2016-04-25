package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.IR.YIR.Label;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class IterationStmt extends StmtBase {
    public Label ite, iT, end, iM;
    IterationStmt() {
        this.ite = Label.beginLabel();
        this.iT = Label.ifTrueLabel();
        this.end = Label.endLabel();
    }

    @Override
    public void emit() {
        super.emit();
    }
}
