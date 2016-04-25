package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.IR.YIR.ControlFlow.Jump;
import com.expye.compiler2016.IR.YIR.YIR;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class BreakStmt extends StmtBase {
    public IterationStmt it;
    public BreakStmt(IterationStmt it) {
        this.it = it;
    }
    @Override
    public void emit() {
        YIR.YIRInstance.addIns(new Jump(it.end));
    }
}
