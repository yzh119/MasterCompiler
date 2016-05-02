package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Instruction;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class UnaryExp extends Exp {
    Exp op;
    UnaryExp (Exp op) {
        this.op = op;
        this.type = op.type;
    }

    @Override
    public void emit(List<Instruction> lst) {
        op.emit(lst);
    }
}
