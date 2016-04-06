package Master.AST.Stmt.Exp.LvalueExp;

import Master.AST.Dec.ClassDec;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class ClassFieldExp extends LvalueExp {
    LvalueExp le = null;
    String field;
    ClassFieldExp(LvalueExp le, String field, ClassDec type) {
        this.le = le;
        this.field = field;
        this.type = type;
    }
}
