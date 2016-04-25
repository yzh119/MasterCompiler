package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.ControlFlow.Jump;
import com.expye.compiler2016.IR.YIR.Label;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

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
    public void emit() {
        condition.emit();
        if (condition.reg instanceof Immediate) {
            boolean cond = (((Immediate) condition.reg).val != 0);
            if (cond)
                stmt1.emit();
            return ;
        }
        YIR.YIRInstance.addIns(
                new Cbr((IRRegister) condition.reg, iT, iF)
        );
        YIR.YIRInstance.addIns(iT);
        if (stmt1 != null) stmt1.emit();
        YIR.YIRInstance.addIns(new Jump(end));
        YIR.YIRInstance.addIns(iF);
        if (stmt2 != null) stmt2.emit();
        YIR.YIRInstance.addIns(new Jump(end));
        YIR.YIRInstance.addIns(end);
    }
}
