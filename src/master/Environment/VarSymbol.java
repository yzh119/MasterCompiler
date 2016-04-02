package Master.Environment;

import Master.Type.Name;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class VarSymbol extends Symbol {
    Type type;
    public VarSymbol(Name name, Type type) {
        super(name);
        this.type = type;
    }
}
