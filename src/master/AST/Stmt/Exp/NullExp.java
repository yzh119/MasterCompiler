package Master.AST.Stmt.Exp;

import Master.AST.Dec.ClassDec;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class NullExp extends Exp {
    public NullExp() {
        this.type = ClassDec.nullClass;
    }
}
