package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.NegIns;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class MinusExp extends UnaryExp {
    public MinusExp(Exp op) {
        super(op);
        this.reg = new IRRegister();
    }

    @Override
    public void emit() {
        op.emit();
        YIR.YIRInstance.addIns(
                new NegIns((IRRegister) this.reg, (IRRegister) op.reg)
        );
    }
}
