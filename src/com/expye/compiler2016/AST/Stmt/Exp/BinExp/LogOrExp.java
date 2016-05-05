package com.expye.compiler2016.AST.Stmt.Exp.BinExp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.ControlFlow.JumpIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.LoadImmediate;
import com.expye.compiler2016.Label.Label;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LogOrExp extends BinExp {
    public static Label recentFalse = null;
    Label iT, end;
    public LogOrExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
        iT = Label.ifTrueLabel();
        end = Label.endLabel();
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        boolean emitEnd = false;
        if (recentFalse == null) {recentFalse = Label.ifFalseLabel(); emitEnd = true;}
        Label tmp = recentFalse;
        if (!(lhs instanceof LogAndExp)) {
            recentFalse = null;
        }
        lhs.emit(lst);
        recentFalse = tmp;
        lst.add(new Move((IRRegister) this.reg, (IRRegister) lhs.reg));
        lst.add(
                new Cbr((IRRegister) lhs.reg, recentFalse, iT)
        );
        lst.add(iT);
        rhs.emit(lst);
        lst.add(new Move((IRRegister) this.reg, (IRRegister) rhs.reg));
        lst.add(new JumpIns(end));
        if (emitEnd) {
            lst.add(recentFalse);
            lst.add(new LoadImmediate((IRRegister) this.reg, new Immediate(1)));
            recentFalse = null;
        }
        lst.add(end);
    }
}
