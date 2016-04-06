package Master.AST.Prog;

import Master.AST.ASTnode;
import Master.AST.Dec.Dec;
import Master.Environment.Scope;

import java.util.ArrayList;
import java.util.List;

/**
* Created by expye(Zihao Ye) on 2016/3/30.
        */
public class Prog implements ASTnode {
    public List<Dec> list = new ArrayList<>();
    public Scope currentScope = new Scope(null);
}
