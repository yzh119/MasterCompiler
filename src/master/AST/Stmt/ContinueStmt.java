package Master.AST.Stmt;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ContinueStmt extends StmtBase {
    Stmt backPoint;
    public ContinueStmt(Stmt backPoint) {
        this.backPoint = backPoint;
    }
}
