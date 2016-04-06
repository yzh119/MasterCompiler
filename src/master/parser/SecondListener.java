package Master.Parser;

import Master.AST.ASTnode;
import Master.AST.Dec.ArrayDec;
import Master.AST.Dec.ClassDec;
import Master.AST.Dec.FuncDec;
import Master.AST.Dec.MethodDec;
import Master.AST.Prog.Prog;
import Master.AST.VarDec.VarDec;
import Master.Environment.*;
import Master.Exception.CompilationError;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class SecondListener extends BaseListener {
    private Stack<Scope> scopes = new Stack<>();

    @Override
    public void enterProgram(MasterParser.ProgramContext ctx) {
        scopes.add(((Prog)CST2AST.dict.get(ctx)).currentScope);
    }

    @Override
    public void exitProgram(MasterParser.ProgramContext ctx) {
        scopes.pop();
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
    public void enterIntegerType(MasterParser.IntegerTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.intClass);
    }

    @Override
    public void enterStringType(MasterParser.StringTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.stringClass);
    }

    @Override
    public void enterBoolType(MasterParser.BoolTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.boolClass);
    }

    @Override
    public void enterClassType(MasterParser.ClassTypeContext ctx) {
        Scope currentScope = scopes.peek();
        String className =
                ctx.ID().getText().intern();
        ASTnode thisClass = currentScope.lookUp(className);
        if (thisClass == null)
            throw new CompilationError(currentPlace + "Type not defined!");
        if (!(thisClass instanceof ClassDec))
            throw new CompilationError(currentPlace + "It's not a class type!");
        CST2AST.dict.put(ctx, thisClass);
    }

    @Override
    public void exitArrayType(MasterParser.ArrayTypeContext ctx) {
        Scope currentScope = scopes.peek();
        ASTnode type = CST2AST.dict.get(ctx.type_specifier());
        if (type == null)
            throw new CompilationError("Something happened unfortunately!");
        ClassDec baseType = (ClassDec)type;
        int dim = ctx.LBRACKET().size();
        ArrayDec now = new ArrayDec(baseType, dim);
        CST2AST.dict.put(ctx, now);
    }

    @Override
    public void exitFunction_def(MasterParser.Function_defContext ctx) {
        Scope currentScope = scopes.peek();
        String funcName =
                ctx.ID().getText().intern();
        ASTnode thisFunc = currentScope.lookUpInThisScope(funcName);
        if (thisFunc != null)
            throw new CompilationError(currentPlace + "This function name has been used!");

        ASTnode type = CST2AST.dict.get(ctx.type_specifier());
        if (type == null)
            throw new CompilationError("Something happened unfortunately!");

        ClassDec retType = (ClassDec)type;
        List<VarDec> paraList = new ArrayList<>();
        if (ctx.parameter_list() != null)
            for (MasterParser.Parameter_declContext paraDecl: ctx.parameter_list().parameter_decl()) {
                type = CST2AST.dict.get(paraDecl.type_specifier());
                if (type == null)
                    throw new CompilationError("Something happened unfortunately!");
                paraList.add(new VarDec((ClassDec)type, paraDecl.ID().getText().intern()));
            }
        FuncDec now = new FuncDec(retType, paraList, null, funcName);
        CST2AST.dict.put(ctx, now);
        now.currentScope = new Scope(currentScope);
        for (VarDec para: paraList) {
            if (now.currentScope.lookUpInThisScope(para.getName().intern()) == null)
                now.currentScope.addEntry(para.getName().intern(), para);
            else throw new CompilationError("Parameters with the same id!");
        }
        currentScope.addEntry(funcName, now);
    }

    @Override
    public void exitMethod_def(MasterParser.Method_defContext ctx) {
        Scope currentScope = scopes.peek();
        String methodName =
                ctx.ID().getText().intern();
        ASTnode thisMethod = currentScope.lookUpInThisScope(methodName);
        if (thisMethod != null)
            throw new CompilationError(currentPlace + "This function name has been used!");
        List<VarDec> paraList = new ArrayList<>();
        if (ctx.parameter_list() != null)
            for (MasterParser.Parameter_declContext paraDecl: ctx.parameter_list().parameter_decl()) {
                ASTnode type = CST2AST.dict.get(paraDecl.type_specifier());
                if (CST2AST.dict.get(paraDecl.type_specifier()) == null)
                    throw new CompilationError("Something happened unfortunately!");
                paraList.add(new VarDec((ClassDec)type, paraDecl.ID().getText().intern()));
            }
        MethodDec now = new MethodDec(paraList, null, methodName);
        CST2AST.dict.put(ctx, now);
        now.currentScope = new Scope(currentScope);
        for (VarDec para: paraList) {
            if (now.currentScope.lookUpInThisScope(para.getName().intern()) == null)
                now.currentScope.addEntry(para.getName().intern(), para);
            else throw new CompilationError("Parameters with the same id!");
        }
        currentScope.addEntry(methodName, now);
    }
}
