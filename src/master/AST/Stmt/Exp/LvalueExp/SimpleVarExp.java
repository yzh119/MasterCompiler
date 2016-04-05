package Master.AST.Stmt.Exp.LvalueExp;

import Master.Type.Name;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SimpleVarExp extends LvalueExp {
    SimpleVarExp(Type type) {
        this.type = type;
    }
}
