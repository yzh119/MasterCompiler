package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.AST.Stmt.Exp.IntExp;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.OrIns;
import com.expye.compiler2016.IR.YIR.Call;
import com.expye.compiler2016.IR.YIR.Comp.SleIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.LoadImmediate;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Utility.Utility;

import java.util.Arrays;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LessOrEqualThanExp extends BinExp {
    public LessOrEqualThanExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        super.emit(lst);
        if (lhs.type == ClassDec.intClass) {
            if (lhs instanceof IntExp) {
                IRRegister newReg = new IRRegister();
                lst.add(
                        new LoadImmediate(newReg, (Immediate) lhs.reg)
                );
                lst.add(
                        new SleIns((IRRegister) this.reg, newReg, rhs.reg)
                );
            } else
            lst.add(
                    new SleIns((IRRegister) this.reg, (IRRegister) lhs.reg, rhs.reg)
            );
        } else {
            if (lhs.type == ClassDec.stringClass) {
                lst.add(
                        new Call((IRRegister) this.reg,
                                Utility.stringLt.label,
                                Arrays.asList(lhs.reg, rhs.reg))
                );
                IRRegister newReg = new IRRegister();
                lst.add(
                        new Call(newReg,
                                Utility.stringEq.label,
                                Arrays.asList(lhs.reg, rhs.reg))
                );
                lst.add(
                        new OrIns((IRRegister) this.reg,
                                (IRRegister) this.reg,
                                newReg)
                );
            }
        }
    }
}
