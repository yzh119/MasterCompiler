package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.AndIns;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class BitAndExp extends BinExp {
    public BitAndExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new IRRegister();
    }

    @Override
    public void emit() {
        super.emit();
        YIR.YIRInstance.addIns(
                new AndIns((IRRegister) this.reg, (IRRegister) lhs.reg, rhs.reg)
        );
    }
}
