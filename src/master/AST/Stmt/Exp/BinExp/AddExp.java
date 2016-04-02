package Master.AST.Stmt.Exp.BinExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;
import Master.Type.BasicType.IntType;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class AddExp extends BinExp {
    AddExp(Exp lhs, Exp rhs) throws CompilationError {
        super(lhs, rhs);
        type = lhs.type;
        if (!(type instanceof IntType) || !(rhs.type instanceof IntType))
            throw new CompilationError("Operands must be integers!");
    }
}