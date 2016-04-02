package Master.Parser;

import java.util.Arrays;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class ASTconstructor {
    public static List<String>
            reservers =
                    Arrays.asList(
                            "if"
                            ,   "else"
                            ,   "break"
                            ,   "return"
                            ,   "continue"
                            ,   "while"
                            ,   "for"
                            ,   "new"
                            ,   "extends"
                            ,   "this"
                            ,   "void"
                            ,   "class"
                            ,   "null"
                            ,   "true"
                            ,   "false"
                    ),

            basicType =
                    Arrays.asList(
                            "int"
                            ,   "string"
                            ,   "bool"
                    );


}
