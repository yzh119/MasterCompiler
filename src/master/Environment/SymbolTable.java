package Master.Environment;

import Master.Type.Name;
import Master.Type.Type;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

/**
 * Created by expye(Zihao Ye) on 2016/4/2.
 */
public class SymbolTable {
    public static Map<Name, Stack<Symbol>> dict =
            new HashMap<>();
    public static Stack<HashSet<Symbol>> scopes =
            new Stack<>();

    public void beginScope() {
        scopes.push(new HashSet<Symbol>());
    }

    public void endScope() {
        HashSet <Symbol> peek = scopes.peek();
        for (Symbol symbol: peek) {
            dict.get(symbol.name).pop();
        }
    }

    public static Stack<Symbol> resolve(Name name) {
        Stack<Symbol> ret = dict.get(name);
        if (ret == null) {
            ret = new Stack<>();
        }
        return ret;
    }

    public static void addVariable(Name name, Type type) {
        Symbol newVariable = new VarSymbol(name, type);
        scopes.peek().add(newVariable);
        dict.get(name).push(newVariable);
    }

    public static void addClass(Name name, Type type) {
        Symbol newClass = new ClassSymbol(name, type);
        scopes.peek().add(newClass);
        dict.get(name).push(newClass);
    }

    public static void addFunc(Name name, Type retType) {
        Symbol newFunc = new FuncSymbol(name, retType);
        scopes.peek().add(newFunc);
        dict.get(name).push(newFunc);
    }

    public static void addMethod(Name name) {
        Symbol newMethod = new MethodSymbol(name);
        scopes.peek().add(newMethod);
        dict.get(name).push(newMethod);
    }
}
