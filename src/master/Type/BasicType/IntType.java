package Master.Type.BasicType;

import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class IntType extends BasicType {
    public static IntType instance = new IntType();

    public boolean isSuitable(Type rhs) {
        if (rhs instanceof IntType)
            return true;
        return false;
    }

}
