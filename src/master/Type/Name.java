package Master.Type;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class Name {
    String name;
    private static Map<String, Name> dict
            = new HashMap<>();

    private Name(String text) { name = text; }
    public static Name getSymbolName(String text) {
        Name s = dict.get(text);
        if (s == null) {
            s = new Name(text);
            dict.put(text, s);
        }
        return s;
    }
}
