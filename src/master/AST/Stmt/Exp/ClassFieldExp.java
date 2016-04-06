package Master.AST.Stmt.Exp;

import Master.AST.Dec.ClassDec;
import Master.AST.Dec.Dec;
import Master.AST.Stmt.Exp.Exp;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class ClassFieldExp extends Exp {
    Exp le = null;
    public List<Exp> para = null;
    String field;
    public ClassFieldExp(Exp le, String field, ClassDec type) {
        this.le = le;
        this.field = field;
        this.type = type;
        if (le.isLvalue) this.isLvalue = true;
    }
}
