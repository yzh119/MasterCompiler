package Master.AST.Stmt;

import Master.AST.Dec.MethodDec;
import Master.AST.Stmt.Exp.Exp;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class FieldMethodStmt extends StmtBase {
    Exp lhs;
    String field;
    public static List<Exp> para = null;
    public FieldMethodStmt(Exp lhs, String field) {
        this.lhs = lhs;
        this.field = field;
    }
}
