package Master.AST.Stmt.Exp.BinExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class BinExp extends Exp{
    public Exp lhs, rhs;

    BinExp (Exp lhs, Exp rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
