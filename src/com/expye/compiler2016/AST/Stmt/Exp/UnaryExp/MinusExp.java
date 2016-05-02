package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.UnaryIns.NegIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Register.IRRegister;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class MinusExp extends UnaryExp {
    public MinusExp(Exp op) {
        super(op);
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        super.emit(lst);
        lst.add(
                new NegIns((IRRegister) this.reg, (IRRegister) op.reg)
        );
    }
}
