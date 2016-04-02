package Master.AST.Stmt.Exp;

import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class CreationExp extends Exp {
    CreationExp(Type type) {
        this.type = type;
    }
}
