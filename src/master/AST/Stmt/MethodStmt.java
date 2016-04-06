package Master.AST.Stmt;

import Master.AST.Dec.MethodDec;
import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class MethodStmt extends StmtBase {
    List<Exp> paraList;
    MethodDec method;
    public MethodStmt(MethodDec method, List<Exp> paraList) {
        this.method = method;
        this.paraList = paraList;
    }
}
