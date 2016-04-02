package Master.Environment;

import Master.Type.Name;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class ClassSymbol extends Symbol {
    Type classType;
    public ClassSymbol(Name name, Type type) {
        super(name);
        classType = type;
    }
}
