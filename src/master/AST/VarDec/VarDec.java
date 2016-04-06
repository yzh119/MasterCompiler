package Master.AST.VarDec;

import Master.AST.Dec.ClassDec;
import Master.AST.Dec.Dec;
import Master.AST.Stmt.Exp.*;
import Master.AST.Stmt.Stmt;
import Master.Environment.Scope;

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
