package Master.AST.Stmt.Exp;

import Master.AST.Dec.ClassDec;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class StringExp extends Exp {
    String val;
    public StringExp(String val) {
        this.val = val;
        this.type = ClassDec.stringClass;
    }
}
