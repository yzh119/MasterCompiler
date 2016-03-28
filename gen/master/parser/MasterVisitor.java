// Generated from C:/Users/Ò¶×ÓºÀ/IdeaProjects/MasterCompiler/src/master/parser\Master.g4 by ANTLR 4.5.1
package master.parser;
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
	 * Visit a parse tree produced by {@link MasterParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(MasterParser.Compound_stmtContext ctx);
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
	 * Visit a parse tree produced by {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_stmt(MasterParser.Jump_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MasterParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expr(MasterParser.Assignment_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#logical_or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expr(MasterParser.Logical_or_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#logical_and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expr(MasterParser.Logical_and_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#equality_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expr(MasterParser.Equality_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#relational_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expr(MasterParser.Relational_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#additive_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expr(MasterParser.Additive_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(MasterParser.Mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(MasterParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(MasterParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MasterParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MasterParser.ConstantContext ctx);
}