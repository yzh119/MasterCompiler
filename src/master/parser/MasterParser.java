// Generated from C:/Users/Ò¶×ÓºÀ/IdeaProjects/MasterCompiler/src/master/Parser\Master.g4 by ANTLR 4.5.1
package master.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MasterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, BREAK=3, RETURN=4, CONTINUE=5, WHILE=6, FOR=7, NEW=8, INTEGER=9, 
		STRING=10, BOOLEAN=11, VOID=12, CLASS=13, PREDICATE=14, ADD=15, SUB=16, 
		MUL=17, DIV=18, MOD=19, INC=20, DEC=21, GREATER=22, GREATER_EQ=23, LESS=24, 
		LESS_EQ=25, EQ=26, NEQ=27, LOG_AND=28, LOG_OR=29, LOG_NOT=30, LSHIFT=31, 
		RSHIFT=32, BIT_NOT=33, BIT_AND=34, BIT_OR=35, XOR=36, ASSIGN=37, NULL=38, 
		COMMA=39, SEMICOLON=40, LBRACKET=41, RBRACKET=42, LRBRACKET=43, LBRACE=44, 
		RBRACE=45, LPAREN=46, RPAREN=47, LRPAREN=48, DOT=49, SIZE=50, INT_LITERAL=51, 
		STRING_LITERAL=52, ID=53, NEWLINE=54, LINE_COMMENT=55, WS=56;
	public static final int
		RULE_program = 0, RULE_component = 1, RULE_function_def = 2, RULE_class_def = 3, 
		RULE_variable_decl_list = 4, RULE_function_head = 5, RULE_parameter_list = 6, 
		RULE_parameter_decl = 7, RULE_variable_decl = 8, RULE_type_specifier = 9, 
		RULE_stmt_list = 10, RULE_stmt = 11, RULE_block = 12, RULE_expr_stmt = 13, 
		RULE_selection_stmt = 14, RULE_iteration_stmt = 15, RULE_jump_stmt = 16, 
		RULE_expr = 17, RULE_prefix = 18, RULE_constant = 19, RULE_dim_expr = 20, 
		RULE_param_list = 21;
	public static final String[] ruleNames = {
		"program", "component", "function_def", "class_def", "variable_decl_list", 
		"function_head", "parameter_list", "parameter_decl", "variable_decl", 
		"type_specifier", "stmt_list", "stmt", "block", "expr_stmt", "selection_stmt", 
		"iteration_stmt", "jump_stmt", "expr", "prefix", "constant", "dim_expr", 
		"param_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'break'", "'return'", "'continue'", "'while'", 
		"'for'", "'new'", "'int'", "'string'", "'bool'", "'void'", "'class'", 
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'>'", "'>='", 
		"'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'<<'", "'>>'", 
		"'~'", "'&'", "'|'", "'^'", "'='", "'null'", "','", "';'", "'['", "']'", 
		"'[]'", "'{'", "'}'", "'('", "')'", "'()'", "'.'", "'size'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", "FOR", "NEW", 
		"INTEGER", "STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", "ADD", "SUB", 
		"MUL", "DIV", "MOD", "INC", "DEC", "GREATER", "GREATER_EQ", "LESS", "LESS_EQ", 
		"EQ", "NEQ", "LOG_AND", "LOG_OR", "LOG_NOT", "LSHIFT", "RSHIFT", "BIT_NOT", 
		"BIT_AND", "BIT_OR", "XOR", "ASSIGN", "NULL", "COMMA", "SEMICOLON", "LBRACKET", 
		"RBRACKET", "LRBRACKET", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LRPAREN", 
		"DOT", "SIZE", "INT_LITERAL", "STRING_LITERAL", "ID", "NEWLINE", "LINE_COMMENT", 
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
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
		return program(0);
	}

	private ProgramContext program(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgramContext _localctx = new ProgramContext(_ctx, _parentState);
		ProgramContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_program, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45);
			component();
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgramContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_program);
					setState(47);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(48);
					component();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ComponentContext extends ParserRuleContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_component);
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				class_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				function_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				variable_decl();
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

	public static class Function_defContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			function_head();
			setState(60);
			block();
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
		public Variable_decl_listContext variable_decl_list() {
			return getRuleContext(Variable_decl_listContext.class,0);
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
			setState(62);
			match(CLASS);
			setState(63);
			match(ID);
			setState(64);
			match(LBRACE);
			setState(65);
			variable_decl_list(0);
			setState(66);
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

	public static class Variable_decl_listContext extends ParserRuleContext {
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public Variable_decl_listContext variable_decl_list() {
			return getRuleContext(Variable_decl_listContext.class,0);
		}
		public Variable_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterVariable_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitVariable_decl_list(this);
		}
	}

	public final Variable_decl_listContext variable_decl_list() throws RecognitionException {
		return variable_decl_list(0);
	}

	private Variable_decl_listContext variable_decl_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variable_decl_listContext _localctx = new Variable_decl_listContext(_ctx, _parentState);
		Variable_decl_listContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_variable_decl_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			variable_decl();
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Variable_decl_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variable_decl_list);
					setState(71);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(72);
					variable_decl();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Function_headContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode LRPAREN() { return getToken(MasterParser.LRPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public TerminalNode VOID() { return getToken(MasterParser.VOID, 0); }
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitFunction_head(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_head);
		int _la;
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				type_specifier(0);
				setState(79);
				match(ID);
				setState(80);
				match(LRPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				type_specifier(0);
				setState(83);
				match(ID);
				setState(84);
				match(LPAREN);
				setState(85);
				parameter_list(0);
				setState(86);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(VOID);
				setState(89);
				match(ID);
				setState(90);
				match(LRPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(VOID);
				setState(92);
				match(ID);
				setState(93);
				match(LPAREN);
				setState(95);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(94);
					parameter_list(0);
					}
				}

				setState(97);
				match(RPAREN);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declContext parameter_decl() {
			return getRuleContext(Parameter_declContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MasterParser.COMMA, 0); }
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
		return parameter_list(0);
	}

	private Parameter_listContext parameter_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, _parentState);
		Parameter_listContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_parameter_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
			parameter_decl();
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parameter_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameter_list);
					setState(103);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(104);
					match(COMMA);
					setState(105);
					parameter_decl();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 14, RULE_parameter_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type_specifier(0);
			setState(112);
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
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				type_specifier(0);
				setState(115);
				match(ID);
				setState(116);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				type_specifier(0);
				setState(119);
				match(ID);
				setState(120);
				match(ASSIGN);
				setState(121);
				expr(0);
				setState(122);
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

	public static class Type_specifierContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MasterParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(MasterParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(MasterParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode LRBRACKET() { return getToken(MasterParser.LRBRACKET, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitType_specifier(this);
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
			setState(131);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(127);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				setState(128);
				match(STRING);
				}
				break;
			case BOOLEAN:
				{
				setState(129);
				match(BOOLEAN);
				}
				break;
			case ID:
				{
				setState(130);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_specifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_specifier);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(134);
					match(LRBRACKET);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
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
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				stmt();
				setState(142);
				stmt_list();
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
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				expr_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				selection_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				iteration_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				jump_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				variable_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
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
		public TerminalNode RBRACE() { return getToken(MasterParser.RBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LBRACE);
			setState(157);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << BREAK) | (1L << RETURN) | (1L << CONTINUE) | (1L << WHILE) | (1L << FOR) | (1L << NEW) | (1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << SEMICOLON) | (1L << LBRACE) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(156);
				stmt_list();
				}
			}

			setState(159);
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
			setState(161);
			expr(0);
			setState(162);
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
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(IF);
				setState(165);
				match(LPAREN);
				setState(166);
				expr(0);
				setState(167);
				match(RPAREN);
				setState(168);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(IF);
				setState(171);
				match(LPAREN);
				setState(172);
				expr(0);
				setState(173);
				match(RPAREN);
				setState(174);
				stmt();
				setState(175);
				match(ELSE);
				setState(176);
				stmt();
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

	public static class Iteration_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MasterParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode FOR() { return getToken(MasterParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MasterParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MasterParser.SEMICOLON, i);
		}
		public Iteration_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterIteration_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitIteration_stmt(this);
		}
	}

	public final Iteration_stmtContext iteration_stmt() throws RecognitionException {
		Iteration_stmtContext _localctx = new Iteration_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iteration_stmt);
		int _la;
		try {
			setState(201);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(WHILE);
				setState(181);
				match(LPAREN);
				setState(182);
				expr(0);
				setState(183);
				match(RPAREN);
				setState(184);
				stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(FOR);
				setState(187);
				match(LPAREN);
				setState(189);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(188);
					expr(0);
					}
				}

				setState(191);
				match(SEMICOLON);
				setState(193);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(192);
					expr(0);
					}
				}

				setState(195);
				match(SEMICOLON);
				setState(197);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(196);
					expr(0);
					}
				}

				setState(199);
				match(RPAREN);
				setState(200);
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
		public TerminalNode RETURN() { return getToken(MasterParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(MasterParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MasterParser.CONTINUE, 0); }
		public Jump_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterJump_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitJump_stmt(this);
		}
	}

	public final Jump_stmtContext jump_stmt() throws RecognitionException {
		Jump_stmtContext _localctx = new Jump_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jump_stmt);
		try {
			setState(211);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(RETURN);
				setState(204);
				expr(0);
				setState(205);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(BREAK);
				setState(208);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(CONTINUE);
				setState(210);
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

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INC() { return getToken(MasterParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MasterParser.DEC, 0); }
		public TerminalNode ADD() { return getToken(MasterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MasterParser.SUB, 0); }
		public TerminalNode BIT_NOT() { return getToken(MasterParser.BIT_NOT, 0); }
		public TerminalNode LOG_NOT() { return getToken(MasterParser.LOG_NOT, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode NEW() { return getToken(MasterParser.NEW, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Dim_exprContext dim_expr() {
			return getRuleContext(Dim_exprContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MasterParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MasterParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MasterParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(MasterParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(MasterParser.RSHIFT, 0); }
		public TerminalNode LESS() { return getToken(MasterParser.LESS, 0); }
		public TerminalNode LESS_EQ() { return getToken(MasterParser.LESS_EQ, 0); }
		public TerminalNode GREATER() { return getToken(MasterParser.GREATER, 0); }
		public TerminalNode GREATER_EQ() { return getToken(MasterParser.GREATER_EQ, 0); }
		public TerminalNode EQ() { return getToken(MasterParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MasterParser.NEQ, 0); }
		public TerminalNode BIT_AND() { return getToken(MasterParser.BIT_AND, 0); }
		public TerminalNode XOR() { return getToken(MasterParser.XOR, 0); }
		public TerminalNode BIT_OR() { return getToken(MasterParser.BIT_OR, 0); }
		public TerminalNode LOG_AND() { return getToken(MasterParser.LOG_AND, 0); }
		public TerminalNode LOG_OR() { return getToken(MasterParser.LOG_OR, 0); }
		public TerminalNode ASSIGN() { return getToken(MasterParser.ASSIGN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitExpr(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case INC:
			case DEC:
			case LOG_NOT:
			case BIT_NOT:
				{
				setState(214);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(215);
				expr(16);
				}
				break;
			case LPAREN:
				{
				setState(216);
				match(LPAREN);
				setState(217);
				expr(0);
				setState(218);
				match(RPAREN);
				}
				break;
			case PREDICATE:
			case NULL:
			case INT_LITERAL:
			case STRING_LITERAL:
				{
				setState(220);
				constant();
				}
				break;
			case NEW:
				{
				setState(221);
				match(NEW);
				setState(222);
				type_specifier(0);
				setState(224);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(223);
					dim_expr(0);
					}
					break;
				}
				}
				break;
			case ID:
				{
				setState(226);
				prefix(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(230);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(231);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(233);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(234);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(236);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LSHIFT || _la==RSHIFT) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(237);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(239);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << GREATER_EQ) | (1L << LESS) | (1L << LESS_EQ))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(240);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(242);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(243);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(245);
						((ExprContext)_localctx).op = match(BIT_AND);
						setState(246);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(248);
						((ExprContext)_localctx).op = match(XOR);
						setState(249);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(251);
						((ExprContext)_localctx).op = match(BIT_OR);
						setState(252);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(254);
						((ExprContext)_localctx).op = match(LOG_AND);
						setState(255);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(257);
						((ExprContext)_localctx).op = match(LOG_OR);
						setState(258);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(260);
						((ExprContext)_localctx).op = match(ASSIGN);
						setState(261);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(263);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(MasterParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MasterParser.RBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public TerminalNode LRPAREN() { return getToken(MasterParser.LRPAREN, 0); }
		public TerminalNode DOT() { return getToken(MasterParser.DOT, 0); }
		public TerminalNode SIZE() { return getToken(MasterParser.SIZE, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitPrefix(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		return prefix(0);
	}

	private PrefixContext prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrefixContext _localctx = new PrefixContext(_ctx, _parentState);
		PrefixContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(270);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PrefixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_prefix);
						setState(272);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(273);
						match(LBRACKET);
						setState(274);
						expr(0);
						setState(275);
						match(RBRACKET);
						}
						break;
					case 2:
						{
						_localctx = new PrefixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_prefix);
						setState(277);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(278);
						match(LPAREN);
						setState(279);
						param_list(0);
						setState(280);
						match(RPAREN);
						}
						break;
					case 3:
						{
						_localctx = new PrefixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_prefix);
						setState(282);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(283);
						match(LRPAREN);
						}
						break;
					case 4:
						{
						_localctx = new PrefixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_prefix);
						setState(284);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(285);
						match(DOT);
						setState(286);
						match(ID);
						}
						break;
					case 5:
						{
						_localctx = new PrefixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_prefix);
						setState(287);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(288);
						match(DOT);
						setState(289);
						match(SIZE);
						setState(290);
						match(LRPAREN);
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(MasterParser.NULL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(MasterParser.INT_LITERAL, 0); }
		public TerminalNode PREDICATE() { return getToken(MasterParser.PREDICATE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MasterParser.STRING_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PREDICATE) | (1L << NULL) | (1L << INT_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Dim_exprContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(MasterParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MasterParser.RBRACKET, 0); }
		public Dim_exprContext dim_expr() {
			return getRuleContext(Dim_exprContext.class,0);
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
		return dim_expr(0);
	}

	private Dim_exprContext dim_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dim_exprContext _localctx = new Dim_exprContext(_ctx, _parentState);
		Dim_exprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_dim_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(299);
			match(LBRACKET);
			setState(300);
			expr(0);
			setState(301);
			match(RBRACKET);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dim_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dim_expr);
					setState(303);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(304);
					match(LBRACKET);
					setState(305);
					expr(0);
					setState(306);
					match(RBRACKET);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Param_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MasterParser.COMMA, 0); }
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
		return param_list(0);
	}

	private Param_listContext param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Param_listContext _localctx = new Param_listContext(_ctx, _parentState);
		Param_listContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_param_list);
					setState(316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(317);
					match(COMMA);
					setState(318);
					expr(0);
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return program_sempred((ProgramContext)_localctx, predIndex);
		case 4:
			return variable_decl_list_sempred((Variable_decl_listContext)_localctx, predIndex);
		case 6:
			return parameter_list_sempred((Parameter_listContext)_localctx, predIndex);
		case 9:
			return type_specifier_sempred((Type_specifierContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 18:
			return prefix_sempred((PrefixContext)_localctx, predIndex);
		case 20:
			return dim_expr_sempred((Dim_exprContext)_localctx, predIndex);
		case 21:
			return param_list_sempred((Param_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean program_sempred(ProgramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variable_decl_list_sempred(Variable_decl_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameter_list_sempred(Parameter_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_specifier_sempred(Type_specifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean prefix_sempred(PrefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dim_expr_sempred(Dim_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean param_list_sempred(Param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0147\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3"+
		"\7\5\7e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0086\n\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009c"+
		"\n\r\3\16\3\16\5\16\u00a0\n\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b5\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c0\n\21\3\21\3\21"+
		"\5\21\u00c4\n\21\3\21\3\21\5\21\u00c8\n\21\3\21\3\21\5\21\u00cc\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d6\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e3\n\23\3\23\5\23\u00e6"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u010b\n\23\f\23\16\23\u010e"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0126\n\24\f\24\16"+
		"\24\u0129\13\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0137\n\26\f\26\16\26\u013a\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0142\n\27\f\27\16\27\u0145\13\27\3\27\2\n\2\n\16\24$&*,\30"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\n\6\2\21\22\26\27  "+
		"##\3\2\23\25\3\2\21\22\3\2!\"\3\2\30\33\3\2\34\35\3\2\26\27\5\2\20\20"+
		"((\65\66\u0165\2.\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2"+
		"\fd\3\2\2\2\16f\3\2\2\2\20q\3\2\2\2\22~\3\2\2\2\24\u0085\3\2\2\2\26\u0092"+
		"\3\2\2\2\30\u009b\3\2\2\2\32\u009d\3\2\2\2\34\u00a3\3\2\2\2\36\u00b4\3"+
		"\2\2\2 \u00cb\3\2\2\2\"\u00d5\3\2\2\2$\u00e5\3\2\2\2&\u010f\3\2\2\2(\u012a"+
		"\3\2\2\2*\u012c\3\2\2\2,\u013b\3\2\2\2./\b\2\1\2/\60\5\4\3\2\60\65\3\2"+
		"\2\2\61\62\f\3\2\2\62\64\5\4\3\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2"+
		"\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67\65\3\2\2\28<\5\b\5\29<\5\6\4\2:<\5"+
		"\22\n\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\5\f\7\2>?\5\32\16\2"+
		"?\7\3\2\2\2@A\7\17\2\2AB\7\67\2\2BC\7.\2\2CD\5\n\6\2DE\7/\2\2E\t\3\2\2"+
		"\2FG\b\6\1\2GH\5\22\n\2HM\3\2\2\2IJ\f\3\2\2JL\5\22\n\2KI\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OM\3\2\2\2PQ\5\24\13\2QR\7\67\2\2"+
		"RS\7\62\2\2Se\3\2\2\2TU\5\24\13\2UV\7\67\2\2VW\7\60\2\2WX\5\16\b\2XY\7"+
		"\61\2\2Ye\3\2\2\2Z[\7\16\2\2[\\\7\67\2\2\\e\7\62\2\2]^\7\16\2\2^_\7\67"+
		"\2\2_a\7\60\2\2`b\5\16\b\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\7\61\2\2dP"+
		"\3\2\2\2dT\3\2\2\2dZ\3\2\2\2d]\3\2\2\2e\r\3\2\2\2fg\b\b\1\2gh\5\20\t\2"+
		"hn\3\2\2\2ij\f\3\2\2jk\7)\2\2km\5\20\t\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2qr\5\24\13\2rs\7\67\2\2s\21\3\2\2\2tu"+
		"\5\24\13\2uv\7\67\2\2vw\7*\2\2w\177\3\2\2\2xy\5\24\13\2yz\7\67\2\2z{\7"+
		"\'\2\2{|\5$\23\2|}\7*\2\2}\177\3\2\2\2~t\3\2\2\2~x\3\2\2\2\177\23\3\2"+
		"\2\2\u0080\u0081\b\13\1\2\u0081\u0086\7\13\2\2\u0082\u0086\7\f\2\2\u0083"+
		"\u0086\7\r\2\2\u0084\u0086\7\67\2\2\u0085\u0080\3\2\2\2\u0085\u0082\3"+
		"\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u008b\3\2\2\2\u0087"+
		"\u0088\f\3\2\2\u0088\u008a\7-\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008e\u0093\5\30\r\2\u008f\u0090\5\30\r\2\u0090\u0091\5\26\f"+
		"\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0093\27"+
		"\3\2\2\2\u0094\u009c\5\32\16\2\u0095\u009c\5\34\17\2\u0096\u009c\5\36"+
		"\20\2\u0097\u009c\5 \21\2\u0098\u009c\5\"\22\2\u0099\u009c\5\22\n\2\u009a"+
		"\u009c\7*\2\2\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2"+
		"\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\31\3\2\2\2\u009d\u009f\7.\2\2\u009e\u00a0\5\26\f"+
		"\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\7/\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\5$\23\2\u00a4\u00a5\7*\2\2\u00a5"+
		"\35\3\2\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00a8\7\60\2\2\u00a8\u00a9\5$\23"+
		"\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00b5\3\2\2\2\u00ac"+
		"\u00ad\7\3\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\5$\23\2\u00af\u00b0\7"+
		"\61\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\30\r\2"+
		"\u00b3\u00b5\3\2\2\2\u00b4\u00a6\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b5\37"+
		"\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\7\60\2\2\u00b8\u00b9\5$\23\2"+
		"\u00b9\u00ba\7\61\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00cc\3\2\2\2\u00bc\u00bd"+
		"\7\t\2\2\u00bd\u00bf\7\60\2\2\u00be\u00c0\5$\23\2\u00bf\u00be\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\7*\2\2\u00c2\u00c4"+
		"\5$\23\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\7*\2\2\u00c6\u00c8\5$\23\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cc\5\30\r\2\u00cb"+
		"\u00b6\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cc!\3\2\2\2\u00cd\u00ce\7\6\2\2"+
		"\u00ce\u00cf\5$\23\2\u00cf\u00d0\7*\2\2\u00d0\u00d6\3\2\2\2\u00d1\u00d2"+
		"\7\5\2\2\u00d2\u00d6\7*\2\2\u00d3\u00d4\7\7\2\2\u00d4\u00d6\7*\2\2\u00d5"+
		"\u00cd\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6#\3\2\2\2"+
		"\u00d7\u00d8\b\23\1\2\u00d8\u00d9\t\2\2\2\u00d9\u00e6\5$\23\22\u00da\u00db"+
		"\7\60\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7\61\2\2\u00dd\u00e6\3\2\2\2"+
		"\u00de\u00e6\5(\25\2\u00df\u00e0\7\n\2\2\u00e0\u00e2\5\24\13\2\u00e1\u00e3"+
		"\5*\26\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e6\5&\24\2\u00e5\u00d7\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00de\3\2"+
		"\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u010c\3\2\2\2\u00e7"+
		"\u00e8\f\20\2\2\u00e8\u00e9\t\3\2\2\u00e9\u010b\5$\23\21\u00ea\u00eb\f"+
		"\17\2\2\u00eb\u00ec\t\4\2\2\u00ec\u010b\5$\23\20\u00ed\u00ee\f\16\2\2"+
		"\u00ee\u00ef\t\5\2\2\u00ef\u010b\5$\23\17\u00f0\u00f1\f\r\2\2\u00f1\u00f2"+
		"\t\6\2\2\u00f2\u010b\5$\23\16\u00f3\u00f4\f\f\2\2\u00f4\u00f5\t\7\2\2"+
		"\u00f5\u010b\5$\23\r\u00f6\u00f7\f\13\2\2\u00f7\u00f8\7$\2\2\u00f8\u010b"+
		"\5$\23\f\u00f9\u00fa\f\n\2\2\u00fa\u00fb\7&\2\2\u00fb\u010b\5$\23\13\u00fc"+
		"\u00fd\f\t\2\2\u00fd\u00fe\7%\2\2\u00fe\u010b\5$\23\n\u00ff\u0100\f\b"+
		"\2\2\u0100\u0101\7\36\2\2\u0101\u010b\5$\23\t\u0102\u0103\f\7\2\2\u0103"+
		"\u0104\7\37\2\2\u0104\u010b\5$\23\b\u0105\u0106\f\6\2\2\u0106\u0107\7"+
		"\'\2\2\u0107\u010b\5$\23\7\u0108\u0109\f\21\2\2\u0109\u010b\t\b\2\2\u010a"+
		"\u00e7\3\2\2\2\u010a\u00ea\3\2\2\2\u010a\u00ed\3\2\2\2\u010a\u00f0\3\2"+
		"\2\2\u010a\u00f3\3\2\2\2\u010a\u00f6\3\2\2\2\u010a\u00f9\3\2\2\2\u010a"+
		"\u00fc\3\2\2\2\u010a\u00ff\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0105\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d%\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\b\24\1\2"+
		"\u0110\u0111\7\67\2\2\u0111\u0127\3\2\2\2\u0112\u0113\f\7\2\2\u0113\u0114"+
		"\7+\2\2\u0114\u0115\5$\23\2\u0115\u0116\7,\2\2\u0116\u0126\3\2\2\2\u0117"+
		"\u0118\f\6\2\2\u0118\u0119\7\60\2\2\u0119\u011a\5,\27\2\u011a\u011b\7"+
		"\61\2\2\u011b\u0126\3\2\2\2\u011c\u011d\f\5\2\2\u011d\u0126\7\62\2\2\u011e"+
		"\u011f\f\4\2\2\u011f\u0120\7\63\2\2\u0120\u0126\7\67\2\2\u0121\u0122\f"+
		"\3\2\2\u0122\u0123\7\63\2\2\u0123\u0124\7\64\2\2\u0124\u0126\7\62\2\2"+
		"\u0125\u0112\3\2\2\2\u0125\u0117\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u011e"+
		"\3\2\2\2\u0125\u0121\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\'\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\t\t\2\2"+
		"\u012b)\3\2\2\2\u012c\u012d\b\26\1\2\u012d\u012e\7+\2\2\u012e\u012f\5"+
		"$\23\2\u012f\u0130\7,\2\2\u0130\u0138\3\2\2\2\u0131\u0132\f\3\2\2\u0132"+
		"\u0133\7+\2\2\u0133\u0134\5$\23\2\u0134\u0135\7,\2\2\u0135\u0137\3\2\2"+
		"\2\u0136\u0131\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139+\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\b\27\1\2\u013c"+
		"\u013d\5$\23\2\u013d\u0143\3\2\2\2\u013e\u013f\f\3\2\2\u013f\u0140\7)"+
		"\2\2\u0140\u0142\5$\23\2\u0141\u013e\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144-\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\34\65;Madn~\u0085\u008b\u0092\u009b\u009f\u00b4\u00bf\u00c3\u00c7\u00cb"+
		"\u00d5\u00e2\u00e5\u010a\u010c\u0125\u0127\u0138\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}