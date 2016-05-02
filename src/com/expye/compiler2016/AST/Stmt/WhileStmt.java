package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.ControlFlow.JumpIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class WhileStmt extends IterationStmt {
    public Exp cond;
    public Stmt stmt;
    public WhileStmt(Exp cond, Stmt stmt) {
        super();
        this.cond = cond;
        this.stmt = stmt;
        this.iM = this.ite;
    }

    @Override
    public void emit(List<Instruction> lst) {
        boolean noStop = false;
        if (cond.reg instanceof Immediate) {
            boolean cond = ((Immediate)this.cond.reg).val != 0;
            if (!cond) return ;
            noStop = true;
        }
        lst.add(ite);
        if (!noStop) cond.emit(lst);
        if (noStop) {
            if (stmt != null) stmt.emit(lst);
            lst.add(new JumpIns(ite));
        } else {
            lst.add(
                    new Cbr((IRRegister) cond.reg, iT, end)
            );
            lst.add(iT);
            if (stmt != null) stmt.emit(lst);
            lst.add(new JumpIns(ite));
        }
        lst.add(end);
    }
}
