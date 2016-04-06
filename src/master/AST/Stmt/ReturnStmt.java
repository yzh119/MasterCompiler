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
    Dec backPoint = null;
    Exp ret = null;
    ReturnStmt(Dec backPoint) {
        this.backPoint = backPoint;
    }

    ReturnStmt(Dec backPoint, Exp ret) throws CompilationError {
        this.backPoint = backPoint;
        this.ret = ret;
    }
}
