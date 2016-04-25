package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class BoolExp extends Exp {
    public Boolean val;
    public BoolExp(Boolean val) {
        this.val = val;
        this.type = ClassDec.boolClass;
        this.reg = new Immediate((val) ? 1: 0);
    }

    @Override
    public void emit() {}
}