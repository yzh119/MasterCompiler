package Master.AST.Stmt.Exp.BinExp;

import Master.AST.Dec.ClassDec;
import Master.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class AssignExp extends BinExp {
    AssignExp(Exp lhs, Exp rhs, ClassDec type) {
        super(lhs, rhs, type);
    }
}
