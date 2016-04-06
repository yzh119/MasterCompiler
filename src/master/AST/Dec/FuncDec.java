package Master.AST.Dec;

import Master.AST.Stmt.CompoundStmt;
import Master.AST.Stmt.Stmt;
import Master.AST.VarDec.VarDec;
import Master.Exception.CompilationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class FuncDec extends MethodDec{
    public List<Stmt> body = null;
    ClassDec retType = null;
    public FuncDec(ClassDec retType, List<VarDec> vd , List<Stmt> body, String name) {
        super(vd, body, name);
        this.retType = retType;
        this.name = name;
    }
}
