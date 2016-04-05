package Master.AST.Stmt;

import Master.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class ExprStmt extends StmtBase {
    Exp expr;
    ExprStmt(Exp expr) {
        this.expr = expr;
    }
}
