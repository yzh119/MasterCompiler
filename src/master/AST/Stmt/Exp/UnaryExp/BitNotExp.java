package Master.AST.Stmt.Exp.UnaryExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;
import Master.Type.BasicType.BoolType;
import Master.Type.BasicType.IntType;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class BitNotExp extends UnaryExp {
    BitNotExp(Exp op) throws CompilationError {
        super(op);
        type = op.type;
        if (!(type instanceof IntType))
            throw new CompilationError("Operands don't match!");
    }
}
