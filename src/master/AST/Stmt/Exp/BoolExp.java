package Master.AST.Stmt.Exp;

import Master.Type.BasicType.BoolType;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class BoolExp extends Exp {
    Boolean val;
    BoolExp (Boolean val) {
        this.val = val;
        this.type = BoolType.instance;
    }
}