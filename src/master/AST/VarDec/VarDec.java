package Master.AST.VarDec;

import Master.AST.Dec.ClassDec;
import Master.AST.Dec.Dec;
import Master.AST.Stmt.Stmt;
import Master.Environment.Scope;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class VarDec implements Dec, Stmt{
    public Scope currentScope = null;
    public ClassDec cd;
    String name;

    public VarDec(ClassDec cd, String name) {
        this.cd = cd;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
