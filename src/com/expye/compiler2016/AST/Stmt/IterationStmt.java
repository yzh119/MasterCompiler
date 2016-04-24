package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.StmtBase;
import com.expye.compiler2016.IR.ILOC.Label;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class IterationStmt extends StmtBase {
    Label label;
    IterationStmt() {
        label = Label.iterationLabel();
    }
}
