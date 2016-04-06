package Master.AST.Stmt.Exp.LvalueExp;

import Master.AST.Dec.ClassDec;
import Master.AST.Stmt.Exp.Exp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SubscriptVarExp extends LvalueExp{
    LvalueExp le;
    List<Exp> offset;
    public SubscriptVarExp(LvalueExp le, List<Exp> offset, ClassDec type) {
        this.le = le;
        this.offset = offset;
        this.type = type;
    }
}
