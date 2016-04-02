package Master.Environment;

import Master.Type.Name;
import Master.Type.Type;

import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */

public class FuncSymbol extends MethodSymbol {
    Type retType;
    public FuncSymbol(Name name, Type retType) {
        super(name);
        this.retType = retType;
    }
}
