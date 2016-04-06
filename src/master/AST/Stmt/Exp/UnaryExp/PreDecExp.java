package Master.AST.Stmt.Exp.UnaryExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class PreDecExp extends UnaryExp {
    public PreDecExp(Exp op) {
        super(op);
    }
}
