package Master.AST.Stmt.Exp.UnaryExp;

import Master.AST.Stmt.Exp.Exp;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class UnaryExp extends Exp {
    Exp op;
    UnaryExp (Exp op) {
        this.op = op;
    }
}