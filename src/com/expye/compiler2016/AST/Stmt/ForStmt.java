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
public class ForStmt extends IterationStmt {
    public Exp exp1;
    public Exp exp2;
    public Exp exp3;
    public Stmt stmt;
    public ForStmt(Exp exp1, Exp exp2, Exp exp3, Stmt stmt) {
        super();
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
        this.stmt = stmt;
        this.iM = Label.ifMergeLabel();
    }

    @Override
    public void emit(List<Instruction> lst) {
        if (exp1 != null) exp1.emit(lst);
        boolean noStop = false;
        if (exp2 == null) noStop = true;
        if (exp2 != null && exp2.reg instanceof Immediate) {
            boolean cond = ((Immediate)exp2.reg).val != 0;
            if (!cond) return ;
            noStop = true;
        }

        lst.add(ite);
        if (!noStop) exp2.emit(lst);

        if (noStop) {
            if (stmt != null) stmt.emit(lst);
            lst.add(iM);
            if (exp3 != null) exp3.emit(lst);
            lst.add(new JumpIns(ite));
        } else {
            lst.add(
                    new Cbr((IRRegister) exp2.reg, iT, end)
            );
            lst.add(iT);
            if (stmt != null) stmt.emit(lst);
            lst.add(iM);
            if (exp3 != null) exp3.emit(lst);
            lst.add(new JumpIns(ite));
        }
        lst.add(end);
    }
}
