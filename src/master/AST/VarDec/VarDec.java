package Master.AST.VarDec;

import Master.AST.Dec.Dec;
import Master.AST.Stmt.Stmt;
import Master.Environment.Scope;
import Master.Environment.VarSymbol;
import Master.Type.Name;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class VarDec implements Dec, Stmt{
    public Scope currentScope = null;
    public VarSymbol vs = null;

    public VarDec(VarSymbol vs) {
        this.vs = vs;
        vs.addRef(this);
    }
}
