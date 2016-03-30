package Master.AST.Stmt;

import Master.Environment.Scope;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class StmtWithScopeAndPos {
    Scope currentScope;
    int row, col;
    Scope getCurrentScope() {
        return currentScope;
    }
    int getLine() {
        return row;
    }
    int getPositionInLine() {
        return col;
    }
}
