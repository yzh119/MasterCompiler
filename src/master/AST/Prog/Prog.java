package Master.AST.Prog;

import Master.AST.ASTnode;
import Master.AST.Dec.Dec;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class Prog implements ASTnode {
    public static Prog instance = new Prog();
    List<Dec> list;

    Prog() {

    }
}
