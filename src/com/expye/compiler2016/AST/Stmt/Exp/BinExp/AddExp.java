package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.AST.Stmt.Exp.IntExp;
import com.expye.compiler2016.IR.ILOC.Arithmetic.AddIns;
import com.expye.compiler2016.IR.ILOC.Arithmetic.ArithmeticImmediate.AddIIns;
import com.expye.compiler2016.IR.ILOC.ILOC;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class AddExp extends BinExp {
    public AddExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new ValRegister();
        /*
        String waiting to be processed!
         */
    }

    @Override
    public void toILOC() {
        lhs.toILOC();
        rhs.toILOC();
        if (this.type == ClassDec.intClass) {
            if (rhs instanceof IntExp) {
                ILOC.ILOCinstance.addIns(
                        new AddIIns((ValRegister) lhs.reg, (Immediate) rhs.reg, (ValRegister) this.reg)
                );
            } else {
                if (lhs instanceof IntExp)
                    System.out.println("WTF!");
                ILOC.ILOCinstance.addIns(
                        new AddIns((ValRegister) lhs.reg, (ValRegister) rhs.reg, (ValRegister) this.reg)
                );
            }
        }
        /*
        String waiting to be processed!
         */
    }
}
