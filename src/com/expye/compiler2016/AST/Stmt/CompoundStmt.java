package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.IR.YIR.Instruction;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class CompoundStmt extends StmtBase {
    public List<Stmt> stmts = null;
    public CompoundStmt(List<Stmt> stmts) {
        this.stmts = stmts;
    }

    @Override
    public void emit(List<Instruction> lst) {
        for (Stmt stmt: stmts) {
            stmt.emit(lst);
        }
    }
}
