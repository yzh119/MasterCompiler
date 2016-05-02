package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Instruction;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class ExprStmt extends StmtBase {
    Exp expr;
    public ExprStmt(Exp expr) {
        this.expr = expr;
    }

    @Override
    public void emit(List<Instruction> lst) {
        expr.emit(lst);
    }
}
