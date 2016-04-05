package Master.AST.Dec;

import Master.AST.Stmt.CompoundStmt;
import Master.AST.Stmt.Stmt;
import Master.Environment.FuncSymbol;
import Master.Environment.Scope;
import Master.Environment.VarSymbol;
import Master.Exception.CompilationError;
import Master.Type.BasicType.ClassType;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class FuncDec extends DecBase{
    CompoundStmt body = new CompoundStmt();
    public FuncSymbol fs = null;

    public void addBody(Stmt stmt) {
        body.addStmts(stmt);
    }

    public FuncDec(FuncSymbol fs) throws CompilationError {
        this.fs = fs;
        fs.addRef(this);
    }
}
