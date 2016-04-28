package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Memory.Li;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Utility;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class AssignExp extends BinExp {
    public AssignExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = lhs.reg;
    }

    @Override
    public void emit() {
        rhs.emit();
        if (rhs.reg instanceof Immediate) {
            YIR.YIRInstance.addIns(
                    new Li((IRRegister) lhs.reg, (Immediate) rhs.reg)
            );
        } else {
            YIR.YIRInstance.addIns(
                    new Move((IRRegister) lhs.reg, (IRRegister) rhs.reg)
            );
        }
        Utility.ldsdL0R1 = 0;
        lhs.emit();
        Utility.ldsdL0R1 = 1;
    }
}
