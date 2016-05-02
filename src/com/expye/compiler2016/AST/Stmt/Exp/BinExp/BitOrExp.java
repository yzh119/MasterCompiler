package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.OrIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Register.IRRegister;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class BitOrExp extends BinExp {
    public BitOrExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        super.emit(lst);
        lst.add(
                new OrIns((IRRegister) this.reg, (IRRegister) lhs.reg, rhs.reg)
        );
    }
}
