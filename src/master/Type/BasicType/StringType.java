package Master.Type.BasicType;

import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class StringType extends BasicType{
    public static StringType instance = new StringType();

    public boolean isSuitable(Type rhs) {
        if (rhs instanceof StringType)
            return true;
        return false;
    }
}
