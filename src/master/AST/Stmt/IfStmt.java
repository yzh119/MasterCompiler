package Master.AST.Stmt;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class IfStmt extends StmtBase {
    public Exp condition;
    public Stmt stmt1;
    public Stmt stmt2;
    public IfStmt(Exp cond, Stmt yes, Stmt no) {
        condition = cond;
        stmt1 = yes;
        stmt2 = no;
    }
}
