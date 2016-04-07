package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Stmt.StmtBase;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class Exp extends StmtBase {
    public boolean isLvalue = false;
    public ClassDec type = null;
}
