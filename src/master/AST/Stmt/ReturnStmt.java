package Master.AST.Stmt;

import Master.AST.Dec.Dec;
import Master.AST.Dec.FuncDec;
import Master.AST.Dec.MethodDec;
import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ReturnStmt extends StmtBase {
    Exp ret = null;
    public ReturnStmt(Exp ret) {
        this.ret = ret;
    }
    public ReturnStmt() {}
}
