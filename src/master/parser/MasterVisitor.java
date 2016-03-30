// Generated from C:/Users/Ò¶×ÓºÀ/IdeaProjects/MasterCompiler/src/Master/Parser\Master.g4 by ANTLR 4.5.1
package Master.Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MasterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MasterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MasterParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MasterParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MasterParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(MasterParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(MasterParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#variable_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_list(MasterParser.Variable_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(MasterParser.Function_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(MasterParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#parameter_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_decl(MasterParser.Parameter_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#variable_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl(MasterParser.Variable_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(MasterParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(MasterParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MasterParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MasterParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(MasterParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#selection_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_stmt(MasterParser.Selection_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#iteration_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_stmt(MasterParser.Iteration_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnJump(MasterParser.ReturnJumpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakJump(MasterParser.BreakJumpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueJump(MasterParser.ContinueJumpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(MasterParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(MasterParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noParaFuncExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoParaFuncExpr(MasterParser.NoParaFuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logAndExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAndExpr(MasterParser.LogAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logOrExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogOrExpr(MasterParser.LogOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpr(MasterParser.MulDivModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpr(MasterParser.FieldExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpr(MasterParser.XorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(MasterParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpr(MasterParser.ShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitOrExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpr(MasterParser.BitOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preUnaryExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreUnaryExpr(MasterParser.PreUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withParaFuncExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithParaFuncExpr(MasterParser.WithParaFuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(MasterParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subsExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsExpr(MasterParser.SubsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code posUnaryExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosUnaryExpr(MasterParser.PosUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitAndExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpr(MasterParser.BitAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(MasterParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqNeqExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqNeqExpr(MasterParser.EqNeqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(MasterParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(MasterParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MasterParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#dim_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_expr(MasterParser.Dim_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(MasterParser.Param_listContext ctx);
}