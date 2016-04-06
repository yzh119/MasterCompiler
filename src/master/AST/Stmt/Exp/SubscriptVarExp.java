package Master.AST.Stmt.Exp;

import Master.AST.Dec.ClassDec;
import Master.AST.Stmt.Exp.Exp;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SubscriptVarExp extends Exp {
    Exp le;
    List<Exp> offset;
    public SubscriptVarExp(Exp le, List<Exp> offset, ClassDec type) {
        this.le = le;
        this.offset = offset;
        this.type = type;
        if (le.isLvalue) this.isLvalue = true;
    }
}
