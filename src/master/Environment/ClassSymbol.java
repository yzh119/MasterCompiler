package Master.Environment;

import Master.AST.Dec.Dec;
import Master.Type.BasicType.BasicType;
import Master.Type.BasicType.ClassType;
import Master.Type.BasicType.IntType;
import Master.Type.BasicType.StringType;
import Master.Type.Name;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class ClassSymbol extends Symbol {
    public static ClassSymbol IntClassSymbol
            = new ClassSymbol(null, IntType.instance);
    public static ClassSymbol StringClassSymbol
            = new ClassSymbol(null, StringType.instance);
    public static ClassSymbol BoolClassSymbol
            = new ClassSymbol(null, StringType.instance);

    public Type type;
    public ClassSymbol(Name name, Type type) {
        super(name);
        this.type = type;
    }

    public Dec getRef() {
        return ref;
    }
}
