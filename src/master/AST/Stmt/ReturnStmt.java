package Master.AST.Stmt;

import Master.AST.Dec.Dec;
import Master.AST.Dec.FuncDec;
import Master.AST.Dec.MethodDec;
import Master.AST.Stmt.Exp.Exp;
import Master.Exception.CompilationError;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ReturnStmt extends StmtBase {
    Dec backPoint = null;
    Exp ret = null;
    ReturnStmt(Dec backPoint) throws CompilationError {
        this.backPoint = backPoint;
        if (backPoint instanceof FuncDec)
            throw new CompilationError("You can return void in a function!");
    }

    ReturnStmt(Dec backPoint, Exp ret) throws CompilationError {
        this.backPoint = backPoint;
        if (!(backPoint instanceof FuncDec))
            throw new CompilationError("You can return values in a method!");
        this.ret = ret;
        if (((FuncDec)backPoint).fs.getRetType().isSuitable(ret.type))
            throw new CompilationError("Return value doesn't match!");
    }
}
