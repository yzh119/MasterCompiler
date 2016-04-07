package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class IntExp extends Exp{
    Integer val;
    public IntExp(Integer val) {
        this.val = val;
        this.type = ClassDec.intClass;
    }
}
