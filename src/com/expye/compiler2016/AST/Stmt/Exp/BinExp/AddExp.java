package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.AddIns;
import com.expye.compiler2016.IR.YIR.Call;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.Utility;

import java.util.Arrays;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class AddExp extends BinExp {
    public AddExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        super.emit(lst);
        if (this.type == ClassDec.intClass) {
            lst.add(
                    new AddIns((IRRegister) this.reg, (IRRegister) lhs.reg, rhs.reg)
            );
        }

        if (this.type == ClassDec.stringClass) {
            lst.add(
                    new Call((IRRegister) this.reg,
                            Utility.stringConcatenate.label,
                            Arrays.asList(lhs.reg, rhs.reg))
            );
        }
    }
}
