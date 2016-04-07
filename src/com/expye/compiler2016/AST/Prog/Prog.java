package com.expye.compiler2016.AST.Prog;

import com.expye.compiler2016.AST.ASTnode;
import com.expye.compiler2016.AST.Dec.Dec;
import com.expye.compiler2016.Environment.Scope;

import java.util.ArrayList;
import java.util.List;

/**
* Created by expye(Zihao Ye) on 2016/3/30.
        */
public class Prog implements ASTnode {
    public List<Dec> list = new ArrayList<>();
    public Scope currentScope = new Scope(null);
}
