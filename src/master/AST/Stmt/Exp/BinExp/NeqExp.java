package Master.AST.Stmt.Exp.BinExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;
import Master.Type.BasicType.BoolType;
import Master.Type.BasicType.IntType;
import Master.Type.BasicType.StringType;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class NeqExp extends BinExp {
    NeqExp(Exp lhs, Exp rhs) throws CompilationError {
        super(lhs, rhs);
        type = BoolType.instance;
        if (!(lhs.type instanceof IntType && rhs.type instanceof IntType)
                && !(lhs.type instanceof StringType && rhs.type instanceof StringType))
            throw new CompilationError("Operands don't match!");
    }
}
