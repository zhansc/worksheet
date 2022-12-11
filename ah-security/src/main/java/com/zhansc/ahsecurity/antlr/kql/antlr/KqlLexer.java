// Generated from java-escape by ANTLR 4.11.1
package com.zhansc.ahsecurity.antlr.kql.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, AND=4, OR=5, NOT=6, TRUE=7, FALSE=8, GT=9, GE=10, 
		LT=11, LE=12, EQ=13, NOTEQ=14, IN=15, NOTIN=16, EXIST=17, NOTEXIST=18, 
		CONTAINS=19, NOTCONTAINS=20, LPAREN=21, RPAREN=22, DECIMAL=23, IDENTIFIER=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", 
			"LT", "LE", "EQ", "NOTEQ", "IN", "NOTIN", "EXIST", "NOTEXIST", "CONTAINS", 
			"NOTCONTAINS", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", null, "'OR'", null, null, null, "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", null, null, null, null, null, null, "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "AND", "OR", "NOT", "TRUE", "FALSE", "GT", "GE", 
			"LT", "LE", "EQ", "NOTEQ", "IN", "NOTIN", "EXIST", "NOTEXIST", "CONTAINS", 
			"NOTCONTAINS", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public KqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u00ee\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"U\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"a\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000ew"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0083"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u008f"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a1"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b3"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00cb"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0003"+
		"\u0016\u00d2\b\u0016\u0001\u0016\u0004\u0016\u00d5\b\u0016\u000b\u0016"+
		"\f\u0016\u00d6\u0001\u0016\u0001\u0016\u0004\u0016\u00db\b\u0016\u000b"+
		"\u0016\f\u0016\u00dc\u0003\u0016\u00df\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00e3\b\u0017\n\u0017\f\u0017\u00e6\t\u0017\u0001\u0018\u0004"+
		"\u0018\u00e9\b\u0018\u000b\u0018\f\u0018\u00ea\u0001\u0018\u0001\u0018"+
		"\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0004\u0001\u000009\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00fd\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00035"+
		"\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u0007?\u0001\u0000"+
		"\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000"+
		"\rT\u0001\u0000\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011b\u0001"+
		"\u0000\u0000\u0000\u0013d\u0001\u0000\u0000\u0000\u0015g\u0001\u0000\u0000"+
		"\u0000\u0017i\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001b"+
		"o\u0001\u0000\u0000\u0000\u001dv\u0001\u0000\u0000\u0000\u001f\u0082\u0001"+
		"\u0000\u0000\u0000!\u008e\u0001\u0000\u0000\u0000#\u00a0\u0001\u0000\u0000"+
		"\u0000%\u00b2\u0001\u0000\u0000\u0000\'\u00ca\u0001\u0000\u0000\u0000"+
		")\u00cc\u0001\u0000\u0000\u0000+\u00ce\u0001\u0000\u0000\u0000-\u00d1"+
		"\u0001\u0000\u0000\u0000/\u00e0\u0001\u0000\u0000\u00001\u00e8\u0001\u0000"+
		"\u0000\u000034\u0005[\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0005"+
		",\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005]\u0000\u00008\u0006"+
		"\u0001\u0000\u0000\u00009:\u0005a\u0000\u0000:;\u0005n\u0000\u0000;@\u0005"+
		"d\u0000\u0000<=\u0005A\u0000\u0000=>\u0005N\u0000\u0000>@\u0005D\u0000"+
		"\u0000?9\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\b\u0001\u0000"+
		"\u0000\u0000AB\u0005O\u0000\u0000BC\u0005R\u0000\u0000C\n\u0001\u0000"+
		"\u0000\u0000DE\u0005n\u0000\u0000EF\u0005o\u0000\u0000FK\u0005t\u0000"+
		"\u0000GH\u0005N\u0000\u0000HI\u0005O\u0000\u0000IK\u0005T\u0000\u0000"+
		"JD\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000K\f\u0001\u0000\u0000"+
		"\u0000LM\u0005t\u0000\u0000MN\u0005r\u0000\u0000NO\u0005u\u0000\u0000"+
		"OU\u0005e\u0000\u0000PQ\u0005T\u0000\u0000QR\u0005R\u0000\u0000RS\u0005"+
		"U\u0000\u0000SU\u0005E\u0000\u0000TL\u0001\u0000\u0000\u0000TP\u0001\u0000"+
		"\u0000\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005f\u0000\u0000WX\u0005"+
		"a\u0000\u0000XY\u0005l\u0000\u0000YZ\u0005s\u0000\u0000Za\u0005e\u0000"+
		"\u0000[\\\u0005F\u0000\u0000\\]\u0005A\u0000\u0000]^\u0005L\u0000\u0000"+
		"^_\u0005S\u0000\u0000_a\u0005E\u0000\u0000`V\u0001\u0000\u0000\u0000`"+
		"[\u0001\u0000\u0000\u0000a\u0010\u0001\u0000\u0000\u0000bc\u0005>\u0000"+
		"\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005>\u0000\u0000ef\u0005=\u0000"+
		"\u0000f\u0014\u0001\u0000\u0000\u0000gh\u0005<\u0000\u0000h\u0016\u0001"+
		"\u0000\u0000\u0000ij\u0005<\u0000\u0000jk\u0005=\u0000\u0000k\u0018\u0001"+
		"\u0000\u0000\u0000lm\u0005=\u0000\u0000mn\u0005=\u0000\u0000n\u001a\u0001"+
		"\u0000\u0000\u0000op\u0005!\u0000\u0000pq\u0005=\u0000\u0000q\u001c\u0001"+
		"\u0000\u0000\u0000rs\u0005i\u0000\u0000sw\u0005n\u0000\u0000tu\u0005I"+
		"\u0000\u0000uw\u0005N\u0000\u0000vr\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000w\u001e\u0001\u0000\u0000\u0000xy\u0005n\u0000\u0000yz\u0005"+
		"o\u0000\u0000z{\u0005t\u0000\u0000{|\u0005i\u0000\u0000|\u0083\u0005n"+
		"\u0000\u0000}~\u0005N\u0000\u0000~\u007f\u0005O\u0000\u0000\u007f\u0080"+
		"\u0005T\u0000\u0000\u0080\u0081\u0005I\u0000\u0000\u0081\u0083\u0005N"+
		"\u0000\u0000\u0082x\u0001\u0000\u0000\u0000\u0082}\u0001\u0000\u0000\u0000"+
		"\u0083 \u0001\u0000\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086"+
		"\u0005x\u0000\u0000\u0086\u0087\u0005i\u0000\u0000\u0087\u0088\u0005s"+
		"\u0000\u0000\u0088\u008f\u0005t\u0000\u0000\u0089\u008a\u0005E\u0000\u0000"+
		"\u008a\u008b\u0005X\u0000\u0000\u008b\u008c\u0005I\u0000\u0000\u008c\u008d"+
		"\u0005S\u0000\u0000\u008d\u008f\u0005T\u0000\u0000\u008e\u0084\u0001\u0000"+
		"\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008f\"\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005n\u0000\u0000\u0091\u0092\u0005o\u0000\u0000\u0092"+
		"\u0093\u0005t\u0000\u0000\u0093\u0094\u0005e\u0000\u0000\u0094\u0095\u0005"+
		"x\u0000\u0000\u0095\u0096\u0005i\u0000\u0000\u0096\u0097\u0005s\u0000"+
		"\u0000\u0097\u00a1\u0005t\u0000\u0000\u0098\u0099\u0005N\u0000\u0000\u0099"+
		"\u009a\u0005O\u0000\u0000\u009a\u009b\u0005T\u0000\u0000\u009b\u009c\u0005"+
		"E\u0000\u0000\u009c\u009d\u0005X\u0000\u0000\u009d\u009e\u0005I\u0000"+
		"\u0000\u009e\u009f\u0005S\u0000\u0000\u009f\u00a1\u0005T\u0000\u0000\u00a0"+
		"\u0090\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000\u0000\u0000\u00a1"+
		"$\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005c\u0000\u0000\u00a3\u00a4\u0005"+
		"o\u0000\u0000\u00a4\u00a5\u0005n\u0000\u0000\u00a5\u00a6\u0005t\u0000"+
		"\u0000\u00a6\u00a7\u0005a\u0000\u0000\u00a7\u00a8\u0005i\u0000\u0000\u00a8"+
		"\u00a9\u0005n\u0000\u0000\u00a9\u00b3\u0005s\u0000\u0000\u00aa\u00ab\u0005"+
		"C\u0000\u0000\u00ab\u00ac\u0005O\u0000\u0000\u00ac\u00ad\u0005N\u0000"+
		"\u0000\u00ad\u00ae\u0005T\u0000\u0000\u00ae\u00af\u0005A\u0000\u0000\u00af"+
		"\u00b0\u0005I\u0000\u0000\u00b0\u00b1\u0005N\u0000\u0000\u00b1\u00b3\u0005"+
		"S\u0000\u0000\u00b2\u00a2\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b3&\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005n\u0000\u0000"+
		"\u00b5\u00b6\u0005o\u0000\u0000\u00b6\u00b7\u0005t\u0000\u0000\u00b7\u00b8"+
		"\u0005c\u0000\u0000\u00b8\u00b9\u0005o\u0000\u0000\u00b9\u00ba\u0005n"+
		"\u0000\u0000\u00ba\u00bb\u0005t\u0000\u0000\u00bb\u00bc\u0005a\u0000\u0000"+
		"\u00bc\u00bd\u0005i\u0000\u0000\u00bd\u00be\u0005n\u0000\u0000\u00be\u00cb"+
		"\u0005s\u0000\u0000\u00bf\u00c0\u0005N\u0000\u0000\u00c0\u00c1\u0005O"+
		"\u0000\u0000\u00c1\u00c2\u0005T\u0000\u0000\u00c2\u00c3\u0005C\u0000\u0000"+
		"\u00c3\u00c4\u0005O\u0000\u0000\u00c4\u00c5\u0005N\u0000\u0000\u00c5\u00c6"+
		"\u0005T\u0000\u0000\u00c6\u00c7\u0005A\u0000\u0000\u00c7\u00c8\u0005I"+
		"\u0000\u0000\u00c8\u00c9\u0005N\u0000\u0000\u00c9\u00cb\u0005S\u0000\u0000"+
		"\u00ca\u00b4\u0001\u0000\u0000\u0000\u00ca\u00bf\u0001\u0000\u0000\u0000"+
		"\u00cb(\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005(\u0000\u0000\u00cd*"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005)\u0000\u0000\u00cf,\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0005-\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d5\u0007\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00de\u0001\u0000\u0000"+
		"\u0000\u00d8\u00da\u0005.\u0000\u0000\u00d9\u00db\u0007\u0000\u0000\u0000"+
		"\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d8\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df.\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e4\u0007\u0001\u0000\u0000\u00e1\u00e3\u0007\u0002\u0000\u0000\u00e2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"0\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e9"+
		"\u0007\u0003\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0006\u0018\u0000\u0000\u00ed2\u0001\u0000\u0000\u0000\u0011\u0000?J"+
		"T`v\u0082\u008e\u00a0\u00b2\u00ca\u00d1\u00d6\u00dc\u00de\u00e4\u00ea"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}