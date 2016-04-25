package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.ControlFlow.Jump;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

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
    public void emit() {
        boolean noStop = false;
        if (cond.reg instanceof Immediate) {
            boolean cond = ((Immediate)this.cond.reg).val != 0;
            if (!cond) return ;
            noStop = true;
        }
        YIR.YIRInstance.addIns(ite);
        if (!noStop) cond.emit();
        if (noStop) {
            if (stmt != null) stmt.emit();
            YIR.YIRInstance.addIns(new Jump(ite));
        } else {
            YIR.YIRInstance.addIns(
                    new Cbr((IRRegister) cond.reg, iT, end)
            );
            YIR.YIRInstance.addIns(iT);
            if (stmt != null) stmt.emit();
            YIR.YIRInstance.addIns(new Jump(ite));
        }
        YIR.YIRInstance.addIns(end);
    }
}
