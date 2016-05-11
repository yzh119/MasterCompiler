package com.expye.compiler2016.Parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MasterLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"String_Literal", "IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", 
		"FOR", "NEW", "INTEGER", "STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", 
		"ADD", "SUB", "MUL", "DIV", "MOD", "INC", "DEC", "GREATER", "GREATER_EQ", 
		"LESS", "LESS_EQ", "EQ", "NEQ", "LOG_AND", "LOG_OR", "LOG_NOT", "LSHIFT", 
		"RSHIFT", "BIT_NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "ASSIGN", "NULL", 
		"COMMA", "SEMICOLON", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LPAREN", 
		"RPAREN", "DOT", "INT_LITERAL", "SCHARSEQ", "SCHAR", "ESCSEQ", "ID", "NEWLINE", 
		"LINE_COMMENT", "BlockComment", "WS"
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


	public MasterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Master.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u015d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\5\2x\n\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00cc\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3("+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\6"+
		"\62\u011e\n\62\r\62\16\62\u011f\3\63\6\63\u0123\n\63\r\63\16\63\u0124"+
		"\3\64\3\64\5\64\u0129\n\64\3\65\3\65\3\65\3\66\3\66\7\66\u0130\n\66\f"+
		"\66\16\66\u0133\13\66\3\67\5\67\u0136\n\67\3\67\3\67\3\67\3\67\38\38\3"+
		"8\38\78\u0140\n8\f8\168\u0143\138\38\58\u0146\n8\38\38\38\38\39\39\39"+
		"\39\79\u0150\n9\f9\169\u0153\139\39\39\39\39\39\3:\3:\3:\3:\4\u0141\u0151"+
		"\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\2k\64m\65"+
		"o\66q\67s8\3\2\b\3\2\62;\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\4\2"+
		"C\\c|\6\2\62;C\\aac|\4\2\13\13\"\"\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5{\3\2\2\2\7~\3"+
		"\2\2\2\t\u0083\3\2\2\2\13\u0089\3\2\2\2\r\u0090\3\2\2\2\17\u0099\3\2\2"+
		"\2\21\u009f\3\2\2\2\23\u00a3\3\2\2\2\25\u00a7\3\2\2\2\27\u00ab\3\2\2\2"+
		"\31\u00b2\3\2\2\2\33\u00b7\3\2\2\2\35\u00bc\3\2\2\2\37\u00cb\3\2\2\2!"+
		"\u00cd\3\2\2\2#\u00cf\3\2\2\2%\u00d1\3\2\2\2\'\u00d3\3\2\2\2)\u00d5\3"+
		"\2\2\2+\u00d7\3\2\2\2-\u00da\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63"+
		"\u00e2\3\2\2\2\65\u00e4\3\2\2\2\67\u00e7\3\2\2\29\u00ea\3\2\2\2;\u00ed"+
		"\3\2\2\2=\u00f0\3\2\2\2?\u00f3\3\2\2\2A\u00f5\3\2\2\2C\u00f8\3\2\2\2E"+
		"\u00fb\3\2\2\2G\u00fd\3\2\2\2I\u00ff\3\2\2\2K\u0101\3\2\2\2M\u0103\3\2"+
		"\2\2O\u0105\3\2\2\2Q\u010a\3\2\2\2S\u010c\3\2\2\2U\u010e\3\2\2\2W\u0110"+
		"\3\2\2\2Y\u0112\3\2\2\2[\u0114\3\2\2\2]\u0116\3\2\2\2_\u0118\3\2\2\2a"+
		"\u011a\3\2\2\2c\u011d\3\2\2\2e\u0122\3\2\2\2g\u0128\3\2\2\2i\u012a\3\2"+
		"\2\2k\u012d\3\2\2\2m\u0135\3\2\2\2o\u013b\3\2\2\2q\u014b\3\2\2\2s\u0159"+
		"\3\2\2\2uw\7$\2\2vx\5e\63\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7$\2\2z\4"+
		"\3\2\2\2{|\7k\2\2|}\7h\2\2}\6\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\b\3\2\2\2\u0083\u0084\7d\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u0088\7m\2\2"+
		"\u0088\n\3\2\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7v"+
		"\2\2\u008c\u008d\7w\2\2\u008d\u008e\7t\2\2\u008e\u008f\7p\2\2\u008f\f"+
		"\3\2\2\2\u0090\u0091\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7p\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097\7w\2\2"+
		"\u0097\u0098\7g\2\2\u0098\16\3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b\7"+
		"j\2\2\u009b\u009c\7k\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\20"+
		"\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"\22\3\2\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7y\2\2\u00a6"+
		"\24\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\26\3\2\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7t\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7i\2\2\u00b1\30\3\2\2\2\u00b2"+
		"\u00b3\7d\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7n\2\2"+
		"\u00b6\32\3\2\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7"+
		"k\2\2\u00ba\u00bb\7f\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be"+
		"\7n\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\36\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7w\2\2\u00c5"+
		"\u00cc\7g\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7n\2\2"+
		"\u00c9\u00ca\7u\2\2\u00ca\u00cc\7g\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c6"+
		"\3\2\2\2\u00cc \3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\"\3\2\2\2\u00cf\u00d0"+
		"\7/\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7"+
		"\61\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7\'\2\2\u00d6*\3\2\2\2\u00d7\u00d8"+
		"\7-\2\2\u00d8\u00d9\7-\2\2\u00d9,\3\2\2\2\u00da\u00db\7/\2\2\u00db\u00dc"+
		"\7/\2\2\u00dc.\3\2\2\2\u00dd\u00de\7@\2\2\u00de\60\3\2\2\2\u00df\u00e0"+
		"\7@\2\2\u00e0\u00e1\7?\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\64"+
		"\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7?\2\2\u00e6\66\3\2\2\2\u00e7"+
		"\u00e8\7?\2\2\u00e8\u00e9\7?\2\2\u00e98\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb"+
		"\u00ec\7?\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7(\2\2\u00ee\u00ef\7(\2\2\u00ef"+
		"<\3\2\2\2\u00f0\u00f1\7~\2\2\u00f1\u00f2\7~\2\2\u00f2>\3\2\2\2\u00f3\u00f4"+
		"\7#\2\2\u00f4@\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7>\2\2\u00f7B\3"+
		"\2\2\2\u00f8\u00f9\7@\2\2\u00f9\u00fa\7@\2\2\u00faD\3\2\2\2\u00fb\u00fc"+
		"\7\u0080\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7(\2\2\u00feH\3\2\2\2\u00ff\u0100"+
		"\7~\2\2\u0100J\3\2\2\2\u0101\u0102\7`\2\2\u0102L\3\2\2\2\u0103\u0104\7"+
		"?\2\2\u0104N\3\2\2\2\u0105\u0106\7p\2\2\u0106\u0107\7w\2\2\u0107\u0108"+
		"\7n\2\2\u0108\u0109\7n\2\2\u0109P\3\2\2\2\u010a\u010b\7.\2\2\u010bR\3"+
		"\2\2\2\u010c\u010d\7=\2\2\u010dT\3\2\2\2\u010e\u010f\7]\2\2\u010fV\3\2"+
		"\2\2\u0110\u0111\7_\2\2\u0111X\3\2\2\2\u0112\u0113\7}\2\2\u0113Z\3\2\2"+
		"\2\u0114\u0115\7\177\2\2\u0115\\\3\2\2\2\u0116\u0117\7*\2\2\u0117^\3\2"+
		"\2\2\u0118\u0119\7+\2\2\u0119`\3\2\2\2\u011a\u011b\7\60\2\2\u011bb\3\2"+
		"\2\2\u011c\u011e\t\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120d\3\2\2\2\u0121\u0123\5g\64\2"+
		"\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125f\3\2\2\2\u0126\u0129\n\3\2\2\u0127\u0129\5i\65\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129h\3\2\2\2\u012a\u012b\7^\2\2\u012b"+
		"\u012c\t\4\2\2\u012cj\3\2\2\2\u012d\u0131\t\5\2\2\u012e\u0130\t\6\2\2"+
		"\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132l\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\7\17\2\2\u0135"+
		"\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\f"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b\67\2\2\u013an\3\2\2\2\u013b\u013c"+
		"\7\61\2\2\u013c\u013d\7\61\2\2\u013d\u0141\3\2\2\2\u013e\u0140\13\2\2"+
		"\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u0142\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\7\17\2\2"+
		"\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148"+
		"\7\f\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b8\2\2\u014ap\3\2\2\2\u014b\u014c"+
		"\7\61\2\2\u014c\u014d\7,\2\2\u014d\u0151\3\2\2\2\u014e\u0150\13\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0156\7\61\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b9\2\2\u0158r\3\2\2\2"+
		"\u0159\u015a\t\7\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b:\2\2\u015ct\3\2"+
		"\2\2\r\2w\u00cb\u011f\u0124\u0128\u0131\u0135\u0141\u0145\u0151\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}