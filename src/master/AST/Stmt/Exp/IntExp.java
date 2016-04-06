package Master.AST.Stmt.Exp;

import Master.AST.Dec.ClassDec;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class IntExp extends Exp{
    Integer val;
    public IntExp(Integer val) {
        this.val = val;
        this.type = ClassDec.intClass;
    }
}
