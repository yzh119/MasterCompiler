package Master.AST.Prog;

import Master.AST.ASTnode;
import Master.AST.Dec.Dec;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class Prog implements ASTnode {
    public static Prog instance = new Prog();
    List<Dec> list;
/*
    @Override
    public boolean check() {
        return list
                .stream()
                .map(ASTnode::check)
                .reduce(true, (a, b)-> a && b);
    }*/
}
