package Master.AST.Stmt.Exp.LvalueExp;

import Master.AST.Stmt.Exp.Exp;
import Master.Environment.VarSymbol;
import Master.Exception.CompilationError;
import Master.Type.ArrayType;
import Master.Type.BasicType.IntType;
import Master.Type.BasicType.StringType;
import Master.Type.Name;
import Master.Type.Type;

import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SubscriptVarExp extends LvalueExp{
    ArrayList<Exp> subscriptList;
    SubscriptVarExp(Type type, ArrayList<Exp> subscriptList) throws CompilationError {
        for (Exp subscript: subscriptList) {
            if (!(subscript.type instanceof IntType))
                throw new CompilationError("Subscripts in an array must be an integer!");
            if (!(type instanceof ArrayType))
                throw new CompilationError("Two many subscripts!");
            type = ((ArrayType)type).getBaseType();
        }
        this.type = type;
        this.subscriptList = subscriptList;
    }
}
