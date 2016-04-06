package Master.AST.Stmt;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class WhileStmt extends StmtBase {
    public Exp cond;
    public Stmt stmt;
    public WhileStmt(Exp cond, Stmt stmt) {
        this.cond = cond;
        this.stmt = stmt;
    }
}
