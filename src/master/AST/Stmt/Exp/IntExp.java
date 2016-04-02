package Master.AST.Stmt.Exp;

import Master.Type.BasicType.IntType;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class IntExp extends Exp{
    Integer val;
    IntExp (Integer val) {
        this.val = val;
        this.type = IntType.instance;
    }
}
