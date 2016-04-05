package Master.AST.Stmt;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;
import Master.Type.BasicType.BoolType;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class IfStmt extends StmtBase {
    Exp condition;
    Stmt stmt1, stmt2;
    IfStmt(Exp cond, Stmt yes, Stmt no) throws CompilationError {
        condition = cond;
        stmt1 = yes;
        stmt2 = no;
        if (!(condition.type instanceof BoolType))
            throw new CompilationError("Conditon must be a boolean type!");
    }
}
