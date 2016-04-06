package Master.AST.Stmt.Exp.BinExp;

import Master.AST.Dec.ClassDec;
import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class EqExp extends BinExp {
    public EqExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
    }
}
