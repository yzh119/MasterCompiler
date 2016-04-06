package Master.AST.Dec;

import Master.AST.Stmt.CompoundStmt;
import Master.AST.Stmt.Stmt;
import Master.AST.VarDec.VarDec;
import Master.Exception.CompilationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class MethodDec extends DecBase {
    public List<Stmt> body = null;
    public List<VarDec> para = null;

    public MethodDec(List<VarDec> vd, List<Stmt> body, String name) {
        para = vd;
        this.body = body;
        this.name = name;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
