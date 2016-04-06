package Master.AST.Stmt.Exp.LvalueExp;

import Master.AST.Dec.ClassDec;
import Master.AST.VarDec.VarDec;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SimpleVarExp extends LvalueExp {
    VarDec pt;
    public SimpleVarExp(VarDec pt) {
        this.pt = pt;
    }
}
