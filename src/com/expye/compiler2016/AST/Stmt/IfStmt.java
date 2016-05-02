package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.ControlFlow.JumpIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Label.Label;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class IfStmt extends StmtBase {
    public Exp condition;
    public Stmt stmt1;
    public Stmt stmt2;
    Label iT, iF, end;
    public IfStmt(Exp cond, Stmt yes, Stmt no) {
        condition = cond;
        stmt1 = yes;
        stmt2 = no;
        iT = Label.ifTrueLabel();
        iF = Label.ifFalseLabel();
        end = Label.endLabel();
    }

    @Override
    public void emit(List<Instruction> lst) {
        condition.emit(lst);
        if (condition.reg instanceof Immediate) {
            boolean cond = (((Immediate) condition.reg).val != 0);
            if (cond)
                stmt1.emit(lst);
            return ;
        }
        lst.add(
                new Cbr((IRRegister) condition.reg, iT, iF)
        );
        lst.add(iT);
        if (stmt1 != null) stmt1.emit(lst);
        lst.add(new JumpIns(end));
        lst.add(iF);
        if (stmt2 != null) stmt2.emit(lst);
        lst.add(new JumpIns(end));
        lst.add(end);
    }
}
