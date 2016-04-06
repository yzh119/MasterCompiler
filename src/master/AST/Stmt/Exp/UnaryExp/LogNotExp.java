package Master.AST.Stmt.Exp.UnaryExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LogNotExp extends UnaryExp {
    public LogNotExp(Exp op) {
        super(op);
    }
}
