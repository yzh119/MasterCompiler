package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Instruction;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class BinExp extends Exp {
    public Exp lhs, rhs;

    BinExp (Exp lhs, Exp rhs, ClassDec type) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.type = type;
    }

    @Override
    public void emit(List<Instruction> lst) {
        lhs.emit(lst);
        rhs.emit(lst);
    }
}
