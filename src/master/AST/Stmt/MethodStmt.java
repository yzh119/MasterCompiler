package Master.AST.Stmt;

import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class MethodStmt extends StmtBase {
    List<Exp> paraList;
    String name;
    MethodStmt(String name, List<Exp> paraList) {
        this.name = name;
        this.paraList = paraList;
    }
}
