package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.AddIns;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class PreIncExp extends UnaryExp {
    public PreIncExp(Exp op) {
        super(op);
    }

    @Override
    public void emit() {
        op.emit();
        YIR.YIRInstance.addIns(
                new AddIns((IRRegister) op.reg, (IRRegister) op.reg, new Immediate(1))
        );

        this.reg = op.reg;
    }
}
