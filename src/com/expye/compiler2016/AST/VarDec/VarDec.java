package com.expye.compiler2016.AST.VarDec;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.Dec;
import com.expye.compiler2016.AST.Stmt.Exp.*;
import com.expye.compiler2016.AST.Stmt.Stmt;
import com.expye.compiler2016.Environment.Scope;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class VarDec implements Dec, Stmt{
    public Scope currentScope = null;
    public ClassDec cd;
    String name;
    public Exp init = new NullExp();
    public VarDec(ClassDec cd, String name) {
        this.cd = cd;
        this.name = name;
        if (cd == ClassDec.intClass)
            init = new IntExp(0);
        if (cd == ClassDec.stringClass)
            init = new StringExp("");
        if (cd == ClassDec.stringClass)
            init = new BoolExp(false);
    }

    public VarDec(ClassDec cd, String name, Exp init) {
        this.cd = cd;
        this.name = name;
        this.init = init;
    }

    @Override
    public String getName() {
        return name;
    }
}
