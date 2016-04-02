package Master.AST.Stmt.Exp.UnaryExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;
import Master.Type.BasicType.BoolType;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LogNotExp extends UnaryExp {
    LogNotExp (Exp op) throws CompilationError {
        super(op);
        type = op.type;
        if (!(type instanceof BoolType))
            throw new CompilationError("Operands don't match!");
    }
}
