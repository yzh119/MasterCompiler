package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.StmtBase;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class Exp extends StmtBase {
    public VirtualRegister reg;
    public boolean isLvalue = false;
    public ClassDec type = null;

    @Override
    public void emit() {}
}
