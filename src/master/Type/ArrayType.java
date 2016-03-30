package Master.Type;

import Master.Type.BasicType.BasicType;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ArrayType extends Type{
    BasicType type;
    int dim;

    public boolean isSuitable(Type rhs) {
        if (rhs instanceof ArrayType) {
            if (dim == ((ArrayType) rhs).dim)
                return type.isSuitable(rhs);
        }
        return false;
    }
}
