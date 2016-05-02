package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.AddIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class PosDecExp extends UnaryExp {
    public PosDecExp(Exp op) {
        super(op);
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        super.emit(lst);
        lst.add(
                new Move((IRRegister) this.reg, (IRRegister) op.reg)
        );
        lst.add(
                new AddIns((IRRegister) op.reg, (IRRegister) op.reg, new Immediate(-1))
        );

        if (((IRRegister)op.reg).addr != null) {
            lst.add(
                    new Store((IRRegister) op.reg, ((IRRegister) op.reg).addr)
            );
        }
    }
}
