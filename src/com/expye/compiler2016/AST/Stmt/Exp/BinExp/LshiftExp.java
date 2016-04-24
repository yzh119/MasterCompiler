package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.AST.Stmt.Exp.IntExp;
import com.expye.compiler2016.IR.ILOC.Arithmetic.ArithmeticImmediate.LShiftIIns;
import com.expye.compiler2016.IR.ILOC.Arithmetic.ArithmeticImmediate.SubIIns;
import com.expye.compiler2016.IR.ILOC.Arithmetic.LShiftIns;
import com.expye.compiler2016.IR.ILOC.Arithmetic.SubIns;
import com.expye.compiler2016.IR.ILOC.ILOC;
import com.expye.compiler2016.IR.ILOC.Memory.LoadI;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.ValRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LshiftExp extends BinExp {
    public LshiftExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new ValRegister();
    }

    @Override
    public void toILOC() {
        lhs.toILOC();
        rhs.toILOC();
        if (rhs instanceof IntExp) {
            ILOC.ILOCinstance.addIns(
                    new LShiftIIns((ValRegister) lhs.reg, (Immediate) rhs.reg, (ValRegister) this.reg)
            );
        } else {
            if (lhs instanceof IntExp) {
                ValRegister newReg = new ValRegister();
                ILOC.ILOCinstance.addIns(
                        new LoadI((Immediate) lhs.reg, newReg)
                );
            }
            ILOC.ILOCinstance.addIns(
                    new LShiftIns((ValRegister) lhs.reg, (ValRegister) rhs.reg, (ValRegister) this.reg)
            );
        }
    }
}
