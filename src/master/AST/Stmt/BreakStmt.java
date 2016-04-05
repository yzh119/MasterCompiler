package Master.AST.Stmt;

import Master.AST.Dec.Dec;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class BreakStmt extends StmtBase {
    Stmt backPoint;
    public BreakStmt (Stmt backPoint) {
        this.backPoint = backPoint;
    }
}
