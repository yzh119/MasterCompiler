package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.FuncDec;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class FuncExp extends Exp {
    List<Exp> paraList;
    FuncDec fd;
    public FuncExp(FuncDec fd, List<Exp> paraList) {
        this.fd = fd;
        this.paraList = paraList;
        this.type = fd.retType;
    }
}
