package Master.Parser;

import Master.AST.Dec.ClassDec;
import Master.AST.Dec.Dec;
import Master.AST.Dec.FuncDec;
import Master.AST.Dec.MethodDec;
import Master.AST.Prog.Prog;
import Master.Environment.*;
import Master.Exception.CompilationError;
import Master.Type.ArrayType;
import Master.Type.Name;
import Master.Type.Type;

import java.util.Stack;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class SecondListener extends MasterBaseListener {
    Stack<Scope> scopes = new Stack<>();

    @Override
    public void enterProgram(MasterParser.ProgramContext ctx) {
        scopes.add(((Prog)CST2AST.dict.get(ctx)).currentScope);
    }

    @Override
    public void enterClass_def(MasterParser.Class_defContext ctx) {
        scopes.add(((ClassDec)CST2AST.dict.get(ctx)).currentScope);
    }

    @Override
    public void exitClass_def(MasterParser.Class_defContext ctx) {
        scopes.pop();
    }

    @Override
    public void exitFunction_def(MasterParser.Function_defContext ctx) {
        Scope currentScope = scopes.peek();
        Name funcName =
                Name.getSymbolName(ctx.function_head().ID().getText());
        if (currentScope.lookUpInThisScope(funcName) != null)
            throw new CompilationError("Function name exists!");
        Type retType =
                ((ClassDec) CST2AST.dict.get(ctx.function_head().type_specifier())).cs.type;
        FuncSymbol thisSymbol = new FuncSymbol(funcName, retType);
        FuncDec now = new FuncDec(thisSymbol);

        CST2AST.dict.put(ctx, now);
        currentScope.addEntry(funcName, thisSymbol);
        now.currentScope = new Scope(currentScope);
    }

    @Override
    public void enterIntegerType(MasterParser.IntegerTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.IntegerDec);
    }

    @Override
    public void enterStringType(MasterParser.StringTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.StringDec);
    }

    @Override
    public void enterBoolType(MasterParser.BoolTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.BoolDec);
    }

    @Override
    public void enterClassType(MasterParser.ClassTypeContext ctx) {
        Scope currentScope = scopes.peek();
        Name className =
                Name.getSymbolName(ctx.ID().getText());
        Symbol inquiry = currentScope.lookUp(className);
        if (inquiry == null || !(inquiry instanceof ClassSymbol))
            throw new CompilationError("Class doesn't find!");
        CST2AST.dict.put(ctx, ((ClassSymbol) inquiry).getRef());
    }

    @Override
    public void exitArrayType(MasterParser.ArrayTypeContext ctx) {
        Type baseType =
                ((ClassDec)CST2AST.dict.get(ctx.type_specifier())).cs.type;
        CST2AST.dict.put(ctx, new ClassDec(new ClassSymbol(null, new ArrayType(baseType, ctx.LBRACKET().size()))));
    }

    @Override
    public void exitMethod_def(MasterParser.Method_defContext ctx) {
        Scope currentScope = scopes.peek();
        Name methodName =
                Name.getSymbolName(ctx.method_head().ID().getText());
        if (currentScope.lookUpInThisScope(methodName) != null)
            throw new CompilationError("method name exists!");
        MethodSymbol thisSymbol = new MethodSymbol(methodName);
        MethodDec now = new MethodDec(thisSymbol);
        CST2AST.dict.put(ctx, now);
        currentScope.addEntry(methodName, thisSymbol);
        now.currentScope = new Scope(currentScope);
    }

    @Override
    public void exitProgram(MasterParser.ProgramContext ctx) {
        scopes.pop();
    }
}
