package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;
import com.expye.compiler2016.IR.ILOC.ILOC;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class BitNotExp extends UnaryExp {
    public BitNotExp(Exp op) {
        super(op);
    }

    @Override
    public void toILOC() {}
}
