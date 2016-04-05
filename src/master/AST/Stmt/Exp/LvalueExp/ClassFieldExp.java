package Master.AST.Stmt.Exp.LvalueExp;

import Master.Exception.CompilationError;
import Master.Type.BasicType.ClassType;
import Master.Type.Name;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class ClassFieldExp extends LvalueExp {
    ClassFieldExp(Type ct, Name fieldName) throws CompilationError {
        if (!(ct instanceof ClassType))
            throw new CompilationError("No such field exists!");
        type = ((ClassType)ct).getMemberType(fieldName);
    }
}
