package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.AST.Stmt.Exp.IntExp;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.SubIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.LoadImmediate;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.IRRegister;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class SubExp extends BinExp {
    public SubExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        super.emit(lst);
        if (lhs instanceof IntExp) {
            IRRegister newReg = new IRRegister();
            lst.add(
                    new LoadImmediate(newReg, (Immediate) lhs.reg)
            );
            lst.add(
                    new SubIns((IRRegister) this.reg, newReg, rhs.reg)
            );
        } else
        lst.add(
                new SubIns((IRRegister) this.reg, (IRRegister) lhs.reg, rhs.reg)
        );
    }
}
