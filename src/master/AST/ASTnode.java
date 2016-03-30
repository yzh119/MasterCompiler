package Master.AST;

import Master.Environment.Scope;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */

public interface ASTnode {
    boolean check();
    void translate();
    int getLine();
    int getPositionInLine();
    Scope getCurrentScope();
}
