package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.NotIns;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LogNotExp extends UnaryExp {
    public LogNotExp(Exp op) {
        super(op);
        this.reg = new IRRegister();
    }

    @Override
    public void emit() {
        super.emit();
        YIR.YIRInstance.addIns(
                new NotIns((IRRegister) this.reg, (IRRegister) op.reg)
        );
    }
}
