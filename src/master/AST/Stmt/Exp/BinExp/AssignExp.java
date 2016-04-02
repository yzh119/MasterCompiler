package Master.AST.Stmt.Exp.BinExp;

import Master.AST.Stmt.Exp.Exp;
import Master.AST.Stmt.Exp.LvalueExp.LvalueExp;
import Master.Exception.CompilationError;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class AssignExp extends BinExp {
    AssignExp(Exp lhs, Exp rhs) throws CompilationError {
        super(lhs, rhs);
        type = lhs.type;
        if (!(lhs instanceof LvalueExp))
            throw new CompilationError("Only lvalue can be assigned!");
        if (!(lhs.type.isSuitable(rhs.type)))
            throw new CompilationError("Operans don't match!");
    }
}
