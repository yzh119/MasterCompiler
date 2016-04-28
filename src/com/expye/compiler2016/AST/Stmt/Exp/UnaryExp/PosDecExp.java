package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.AddIns;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class PosDecExp extends UnaryExp {
    public PosDecExp(Exp op) {
        super(op);
        this.reg = new IRRegister();
    }

    @Override
    public void emit() {
        super.emit();
        YIR.YIRInstance.addIns(
                new Move((IRRegister) this.reg, (IRRegister) op.reg)
        );
        YIR.YIRInstance.addIns(
                new AddIns((IRRegister) op.reg, (IRRegister) op.reg, new Immediate(-1))
        );

        if (((IRRegister)op.reg).addr != null) {
            YIR.YIRInstance.addIns(
                    new Store((IRRegister) op.reg, ((IRRegister) op.reg).addr)
            );
        }
    }
}
