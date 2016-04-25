package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.AndIns;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.Label;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LogAndExp extends BinExp {
    Label iT, end;
    public LogAndExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        iT = Label.ifTrueLabel();
        end = Label.endLabel();
        this.reg = new IRRegister();
    }

    @Override
    public void emit() {
        lhs.emit();
        YIR.YIRInstance.addIns(new Move((IRRegister) this.reg, (IRRegister) lhs.reg));
        YIR.YIRInstance.addIns(
                new Cbr((IRRegister) lhs.reg, iT, end)
        );
        YIR.YIRInstance.addIns(iT);
        rhs.emit();
        YIR.YIRInstance.addIns(new Move((IRRegister) this.reg, (IRRegister) rhs.reg));
        YIR.YIRInstance.addIns(end);
    }
}
