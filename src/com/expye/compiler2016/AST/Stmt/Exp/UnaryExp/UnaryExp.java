package com.expye.compiler2016.AST.Stmt.Exp.UnaryExp;

import com.expye.compiler2016.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class UnaryExp extends Exp {
    Exp op;
    UnaryExp (Exp op) {
        this.op = op;
        this.type = op.type;
    }
}
