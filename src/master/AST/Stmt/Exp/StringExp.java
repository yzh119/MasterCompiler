package Master.AST.Stmt.Exp;

import Master.Type.BasicType.StringType;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class StringExp extends Exp {
    String val;
    StringExp (String val) {
        this.val = val;
        this.type = StringType.instance;
    }
}
