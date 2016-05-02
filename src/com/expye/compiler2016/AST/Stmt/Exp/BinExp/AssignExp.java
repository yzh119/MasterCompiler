package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.LoadImmediate;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Utility.Utility;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class AssignExp extends BinExp {
    public AssignExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = lhs.reg;
    }

    @Override
    public void emit(List<Instruction> lst) {
        rhs.emit(lst);
        if (rhs.reg instanceof Immediate) {
            lst.add(
                    new LoadImmediate((IRRegister) lhs.reg, (Immediate) rhs.reg)
            );
        } else {
            lst.add(
                    new Move((IRRegister) lhs.reg, (IRRegister) rhs.reg)
            );
        }
        Utility.ldsdL0R1 = 0;
        lhs.emit(lst);
        Utility.ldsdL0R1 = 1;
    }
}
