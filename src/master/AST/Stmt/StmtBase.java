package Master.AST.Stmt;

import Master.Environment.Scope;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class StmtBase implements Stmt {
    public Scope currentScope = null;
}
