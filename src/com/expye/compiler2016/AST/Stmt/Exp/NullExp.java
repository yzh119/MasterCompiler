package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Register.Immediate;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class NullExp extends Exp {
    public NullExp() {
        this.type = ClassDec.nullClass;
        this.reg = new Immediate(0);
    }

    @Override
    public void emit(List<Instruction> lst) {}
}
