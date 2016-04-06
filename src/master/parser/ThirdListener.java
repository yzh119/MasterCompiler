package Master.Parser;

import Master.AST.ASTnode;
import Master.AST.Dec.ClassDec;
import Master.AST.Dec.Dec;
import Master.AST.Dec.FuncDec;
import Master.AST.Dec.MethodDec;
import Master.AST.Prog.Prog;
import Master.AST.Stmt.CompoundStmt;
import Master.AST.Stmt.Exp.BinExp.*;
import Master.AST.Stmt.Exp.BoolExp;
import Master.AST.Stmt.Exp.Exp;
import Master.AST.Stmt.Exp.IntExp;
import Master.AST.Stmt.Exp.LvalueExp.SimpleVarExp;
import Master.AST.Stmt.Exp.StringExp;
import Master.AST.Stmt.Exp.UnaryExp.*;
import Master.AST.Stmt.ExprStmt;
import Master.AST.Stmt.IfStmt;
import Master.AST.Stmt.Stmt;
import Master.AST.VarDec.VarDec;
import Master.Environment.Scope;
import Master.Exception.CompilationError;
import org.antlr.v4.runtime.tree.ParseTree;
import org.omg.CORBA.COMM_FAILURE;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Stack;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class ThirdListener extends BaseListener {
    Stack<Scope> scopes = new Stack<>();

    @Override
    public void enterProgram(MasterParser.ProgramContext ctx) {
        Prog now = (Prog)CST2AST.dict.get(ctx);
        scopes.add(now.currentScope);
    }

    @Override
    public void exitProgram(MasterParser.ProgramContext ctx) {
        Prog now = (Prog)CST2AST.dict.get(ctx);
        for (ParseTree child: ctx.children) {
            ASTnode ask = CST2AST.dict.get(child);
            if (ask == null) throw new CompilationError("Something happened unfortunately!");
            now.list.add((Dec) ask);
        }
        scopes.pop();
    }

    @Override
    public void enterClass_def(MasterParser.Class_defContext ctx) {
        ClassDec now = (ClassDec)CST2AST.dict.get(ctx);
        scopes.add(now.currentScope);
    }

    @Override
    public void exitClass_def(MasterParser.Class_defContext ctx) {
        ClassDec now = (ClassDec)CST2AST.dict.get(ctx);
        for (ParseTree child: ctx.class_body().children) {
            ASTnode ask = CST2AST.dict.get(child);
            if (ask == null) throw new CompilationError("Something happened unfortunately!");
            now.declarations.put(((Dec)ask).getName(), (Dec)ask);
        }
        scopes.pop();
    }

    @Override
    public void enterFunction_def(MasterParser.Function_defContext ctx) {
        FuncDec now = (FuncDec)CST2AST.dict.get(ctx);
        scopes.add(now.currentScope);
    }

    @Override
    public void exitFunction_def(MasterParser.Function_defContext ctx) {
        FuncDec now = (FuncDec)CST2AST.dict.get(ctx);
        now.body = new ArrayList<Stmt>();
        if (ctx.stmt_list().getChildCount() != 0)
        for (ParseTree child: ctx.stmt_list().children) {
            ASTnode ask = CST2AST.dict.get(child);
            if (ask != null)
                now.body.add((Stmt) ask);
        }
        scopes.pop();
    }

    @Override
    public void enterMethod_def(MasterParser.Method_defContext ctx) {
        MethodDec now = (MethodDec) CST2AST.dict.get(ctx);
        scopes.add(now.currentScope);
    }

    @Override
    public void exitMethod_def(MasterParser.Method_defContext ctx) {
        MethodDec now = (MethodDec)CST2AST.dict.get(ctx);
        now.body = new ArrayList<Stmt>();
        if (ctx.stmt_list().getChildCount() != 0) {
            for (ParseTree child : ctx.stmt_list().children) {
                ASTnode ask = CST2AST.dict.get(child);
                if (ask != null)
                    now.body.add((Stmt) ask);
            }
        }
        scopes.pop();
    }

    @Override
    public void exitParenExpr(MasterParser.ParenExprContext ctx) {
        CST2AST.dict.put(ctx, CST2AST.dict.get(ctx.expr()));
    }

    @Override
    public void exitAddSubExpr(MasterParser.AddSubExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            CST2AST.dict.put(ctx,
                    (ctx.op.getType() == MasterParser.ADD) ?
                            new AddExp(lhs, rhs, ClassDec.intClass) : new SubExp(lhs, rhs, ClassDec.intClass));
            return;
        }
        if (lhs.type == ClassDec.stringClass && rhs.type == ClassDec.stringClass) {
            if (ctx.op.getType() == MasterParser.SUB)
                throw new CompilationError(currentPlace + "Strings can't be substracted!");
            CST2AST.dict.put(ctx,
                    new AddExp(lhs, rhs, ClassDec.stringClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers or strings");
    }

    @Override
    public void exitMulDivModExpr(MasterParser.MulDivModExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            switch (ctx.op.getType()) {
                case MasterParser.MUL:
                    CST2AST.dict.put(ctx, new MulExp(lhs, rhs, ClassDec.intClass));
                    break;
                case MasterParser.DIV:
                    CST2AST.dict.put(ctx, new DivExp(lhs, rhs, ClassDec.intClass));
                    break;
                case MasterParser.MOD:
                    CST2AST.dict.put(ctx, new ModExp(lhs, rhs, ClassDec.intClass));
                    break;
                default:
                    throw new CompilationError("Something happened unfortunately!");
            }
            return ;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitShiftExpr(MasterParser.ShiftExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            CST2AST.dict.put(ctx,
                    (ctx.op.getType() == MasterParser.LSHIFT) ?
                            new LshiftExp(lhs, rhs, ClassDec.intClass) : new RshiftExp(lhs, rhs, ClassDec.intClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitBitAndExpr(MasterParser.BitAndExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            CST2AST.dict.put(ctx, new BitAndExp(lhs, rhs, ClassDec.intClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitBitXorExpr(MasterParser.BitXorExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            CST2AST.dict.put(ctx, new BitXorExp(lhs, rhs, ClassDec.intClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitBitOrExpr(MasterParser.BitOrExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            CST2AST.dict.put(ctx, new BitOrExp(lhs, rhs, ClassDec.intClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitLogAndExpr(MasterParser.LogAndExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if (lhs.type == ClassDec.boolClass && rhs.type == ClassDec.boolClass) {
            CST2AST.dict.put(ctx, new LogAndExp(lhs, rhs, ClassDec.boolClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be booleans!");
    }

    @Override
    public void exitLogOrExpr(MasterParser.LogOrExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if (lhs.type == ClassDec.boolClass && rhs.type == ClassDec.boolClass) {
            CST2AST.dict.put(ctx, new LogOrExp(lhs, rhs, ClassDec.boolClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be booleans!");
    }

    @Override
    public void exitCompExpr(MasterParser.CompExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if ((lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass)
            || (rhs.type == ClassDec.stringClass && rhs.type == ClassDec.stringClass)) {
            switch (ctx.op.getType()) {
                case MasterParser.GREATER:
                    CST2AST.dict.put(ctx, new GreaterExp(lhs, rhs, ClassDec.boolClass));
                    break;
                case MasterParser.GREATER_EQ:
                    CST2AST.dict.put(ctx, new GreaterThanExp(lhs, rhs, ClassDec.boolClass));
                    break;
                case MasterParser.LESS:
                    CST2AST.dict.put(ctx, new LessExp(lhs, rhs, ClassDec.boolClass));
                    break;
                case MasterParser.LESS_EQ:
                    CST2AST.dict.put(ctx, new LessThanExp(lhs, rhs, ClassDec.boolClass));
                    break;
                default:
                    throw new CompilationError(currentPlace + "Incorrect use of compare symbols!");
            }
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers or strings");
    }

    @Override
    public void exitEqNeqExpr(MasterParser.EqNeqExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new CompilationError("Something happened unfortunately!");
        if ((lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass)
                || (rhs.type == ClassDec.stringClass && rhs.type == ClassDec.stringClass)) {
            switch (ctx.op.getType()) {
                case MasterParser.EQ:
                    CST2AST.dict.put(ctx, new EqExp(lhs, rhs, ClassDec.boolClass));
                    break;
                case MasterParser.NEQ:
                    CST2AST.dict.put(ctx, new NeqExp(lhs, rhs, ClassDec.boolClass));
                    break;
                default:
                    throw new CompilationError(currentPlace + "Incorrect use of eq/neq symbols!");
            }
            return ;
        }
        throw new CompilationError(currentPlace + "Operands must be integers or strings");
    }

    @Override
    public void exitConstExpr(MasterParser.ConstExprContext ctx) {
        CST2AST.dict.put(ctx, CST2AST.dict.get(ctx.constant()));
    }

    @Override
    public void exitPreUnaryExpr(MasterParser.PreUnaryExprContext ctx) {
        Exp obj = (Exp) CST2AST.dict.get(ctx.expr());
        if (obj == null)
            throw new CompilationError("Something happened unfortunately!");
        if (obj.type == ClassDec.intClass) {
            switch (ctx.op.getType()) {
                case MasterParser.INC:
                    CST2AST.dict.put(ctx, new PreIncExp(obj));
                    break;
                case MasterParser.DEC:
                    CST2AST.dict.put(ctx, new PreDecExp(obj));
                    break;
                case MasterParser.ADD:
                    CST2AST.dict.put(ctx, obj);
                    break;
                case MasterParser.SUB:
                    CST2AST.dict.put(ctx, new MinusExp(obj));
                    break;
                case MasterParser.BIT_NOT:
                    CST2AST.dict.put(ctx, new BitNotExp(obj));
                    break;
                default:
                    throw new CompilationError(currentPlace + "Incorrect use of prefix operators!");
            }
            return ;
        }
        if (obj.type == ClassDec.boolClass) {
            if (ctx.op.getType() == MasterParser.LOG_NOT) {
                CST2AST.dict.put(ctx, new LogNotExp(obj));
            } else
                throw new CompilationError(currentPlace + "Incorrect use of prefix operators!");
            return ;
        }
        throw new CompilationError(currentPlace + "Operands must be integers or booleans");
    }

    @Override
    public void exitPosUnaryExpr(MasterParser.PosUnaryExprContext ctx) {
        Exp obj = (Exp) CST2AST.dict.get(ctx.expr());
        if (obj == null)
            throw new CompilationError("Something happened unfortunately!");
        if (obj.type == ClassDec.intClass) {
            switch (ctx.op.getType()) {
                case MasterParser.INC:
                    CST2AST.dict.put(ctx, new PosIncExp(obj));
                    break;
                case MasterParser.DEC:
                    CST2AST.dict.put(ctx, new PosDecExp(obj));
                    break;
                default:
                    throw new CompilationError("Something happened unfortunately!");
            }
            return ;
        }
        throw new CompilationError(currentPlace + "Operands must be integers");
    }

    @Override
    public void enterIdentifierExpr(MasterParser.IdentifierExprContext ctx) {
        Scope currentScope = scopes.peek();
        String idName = ctx.ID().getText().intern();
        Dec ask = (Dec) currentScope.lookUp(idName);
        if (ask == null)
            throw new CompilationError(currentPlace +"Variable not found!");
        if (ask instanceof VarDec) {
            CST2AST.dict.put(ctx, new SimpleVarExp((VarDec) ask));
            return ;
        }
        if (ask instanceof FuncDec) {
            CST2AST.dict.put(ctx, ((FuncDec) ask));
            return ;
        }
        throw new CompilationError(currentPlace + "Variable was wrong!");
    }

    @Override
    public void exitFuncExpr(MasterParser.FuncExprContext ctx) {
        ASTnode func = CST2AST.dict.get(ctx.expr());
        if (!(func instanceof FuncDec))
            throw new CompilationError(currentPlace + "Invalid function call!");

    }

    @Override
    public void exitSubsExpr(MasterParser.SubsExprContext ctx) {
        super.exitSubsExpr(ctx);
    }

    @Override
    public void exitFieldExpr(MasterParser.FieldExprContext ctx) {
        super.exitFieldExpr(ctx);
    }

    @Override
    public void exitAssignExpr(MasterParser.AssignExprContext ctx) {

    }

    @Override
    public void exitNewExpr(MasterParser.NewExprContext ctx) {
        super.exitNewExpr(ctx);
    }

    @Override
    public void enterBlock(MasterParser.BlockContext ctx) {
        scopes.add(new Scope(scopes.peek()));
    }

    @Override
    public void exitBlock(MasterParser.BlockContext ctx) {
        ArrayList<Stmt> stmts = new ArrayList<>();
        for (ParseTree children: ctx.stmt_list().children) {
            Stmt now = (Stmt) CST2AST.dict.get(children);
            if (now != null)
                stmts.add(now);
        }
        CompoundStmt now = new CompoundStmt(stmts);
        now.currentScope = scopes.peek();
        CST2AST.dict.put(ctx, now);
        scopes.pop();
    }

    @Override
    public void exitExpr_stmt(MasterParser.Expr_stmtContext ctx) {
        Exp expr = (Exp) CST2AST.dict.get(ctx.expr());
        if (expr == null)
            throw new CompilationError("Something happened unfortunately!");
        CST2AST.dict.put(ctx, new ExprStmt(expr));
    }

    @Override
    public void exitSelection_stmt(MasterParser.Selection_stmtContext ctx) {
        Exp expr = (Exp) CST2AST.dict.get(ctx.expr());
        if (expr == null)
            throw new CompilationError("Something happened unfortunately!");
        if (expr.type != ClassDec.boolClass)
            throw new CompilationError(currentPlace + "Conditions must be booleans!");
        Stmt stmt1 = (Stmt) CST2AST.dict.get(ctx.stmt(0));
        if (ctx.stmt().size() > 1) {
            Stmt stmt2 = (Stmt) CST2AST.dict.get(ctx.stmt(1));
            CST2AST.dict.put(ctx, new IfStmt(expr, stmt1, stmt2));
        } else {
            CST2AST.dict.put(ctx, new IfStmt(expr, stmt1, null));
        }
    }

    @Override
    public void exitForIteration(MasterParser.ForIterationContext ctx) {

    }

    @Override
    public void exitWhileIteration(MasterParser.WhileIterationContext ctx) {

    }

    @Override
    public void exitReturnJump(MasterParser.ReturnJumpContext ctx) {

    }

    @Override
    public void exitBreakJump(MasterParser.BreakJumpContext ctx) {

    }

    @Override
    public void exitContinueJump(MasterParser.ContinueJumpContext ctx) {

    }

    @Override
    public void exitBoolConst(MasterParser.BoolConstContext ctx) {
        CST2AST.dict.put(ctx, new BoolExp(ctx.PREDICATE().getText().equals("true")));
    }

    @Override
    public void exitIntConst(MasterParser.IntConstContext ctx) {
        CST2AST.dict.put(ctx, new IntExp(Integer.valueOf(ctx.INT_LITERAL().getText())));
    }

    @Override
    public void exitNullConst(MasterParser.NullConstContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.nullClass);
    }

    @Override
    public void exitStringConst(MasterParser.StringConstContext ctx) {
        CST2AST.dict.put(ctx, new StringExp(ctx.STRING_LITERAL().getText().substring(1,
                ctx.STRING_LITERAL().getText().length() - 1)));
    }

    /*
                带初始值的还没有考虑
                 */
    @Override
    public void exitVariable_decl(MasterParser.Variable_declContext ctx) {
        Scope currentScope = scopes.peek();
        String varName = ctx.ID().getText().intern();
        ClassDec type = (ClassDec) CST2AST.dict.get(ctx.type_specifier());
        Dec ask = (Dec) currentScope.lookUpInThisScope(varName);
        if (ask == null) {
            VarDec now = new VarDec(type, varName);
            currentScope.addEntry(varName, now);
            CST2AST.dict.put(ctx, now);
            return ;
        }
        throw new CompilationError("Variable name already used!");
    }
}