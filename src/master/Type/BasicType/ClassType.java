package Master.Type.BasicType;

import Master.Type.Name;
import Master.Type.Type;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ClassType extends BasicType{
    private Dictionary<Name, Type> member=
        new Hashtable<Name, Type>();

    public void addMember(Name name, Type type) {
        member.put(name, type);
    }
    public Type getMemberType(Name name) {
        return member.get(name);
    }

    public boolean isSuitable(Type rhs) {
        if (rhs == null || rhs == this)
            return true;
        return false;
    }
}
