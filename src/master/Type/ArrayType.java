package Master.Type;

import Master.Exception.CompilationError;
import Master.Type.BasicType.BasicType;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ArrayType extends Type{
    Type baseType;

    public boolean isSuitable(Type rhs) {
        if (rhs instanceof ArrayType)
            return baseType.isSuitable(((ArrayType) rhs).baseType);
        if (rhs == null) return true;
        return false;
    }

    public Type getBaseType() {
        return baseType;
    }

    public ArrayType(Type type, int dim) {
        if (dim == 1)
            baseType = type;
        else {
            baseType = new ArrayType(type, dim - 1);
        }
    }
}
