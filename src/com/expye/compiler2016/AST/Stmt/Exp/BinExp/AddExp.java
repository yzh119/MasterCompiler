package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.AddIns;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class AddExp extends BinExp {
    public AddExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new IRRegister();
        /*
        String waiting to be processed!
         */
    }

    @Override
    public void emit() {
        lhs.emit();
        rhs.emit();
        if (this.type == ClassDec.intClass) {
            YIR.YIRInstance.addIns(
                    new AddIns((IRRegister) this.reg, (IRRegister) lhs.reg, rhs.reg)
            );
        }
        /*
        String waiting to be processed!
         */
    }
}
