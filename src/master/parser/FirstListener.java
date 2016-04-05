package Master.Parser;

import Master.AST.Dec.ClassDec;
import Master.AST.Prog.Prog;
import Master.Environment.ClassSymbol;
import Master.Environment.FuncSymbol;
import Master.Environment.MethodSymbol;
import Master.Environment.Scope;
import Master.Exception.CompilationError;
import Master.Type.BasicType.ClassType;
import Master.Type.BasicType.IntType;
import Master.Type.BasicType.StringType;
import Master.Type.Name;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Stack;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class FirstListener extends MasterBaseListener {
    Stack<Scope> scopes = new Stack<>();

    @Override
    public void enterProgram(MasterParser.ProgramContext ctx) {
        Prog now = new Prog();
        Scope globalScope = new Scope(null);
        scopes.add(globalScope);
        now.currentScope = globalScope;
        CST2AST.dict.put(ctx, now);
        now.currentScope.addEntry(
                Name.getSymbolName("print"), new MethodSymbol(Name.getSymbolName("print"))
        );
        now.currentScope.addEntry(
                Name.getSymbolName("println"), new MethodSymbol(Name.getSymbolName("println"))
        );
        now.currentScope.addEntry(
                Name.getSymbolName("getString"), new FuncSymbol(Name.getSymbolName("getString"), StringType.instance)
        );
        now.currentScope.addEntry(
                Name.getSymbolName("getInt"), new FuncSymbol(Name.getSymbolName("getInt"), IntType.instance)
        );
    }

    @Override
    public void exitProgram(MasterParser.ProgramContext ctx) {
        scopes.pop();
    }

    @Override
    public void enterClass_def(MasterParser.Class_defContext ctx) {
        Scope currentScope = scopes.peek();
        Name className = Name.getSymbolName(ctx.ID().getText());

        if (currentScope.lookUpInThisScope(className) != null)
            throw new CompilationError("Class already defined!");

        ClassType newClassType = new ClassType();
        ClassSymbol thisSymbol = new ClassSymbol(
                className, newClassType
        );

        currentScope.addEntry(className, thisSymbol);

        ClassDec now = new ClassDec(thisSymbol);
        scopes.add(now.currentScope = new Scope(currentScope));
        CST2AST.dict.put(ctx, now);
    }

    @Override
    public void exitClass_def(MasterParser.Class_defContext ctx) {
        scopes.pop();
    }
}
