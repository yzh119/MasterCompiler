package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.AST.Stmt.Exp.IntExp;
import com.expye.compiler2016.IR.YIR.Comp.Sle;
import com.expye.compiler2016.IR.YIR.Comp.Slt;
import com.expye.compiler2016.IR.YIR.Memory.Li;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LessExp extends BinExp {

    public LessExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new IRRegister();
    }

    @Override
    public void emit() {
        super.emit();
        if (lhs instanceof IntExp) {
            IRRegister newReg = new IRRegister();
            YIR.YIRInstance.addIns(
                    new Li(newReg, (Immediate) lhs.reg)
            );
        }
        YIR.YIRInstance.addIns(
                new Slt((IRRegister) this.reg, (IRRegister) lhs.reg, rhs.reg)
        );
    }
}
