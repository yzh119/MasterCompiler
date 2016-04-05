package Master.AST.Stmt;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;
import Master.Type.BasicType.BoolType;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class WhileStmt extends StmtBase {
    Exp cond;
    Stmt stmt;
    WhileStmt(Exp cond, Stmt stmt) throws CompilationError {
        this.cond = cond;
        this.stmt = stmt;
        if (!(cond.type instanceof BoolType))
            throw new CompilationError("Conditon must be a boolean type!");
    }
}
