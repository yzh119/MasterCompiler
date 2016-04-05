package Master.AST.Stmt;

import Master.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ForStmt extends StmtBase {
    Exp exp1, exp2, exp3;
    Stmt stmt;
    ForStmt(Exp exp1, Exp exp2, Exp exp3, Stmt stmt) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
        this.stmt = stmt;
    }
}
