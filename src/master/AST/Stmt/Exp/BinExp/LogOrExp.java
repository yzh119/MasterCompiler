package Master.AST.Stmt.Exp.BinExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;
import Master.Type.BasicType.BoolType;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class LogOrExp extends BinExp {
    LogOrExp(Exp lhs, Exp rhs) throws CompilationError {
        super(lhs, rhs);
        type = lhs.type;
        if (!(type instanceof BoolType && rhs.type instanceof BoolType))
            throw new CompilationError("Operands don't match!");
    }
}
