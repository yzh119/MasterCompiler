package com.expye.compiler2016.Parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MasterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		String_Literal=1, IF=2, ELSE=3, BREAK=4, RETURN=5, CONTINUE=6, WHILE=7, 
		FOR=8, NEW=9, INTEGER=10, STRING=11, BOOLEAN=12, VOID=13, CLASS=14, PREDICATE=15, 
		ADD=16, SUB=17, MUL=18, DIV=19, MOD=20, INC=21, DEC=22, GREATER=23, GREATER_EQ=24, 
		LESS=25, LESS_EQ=26, EQ=27, NEQ=28, LOG_AND=29, LOG_OR=30, LOG_NOT=31, 
		LSHIFT=32, RSHIFT=33, BIT_NOT=34, BIT_AND=35, BIT_OR=36, BIT_XOR=37, ASSIGN=38, 
		NULL=39, COMMA=40, SEMICOLON=41, LBRACKET=42, RBRACKET=43, LBRACE=44, 
		RBRACE=45, LPAREN=46, RPAREN=47, DOT=48, INT_LITERAL=49, ID=50, NEWLINE=51, 
		LINE_COMMENT=52, BlockComment=53, WS=54;
	public static final int
		RULE_program = 0, RULE_class_body = 1, RULE_function_def = 2, RULE_class_def = 3, 
		RULE_parameter_list = 4, RULE_parameter_decl = 5, RULE_expr = 6, RULE_dim_expr = 7, 
		RULE_variable_decl = 8, RULE_type_specifier = 9, RULE_stmt_list = 10, 
		RULE_stmt = 11, RULE_block = 12, RULE_expr_stmt = 13, RULE_selection_stmt = 14, 
		RULE_iteration_stmt = 15, RULE_jump_stmt = 16, RULE_constant = 17, RULE_param_list = 18;
	public static final String[] ruleNames = {
		"program", "class_body", "function_def", "class_def", "parameter_list", 
		"parameter_decl", "expr", "dim_expr", "variable_decl", "type_specifier", 
		"stmt_list", "stmt", "block", "expr_stmt", "selection_stmt", "iteration_stmt", 
		"jump_stmt", "constant", "param_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'else'", "'break'", "'return'", "'continue'", "'while'", 
		"'for'", "'new'", "'int'", "'string'", "'bool'", "'void'", "'class'", 
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'>'", "'>='", 
		"'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'<<'", "'>>'", 
		"'~'", "'&'", "'|'", "'^'", "'='", "'null'", "','", "';'", "'['", "']'", 
		"'{'", "'}'", "'('", "')'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "String_Literal", "IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", 
		"FOR", "NEW", "INTEGER", "STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", 
		"ADD", "SUB", "MUL", "DIV", "MOD", "INC", "DEC", "GREATER", "GREATER_EQ", 
		"LESS", "LESS_EQ", "EQ", "NEQ", "LOG_AND", "LOG_OR", "LOG_NOT", "LSHIFT", 
		"RSHIFT", "BIT_NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "ASSIGN", "NULL", 
		"COMMA", "SEMICOLON", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LPAREN", 
		"RPAREN", "DOT", "INT_LITERAL", "ID", "NEWLINE", "LINE_COMMENT", "BlockComment", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Master.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MasterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Variable_declContext> variable_decl() {
			return getRuleContexts(Variable_declContext.class);
		}
		public Variable_declContext variable_decl(int i) {
			return getRuleContext(Variable_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << VOID) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				setState(41);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					class_def();
					}
					break;
				case 2:
					{
					setState(39);
					function_def();
					}
					break;
				case 3:
					{
					setState(40);
					variable_decl();
					}
					break;
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Variable_declContext> variable_decl() {
			return getRuleContexts(Variable_declContext.class);
		}
		public Variable_declContext variable_decl(int i) {
			return getRuleContext(Variable_declContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << VOID) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				setState(49);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(46);
					class_def();
					}
					break;
				case 2:
					{
					setState(47);
					function_def();
					}
					break;
				case 3:
					{
					setState(48);
					variable_decl();
					}
					break;
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MasterParser.LBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MasterParser.RBRACE, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type_specifier(0);
			setState(55);
			match(ID);
			setState(56);
			match(LPAREN);
			setState(58);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(57);
				parameter_list();
				}
			}

			setState(60);
			match(RPAREN);
			setState(61);
			match(LBRACE);
			setState(62);
			stmt_list();
			setState(63);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MasterParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(MasterParser.LBRACE, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MasterParser.RBRACE, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(CLASS);
			setState(66);
			match(ID);
			setState(67);
			match(LBRACE);
			setState(68);
			class_body();
			setState(69);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<Parameter_declContext> parameter_decl() {
			return getRuleContexts(Parameter_declContext.class);
		}
		public Parameter_declContext parameter_decl(int i) {
			return getRuleContext(Parameter_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MasterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MasterParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					parameter_decl();
					setState(72);
					match(COMMA);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(79);
			parameter_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public Parameter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParameter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParameter_decl(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			type_specifier(0);
			setState(82);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExprContext extends ExprContext {
		public TerminalNode NEW() { return getToken(MasterParser.NEW, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Dim_exprContext dim_expr() {
			return getRuleContext(Dim_exprContext.class,0);
		}
		public NewExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitNewExpr(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitFuncExpr(this);
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MasterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MasterParser.SUB, 0); }
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitAddSubExpr(this);
		}
	}
	public static class LogAndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOG_AND() { return getToken(MasterParser.LOG_AND, 0); }
		public LogAndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterLogAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitLogAndExpr(this);
		}
	}
	public static class LogOrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOG_OR() { return getToken(MasterParser.LOG_OR, 0); }
		public LogOrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterLogOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitLogOrExpr(this);
		}
	}
	public static class MulDivModExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MasterParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MasterParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MasterParser.MOD, 0); }
		public MulDivModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterMulDivModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitMulDivModExpr(this);
		}
	}
	public static class FieldExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MasterParser.DOT, 0); }
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public FieldExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitFieldExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParenExpr(this);
		}
	}
	public static class BitXorExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_XOR() { return getToken(MasterParser.BIT_XOR, 0); }
		public BitXorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBitXorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBitXorExpr(this);
		}
	}
	public static class ShiftExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LSHIFT() { return getToken(MasterParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(MasterParser.RSHIFT, 0); }
		public ShiftExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitShiftExpr(this);
		}
	}
	public static class BitOrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_OR() { return getToken(MasterParser.BIT_OR, 0); }
		public BitOrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBitOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBitOrExpr(this);
		}
	}
	public static class PreUnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INC() { return getToken(MasterParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MasterParser.DEC, 0); }
		public TerminalNode ADD() { return getToken(MasterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MasterParser.SUB, 0); }
		public TerminalNode BIT_NOT() { return getToken(MasterParser.BIT_NOT, 0); }
		public TerminalNode LOG_NOT() { return getToken(MasterParser.LOG_NOT, 0); }
		public PreUnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterPreUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitPreUnaryExpr(this);
		}
	}
	public static class CompExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(MasterParser.LESS, 0); }
		public TerminalNode LESS_EQ() { return getToken(MasterParser.LESS_EQ, 0); }
		public TerminalNode GREATER() { return getToken(MasterParser.GREATER, 0); }
		public TerminalNode GREATER_EQ() { return getToken(MasterParser.GREATER_EQ, 0); }
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitCompExpr(this);
		}
	}
	public static class SubsExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(MasterParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(MasterParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(MasterParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(MasterParser.RBRACKET, i);
		}
		public SubsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterSubsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitSubsExpr(this);
		}
	}
	public static class PosUnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INC() { return getToken(MasterParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MasterParser.DEC, 0); }
		public PosUnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterPosUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitPosUnaryExpr(this);
		}
	}
	public static class BitAndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_AND() { return getToken(MasterParser.BIT_AND, 0); }
		public BitAndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBitAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBitAndExpr(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MasterParser.ASSIGN, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitAssignExpr(this);
		}
	}
	public static class EqNeqExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MasterParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MasterParser.NEQ, 0); }
		public EqNeqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterEqNeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitEqNeqExpr(this);
		}
	}
	public static class ConstExprContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitConstExpr(this);
		}
	}
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitIdentifierExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new PreUnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				((PreUnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT))) != 0)) ) {
					((PreUnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(86);
				expr(16);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(LPAREN);
				setState(88);
				expr(0);
				setState(89);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(ID);
				setState(92);
				match(LPAREN);
				setState(94);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String_Literal) | (1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(93);
					param_list();
					}
				}

				setState(96);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(NEW);
				setState(98);
				type_specifier(0);
				setState(100);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(99);
					dim_expr();
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				constant();
				}
				break;
			case 6:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(107);
						((MulDivModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulDivModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(108);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(110);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(111);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(113);
						((ShiftExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LSHIFT || _la==RSHIFT) ) {
							((ShiftExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(114);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(116);
						((CompExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << GREATER_EQ) | (1L << LESS) | (1L << LESS_EQ))) != 0)) ) {
							((CompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(117);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new EqNeqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(119);
						((EqNeqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqNeqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(120);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitAndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(122);
						((BitAndExprContext)_localctx).op = match(BIT_AND);
						setState(123);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitXorExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(125);
						((BitXorExprContext)_localctx).op = match(BIT_XOR);
						setState(126);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitOrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(128);
						((BitOrExprContext)_localctx).op = match(BIT_OR);
						setState(129);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new LogAndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(131);
						((LogAndExprContext)_localctx).op = match(LOG_AND);
						setState(132);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new LogOrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(134);
						((LogOrExprContext)_localctx).op = match(LOG_OR);
						setState(135);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						((AssignExprContext)_localctx).op = match(ASSIGN);
						setState(138);
						expr(4);
						}
						break;
					case 12:
						{
						_localctx = new SubsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(144); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(140);
								match(LBRACKET);
								setState(141);
								expr(0);
								setState(142);
								match(RBRACKET);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(146); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 13:
						{
						_localctx = new FieldExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(149);
						match(DOT);
						setState(150);
						match(ID);
						setState(156);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(151);
							match(LPAREN);
							setState(153);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String_Literal) | (1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << ID))) != 0)) {
								{
								setState(152);
								param_list();
								}
							}

							setState(155);
							match(RPAREN);
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new PosUnaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(159);
						((PosUnaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((PosUnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Dim_exprContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(MasterParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(MasterParser.LBRACKET, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(MasterParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(MasterParser.RBRACKET, i);
		}
		public Dim_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterDim_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitDim_expr(this);
		}
	}

	public final Dim_exprContext dim_expr() throws RecognitionException {
		Dim_exprContext _localctx = new Dim_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dim_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(165);
					match(LBRACKET);
					setState(166);
					expr(0);
					setState(167);
					match(RBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					match(LBRACKET);
					setState(174);
					match(RBRACKET);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(MasterParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterVariable_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitVariable_decl(this);
		}
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			type_specifier(0);
			setState(181);
			match(ID);
			setState(184);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(182);
				match(ASSIGN);
				setState(183);
				expr(0);
				}
			}

			setState(186);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
	 
		public Type_specifierContext() { }
		public void copyFrom(Type_specifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends Type_specifierContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(MasterParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(MasterParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(MasterParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(MasterParser.RBRACKET, i);
		}
		public ArrayTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitArrayType(this);
		}
	}
	public static class IntegerTypeContext extends Type_specifierContext {
		public TerminalNode INTEGER() { return getToken(MasterParser.INTEGER, 0); }
		public IntegerTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitIntegerType(this);
		}
	}
	public static class StringTypeContext extends Type_specifierContext {
		public TerminalNode STRING() { return getToken(MasterParser.STRING, 0); }
		public StringTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitStringType(this);
		}
	}
	public static class BoolTypeContext extends Type_specifierContext {
		public TerminalNode BOOLEAN() { return getToken(MasterParser.BOOLEAN, 0); }
		public BoolTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBoolType(this);
		}
	}
	public static class ClassTypeContext extends Type_specifierContext {
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public ClassTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitClassType(this);
		}
	}
	public static class NullTypeContext extends Type_specifierContext {
		public TerminalNode VOID() { return getToken(MasterParser.VOID, 0); }
		public NullTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitNullType(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		return type_specifier(0);
	}

	private Type_specifierContext type_specifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, _parentState);
		Type_specifierContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_type_specifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntegerTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				_localctx = new StringTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(STRING);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BoolTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(BOOLEAN);
				}
				break;
			case ID:
				{
				_localctx = new ClassTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(ID);
				}
				break;
			case VOID:
				{
				_localctx = new NullTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new Type_specifierContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type_specifier);
					setState(196);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(197);
							match(LBRACKET);
							setState(198);
							match(RBRACKET);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(201); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String_Literal) | (1L << IF) | (1L << BREAK) | (1L << RETURN) | (1L << CONTINUE) | (1L << WHILE) | (1L << FOR) | (1L << NEW) | (1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << VOID) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << SEMICOLON) | (1L << LBRACE) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(208);
				stmt();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Selection_stmtContext selection_stmt() {
			return getRuleContext(Selection_stmtContext.class,0);
		}
		public Iteration_stmtContext iteration_stmt() {
			return getRuleContext(Iteration_stmtContext.class,0);
		}
		public Jump_stmtContext jump_stmt() {
			return getRuleContext(Jump_stmtContext.class,0);
		}
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				expr_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				selection_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				iteration_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				jump_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				variable_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MasterParser.LBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MasterParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LBRACE);
			setState(224);
			stmt_list();
			setState(225);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			expr(0);
			setState(228);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MasterParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MasterParser.ELSE, 0); }
		public Selection_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterSelection_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitSelection_stmt(this);
		}
	}

	public final Selection_stmtContext selection_stmt() throws RecognitionException {
		Selection_stmtContext _localctx = new Selection_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selection_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(IF);
			setState(231);
			match(LPAREN);
			setState(232);
			expr(0);
			setState(233);
			match(RPAREN);
			setState(234);
			stmt();
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(235);
				match(ELSE);
				setState(236);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_stmtContext extends ParserRuleContext {
		public Iteration_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_stmt; }
	 
		public Iteration_stmtContext() { }
		public void copyFrom(Iteration_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileIterationContext extends Iteration_stmtContext {
		public TerminalNode WHILE() { return getToken(MasterParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileIterationContext(Iteration_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterWhileIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitWhileIteration(this);
		}
	}
	public static class ForIterationContext extends Iteration_stmtContext {
		public ExprContext expr1;
		public ExprContext expr2;
		public ExprContext expr3;
		public TerminalNode FOR() { return getToken(MasterParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MasterParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MasterParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForIterationContext(Iteration_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterForIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitForIteration(this);
		}
	}

	public final Iteration_stmtContext iteration_stmt() throws RecognitionException {
		Iteration_stmtContext _localctx = new Iteration_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iteration_stmt);
		int _la;
		try {
			setState(260);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileIterationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(WHILE);
				setState(240);
				match(LPAREN);
				setState(241);
				expr(0);
				setState(242);
				match(RPAREN);
				setState(243);
				stmt();
				}
				break;
			case FOR:
				_localctx = new ForIterationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(FOR);
				setState(246);
				match(LPAREN);
				setState(248);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String_Literal) | (1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(247);
					((ForIterationContext)_localctx).expr1 = expr(0);
					}
				}

				setState(250);
				match(SEMICOLON);
				setState(252);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String_Literal) | (1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(251);
					((ForIterationContext)_localctx).expr2 = expr(0);
					}
				}

				setState(254);
				match(SEMICOLON);
				setState(256);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String_Literal) | (1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(255);
					((ForIterationContext)_localctx).expr3 = expr(0);
					}
				}

				setState(258);
				match(RPAREN);
				setState(259);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_stmtContext extends ParserRuleContext {
		public Jump_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_stmt; }
	 
		public Jump_stmtContext() { }
		public void copyFrom(Jump_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnJumpContext extends Jump_stmtContext {
		public TerminalNode RETURN() { return getToken(MasterParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnJumpContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterReturnJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitReturnJump(this);
		}
	}
	public static class BreakJumpContext extends Jump_stmtContext {
		public TerminalNode BREAK() { return getToken(MasterParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public BreakJumpContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBreakJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBreakJump(this);
		}
	}
	public static class ContinueJumpContext extends Jump_stmtContext {
		public TerminalNode CONTINUE() { return getToken(MasterParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public ContinueJumpContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterContinueJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitContinueJump(this);
		}
	}

	public final Jump_stmtContext jump_stmt() throws RecognitionException {
		Jump_stmtContext _localctx = new Jump_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jump_stmt);
		int _la;
		try {
			setState(271);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnJumpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(RETURN);
				setState(264);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String_Literal) | (1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(263);
					expr(0);
					}
				}

				setState(266);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				_localctx = new BreakJumpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(BREAK);
				setState(268);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueJumpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(CONTINUE);
				setState(270);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolConstContext extends ConstantContext {
		public TerminalNode PREDICATE() { return getToken(MasterParser.PREDICATE, 0); }
		public BoolConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBoolConst(this);
		}
	}
	public static class IntConstContext extends ConstantContext {
		public TerminalNode INT_LITERAL() { return getToken(MasterParser.INT_LITERAL, 0); }
		public IntConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterIntConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitIntConst(this);
		}
	}
	public static class NullConstContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(MasterParser.NULL, 0); }
		public NullConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterNullConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitNullConst(this);
		}
	}
	public static class StringConstContext extends ConstantContext {
		public TerminalNode String_Literal() { return getToken(MasterParser.String_Literal, 0); }
		public StringConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitStringConst(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constant);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case NULL:
				_localctx = new NullConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(NULL);
				}
				break;
			case INT_LITERAL:
				_localctx = new IntConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(INT_LITERAL);
				}
				break;
			case PREDICATE:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(PREDICATE);
				}
				break;
			case String_Literal:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(String_Literal);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MasterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MasterParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_param_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					expr(0);
					setState(280);
					match(COMMA);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(287);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return type_specifier_sempred((Type_specifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean type_specifier_sempred(Type_specifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\b\3\b"+
		"\3\b\3\b\5\bg\n\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0093\n\b\r\b\16\b"+
		"\u0094\3\b\3\b\3\b\3\b\3\b\5\b\u009c\n\b\3\b\5\b\u009f\n\b\3\b\3\b\7\b"+
		"\u00a3\n\b\f\b\16\b\u00a6\13\b\3\t\3\t\3\t\3\t\6\t\u00ac\n\t\r\t\16\t"+
		"\u00ad\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\n\3\n\3\n\3\n\5\n\u00bb"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c5\n\13\3\13\3\13\3"+
		"\13\6\13\u00ca\n\13\r\13\16\13\u00cb\7\13\u00ce\n\13\f\13\16\13\u00d1"+
		"\13\13\3\f\7\f\u00d4\n\f\f\f\16\f\u00d7\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00e0\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00f0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00fb\n\21\3\21\3\21\5\21\u00ff\n\21\3\21\3\21\5\21\u0103\n"+
		"\21\3\21\3\21\5\21\u0107\n\21\3\22\3\22\5\22\u010b\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0112\n\22\3\23\3\23\3\23\3\23\5\23\u0118\n\23\3\24\3"+
		"\24\3\24\7\24\u011d\n\24\f\24\16\24\u0120\13\24\3\24\3\24\3\24\2\4\16"+
		"\24\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\t\6\2\22\23\27\30"+
		"!!$$\3\2\24\26\3\2\22\23\3\2\"#\3\2\31\34\3\2\35\36\3\2\27\30\u014c\2"+
		"-\3\2\2\2\4\65\3\2\2\2\68\3\2\2\2\bC\3\2\2\2\nN\3\2\2\2\fS\3\2\2\2\16"+
		"j\3\2\2\2\20\u00ab\3\2\2\2\22\u00b6\3\2\2\2\24\u00c4\3\2\2\2\26\u00d5"+
		"\3\2\2\2\30\u00df\3\2\2\2\32\u00e1\3\2\2\2\34\u00e5\3\2\2\2\36\u00e8\3"+
		"\2\2\2 \u0106\3\2\2\2\"\u0111\3\2\2\2$\u0117\3\2\2\2&\u011e\3\2\2\2(,"+
		"\5\b\5\2),\5\6\4\2*,\5\22\n\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,/\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60\64\5\b\5\2\61\64\5\6\4\2"+
		"\62\64\5\22\n\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\67\3\2\2"+
		"\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\289\5\24\13\2"+
		"9:\7\64\2\2:<\7\60\2\2;=\5\n\6\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\61"+
		"\2\2?@\7.\2\2@A\5\26\f\2AB\7/\2\2B\7\3\2\2\2CD\7\20\2\2DE\7\64\2\2EF\7"+
		".\2\2FG\5\4\3\2GH\7/\2\2H\t\3\2\2\2IJ\5\f\7\2JK\7*\2\2KM\3\2\2\2LI\3\2"+
		"\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\f\7\2R\13\3"+
		"\2\2\2ST\5\24\13\2TU\7\64\2\2U\r\3\2\2\2VW\b\b\1\2WX\t\2\2\2Xk\5\16\b"+
		"\22YZ\7\60\2\2Z[\5\16\b\2[\\\7\61\2\2\\k\3\2\2\2]^\7\64\2\2^`\7\60\2\2"+
		"_a\5&\24\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bk\7\61\2\2cd\7\13\2\2df\5\24"+
		"\13\2eg\5\20\t\2fe\3\2\2\2fg\3\2\2\2gk\3\2\2\2hk\5$\23\2ik\7\64\2\2jV"+
		"\3\2\2\2jY\3\2\2\2j]\3\2\2\2jc\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\u00a4\3\2"+
		"\2\2lm\f\20\2\2mn\t\3\2\2n\u00a3\5\16\b\21op\f\17\2\2pq\t\4\2\2q\u00a3"+
		"\5\16\b\20rs\f\16\2\2st\t\5\2\2t\u00a3\5\16\b\17uv\f\r\2\2vw\t\6\2\2w"+
		"\u00a3\5\16\b\16xy\f\f\2\2yz\t\7\2\2z\u00a3\5\16\b\r{|\f\13\2\2|}\7%\2"+
		"\2}\u00a3\5\16\b\f~\177\f\n\2\2\177\u0080\7\'\2\2\u0080\u00a3\5\16\b\13"+
		"\u0081\u0082\f\t\2\2\u0082\u0083\7&\2\2\u0083\u00a3\5\16\b\n\u0084\u0085"+
		"\f\b\2\2\u0085\u0086\7\37\2\2\u0086\u00a3\5\16\b\t\u0087\u0088\f\7\2\2"+
		"\u0088\u0089\7 \2\2\u0089\u00a3\5\16\b\b\u008a\u008b\f\6\2\2\u008b\u008c"+
		"\7(\2\2\u008c\u00a3\5\16\b\6\u008d\u0092\f\25\2\2\u008e\u008f\7,\2\2\u008f"+
		"\u0090\5\16\b\2\u0090\u0091\7-\2\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u00a3\3\2\2\2\u0096\u0097\f\23\2\2\u0097\u0098\7\62\2\2\u0098\u009e\7"+
		"\64\2\2\u0099\u009b\7\60\2\2\u009a\u009c\5&\24\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7\61\2\2\u009e\u0099\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a1\f\21\2\2\u00a1"+
		"\u00a3\t\b\2\2\u00a2l\3\2\2\2\u00a2o\3\2\2\2\u00a2r\3\2\2\2\u00a2u\3\2"+
		"\2\2\u00a2x\3\2\2\2\u00a2{\3\2\2\2\u00a2~\3\2\2\2\u00a2\u0081\3\2\2\2"+
		"\u00a2\u0084\3\2\2\2\u00a2\u0087\3\2\2\2\u00a2\u008a\3\2\2\2\u00a2\u008d"+
		"\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7-\2\2\u00aa\u00ac"+
		"\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b0\7,\2\2\u00b0\u00b2\7-\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\5\24\13\2\u00b7"+
		"\u00ba\7\64\2\2\u00b8\u00b9\7(\2\2\u00b9\u00bb\5\16\b\2\u00ba\u00b8\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd"+
		"\23\3\2\2\2\u00be\u00bf\b\13\1\2\u00bf\u00c5\7\f\2\2\u00c0\u00c5\7\r\2"+
		"\2\u00c1\u00c5\7\16\2\2\u00c2\u00c5\7\64\2\2\u00c3\u00c5\7\17\2\2\u00c4"+
		"\u00be\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00cf\3\2\2\2\u00c6\u00c9\f\4\2\2\u00c7"+
		"\u00c8\7,\2\2\u00c8\u00ca\7-\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\3\2\2"+
		"\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c6"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\25\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\5\30\r\2\u00d3\u00d2\3\2\2"+
		"\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\27"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00e0\5\32\16\2\u00d9\u00e0\5\34\17"+
		"\2\u00da\u00e0\5\36\20\2\u00db\u00e0\5 \21\2\u00dc\u00e0\5\"\22\2\u00dd"+
		"\u00e0\5\22\n\2\u00de\u00e0\7+\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2"+
		"\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\31\3\2\2\2\u00e1\u00e2\7.\2\2"+
		"\u00e2\u00e3\5\26\f\2\u00e3\u00e4\7/\2\2\u00e4\33\3\2\2\2\u00e5\u00e6"+
		"\5\16\b\2\u00e6\u00e7\7+\2\2\u00e7\35\3\2\2\2\u00e8\u00e9\7\4\2\2\u00e9"+
		"\u00ea\7\60\2\2\u00ea\u00eb\5\16\b\2\u00eb\u00ec\7\61\2\2\u00ec\u00ef"+
		"\5\30\r\2\u00ed\u00ee\7\5\2\2\u00ee\u00f0\5\30\r\2\u00ef\u00ed\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0\37\3\2\2\2\u00f1\u00f2\7\t\2\2\u00f2\u00f3"+
		"\7\60\2\2\u00f3\u00f4\5\16\b\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\5\30\r"+
		"\2\u00f6\u0107\3\2\2\2\u00f7\u00f8\7\n\2\2\u00f8\u00fa\7\60\2\2\u00f9"+
		"\u00fb\5\16\b\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u00fe\7+\2\2\u00fd\u00ff\5\16\b\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\7+\2\2\u0101\u0103\5\16"+
		"\b\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\7\61\2\2\u0105\u0107\5\30\r\2\u0106\u00f1\3\2\2\2\u0106\u00f7\3"+
		"\2\2\2\u0107!\3\2\2\2\u0108\u010a\7\7\2\2\u0109\u010b\5\16\b\2\u010a\u0109"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0112\7+\2\2\u010d"+
		"\u010e\7\6\2\2\u010e\u0112\7+\2\2\u010f\u0110\7\b\2\2\u0110\u0112\7+\2"+
		"\2\u0111\u0108\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u010f\3\2\2\2\u0112#"+
		"\3\2\2\2\u0113\u0118\7)\2\2\u0114\u0118\7\63\2\2\u0115\u0118\7\21\2\2"+
		"\u0116\u0118\7\3\2\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0116\3\2\2\2\u0118%\3\2\2\2\u0119\u011a\5\16\b\2\u011a"+
		"\u011b\7*\2\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\5\16\b\2\u0122\'\3\2\2\2!+-\63\65<N`fj\u0094"+
		"\u009b\u009e\u00a2\u00a4\u00ad\u00b3\u00ba\u00c4\u00cb\u00cf\u00d5\u00df"+
		"\u00ef\u00fa\u00fe\u0102\u0106\u010a\u0111\u0117\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}