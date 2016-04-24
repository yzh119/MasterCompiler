package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.AST.Stmt.Exp.IntExp;
import com.expye.compiler2016.IR.ILOC.Arithmetic.AndIns;
import com.expye.compiler2016.IR.ILOC.Arithmetic.ArithmeticImmediate.AndIIns;
import com.expye.compiler2016.IR.ILOC.Arithmetic.ArithmeticImmediate.SubIIns;
import com.expye.compiler2016.IR.ILOC.Arithmetic.SubIns;
import com.expye.compiler2016.IR.ILOC.ILOC;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class BitAndExp extends BinExp {
    public BitAndExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new ValRegister();
    }

    @Override
    public void toILOC() {
        lhs.toILOC();
        rhs.toILOC();
        if (rhs instanceof IntExp) {
            ILOC.ILOCinstance.addIns(
                    new AndIIns((ValRegister) lhs.reg, (Immediate) rhs.reg, (ValRegister) this.reg)
            );
        } else {
            ILOC.ILOCinstance.addIns(
                    new AndIns((ValRegister) lhs.reg, (ValRegister) rhs.reg, (ValRegister) this.reg)
            );
        }
    }
}
