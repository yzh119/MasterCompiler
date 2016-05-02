package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.IR.YIR.ControlFlow.JumpIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.YIR;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class BreakStmt extends StmtBase {
    public IterationStmt it;
    public BreakStmt(IterationStmt it) {
        this.it = it;
    }
    @Override
    public void emit(List<Instruction> lst) {
        lst.add(new JumpIns(it.end));
    }
}
