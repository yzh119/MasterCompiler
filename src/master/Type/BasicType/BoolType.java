package Master.Type.BasicType;

import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class BoolType extends BasicType{
    public static BoolType instance = new BoolType();

    public boolean isSuitable(Type rhs) {
        if (rhs instanceof BoolType)
            return true;
        return false;
    }
}
