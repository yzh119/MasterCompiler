package Master.AST.Dec;

import Master.AST.Stmt.CompoundStmt;
import Master.AST.Stmt.Stmt;
import Master.Environment.MethodSymbol;
import Master.Environment.Scope;
import Master.Environment.VarSymbol;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class MethodDec extends DecBase {
    CompoundStmt body = new CompoundStmt();
    MethodSymbol ms = null;

    public void addBody(Stmt stmt) {
        body.addStmts(stmt);
    }

    public MethodDec(MethodSymbol ms) throws CompilationError {
        this.ms = ms;
        ms.addRef(this);
    }
}
