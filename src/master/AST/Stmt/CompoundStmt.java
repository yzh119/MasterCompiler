package Master.AST.Stmt;

import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class CompoundStmt extends StmtBase {
    ArrayList<Stmt> stmts = new ArrayList<>();
    public void addStmts(Stmt newStmt) {
        stmts.add(newStmt);
    }

    public CompoundStmt() {
        updateScope();
    }

    void updateScope() {

    }
}
