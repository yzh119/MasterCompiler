package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.ControlFlow.RetIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.YIR;

import java.util.List;

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
    public void emit(List<Instruction> lst) {
        ret.emit(lst);
        lst.add(new RetIns(ret.reg));
    }
}
