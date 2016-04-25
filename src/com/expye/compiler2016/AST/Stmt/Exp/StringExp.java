package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class StringExp extends Exp {
    public String val;
    public StringExp(String val) {
        this.val = val;
        this.type = ClassDec.stringClass;

        //this.reg = new Address();

        /*
            Wait to be done!
        */
    }

    @Override
    public void emit() {}
}
