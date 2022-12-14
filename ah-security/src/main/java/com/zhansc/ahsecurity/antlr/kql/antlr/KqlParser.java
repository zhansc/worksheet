// Generated from java-escape by ANTLR 4.11.1
package com.zhansc.ahsecurity.antlr.kql.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, AND=4, OR=5, NOT=6, TRUE=7, FALSE=8, GT=9, GE=10, 
		LT=11, LE=12, EQ=13, NOTEQ=14, IN=15, NOTIN=16, EXIST=17, NOTEXIST=18, 
		CONTAINS=19, NOTCONTAINS=20, LPAREN=21, RPAREN=22, DECIMAL=23, IDENTIFIER=24,
		WS=25, NIHAO=26;
	public static final int
		RULE_parse = 0, RULE_expression = 1, RULE_comparator = 2, RULE_binary = 3, 
		RULE_range = 4, RULE_exist = 5, RULE_bool = 6, RULE_nihao = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "expression", "comparator", "binary", "range", "exist", "bool", "nihao"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KqlParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			expression(0);
			setState(15);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public BinaryContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalExpressionContext extends ExpressionContext {
		public TerminalNode DECIMAL() { return getToken(KqlParser.DECIMAL, 0); }
		public DecimalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitDecimalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpressionContext extends ExpressionContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NihaoExpressionContext extends ExpressionContext {
		public NihaoContext nihao() {
			return getRuleContext(NihaoContext.class,0);
		}
		public NihaoExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterNihaoExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitNihaoExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitNihaoExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(KqlParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public RangeContext op;
		public Token right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(KqlParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(KqlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KqlParser.RPAREN, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ComparatorContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitComparatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExistContext op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExistContext exist() {
			return getRuleContext(ExistContext.class,0);
		}
		public ExistExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterExistExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitExistExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitExistExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				match(LPAREN);
				setState(19);
				expression(0);
				setState(20);
				match(RPAREN);
				}
				break;
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(NOT);
				setState(23);
				expression(8);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				bool();
				}
				break;
			case NIHAO:
				{
				_localctx = new NihaoExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				nihao();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(IDENTIFIER);
				}
				break;
			case DECIMAL:
				{
				_localctx = new DecimalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ComparatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ComparatorExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(29);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(30);
						((ComparatorExpressionContext)_localctx).op = comparator();
						setState(31);
						((ComparatorExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(33);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(34);
						((BinaryExpressionContext)_localctx).op = binary();
						setState(35);
						((BinaryExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RangeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(37);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(38);
						((RangeExpressionContext)_localctx).op = range();
						setState(39);
						((RangeExpressionContext)_localctx).right = match(T__0);
						setState(40);
						expression(0);
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(41);
							match(T__1);
							setState(42);
							expression(0);
							}
							}
							setState(47);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(48);
						match(T__2);
						}
						break;
					case 4:
						{
						_localctx = new ExistExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ExistExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(50);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(51);
						((ExistExpressionContext)_localctx).op = exist();
						}
						break;
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(KqlParser.GT, 0); }
		public TerminalNode GE() { return getToken(KqlParser.GE, 0); }
		public TerminalNode LT() { return getToken(KqlParser.LT, 0); }
		public TerminalNode LE() { return getToken(KqlParser.LE, 0); }
		public TerminalNode EQ() { return getToken(KqlParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(KqlParser.NOTEQ, 0); }
		public TerminalNode CONTAINS() { return getToken(KqlParser.CONTAINS, 0); }
		public TerminalNode NOTCONTAINS() { return getToken(KqlParser.NOTCONTAINS, 0); }
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comparator);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(GT);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(GE);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(LT);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(LE);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				match(EQ);
				}
				break;
			case NOTEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				match(NOTEQ);
				}
				break;
			case CONTAINS:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				match(CONTAINS);
				}
				break;
			case NOTCONTAINS:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				match(NOTCONTAINS);
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 9);
				{
				setState(65);
				binary();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(KqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(KqlParser.OR, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(KqlParser.IN, 0); }
		public TerminalNode NOTIN() { return getToken(KqlParser.NOTIN, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOTIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExistContext extends ParserRuleContext {
		public TerminalNode EXIST() { return getToken(KqlParser.EXIST, 0); }
		public TerminalNode NOTEXIST() { return getToken(KqlParser.NOTEXIST, 0); }
		public ExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistContext exist() throws RecognitionException {
		ExistContext _localctx = new ExistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==EXIST || _la==NOTEXIST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(KqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KqlParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NihaoContext extends ParserRuleContext {
		public TerminalNode NIHAO() { return getToken(KqlParser.NIHAO, 0); }
		public NihaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nihao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).enterNihao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KqlListener ) ((KqlListener)listener).exitNihao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KqlVisitor ) return ((KqlVisitor<? extends T>)visitor).visitNihao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public final NihaoContext nihao() throws RecognitionException {
		NihaoContext _localctx = new NihaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nihao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019M\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001,\b\u0001\n\u0001\f\u0001/\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00015\b"+
		"\u0001\n\u0001\f\u00018\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002C\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0001\u0002"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0004\u0001\u0000\u0004\u0005"+
		"\u0001\u0000\u000f\u0010\u0001\u0000\u0011\u0012\u0001\u0000\u0007\bV"+
		"\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000"+
		"\u0004B\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bF\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0000\u0000\u0001"+
		"\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0006\u0001\uffff\uffff"+
		"\u0000\u0012\u0013\u0005\u0015\u0000\u0000\u0013\u0014\u0003\u0002\u0001"+
		"\u0000\u0014\u0015\u0005\u0016\u0000\u0000\u0015\u001c\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0005\u0006\u0000\u0000\u0017\u001c\u0003\u0002\u0001"+
		"\b\u0018\u001c\u0003\f\u0006\u0000\u0019\u001c\u0005\u0018\u0000\u0000"+
		"\u001a\u001c\u0005\u0017\u0000\u0000\u001b\u0011\u0001\u0000\u0000\u0000"+
		"\u001b\u0016\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000"+
		"\u001c6\u0001\u0000\u0000\u0000\u001d\u001e\n\u0007\u0000\u0000\u001e"+
		"\u001f\u0003\u0004\u0002\u0000\u001f \u0003\u0002\u0001\b 5\u0001\u0000"+
		"\u0000\u0000!\"\n\u0006\u0000\u0000\"#\u0003\u0006\u0003\u0000#$\u0003"+
		"\u0002\u0001\u0007$5\u0001\u0000\u0000\u0000%&\n\u0005\u0000\u0000&\'"+
		"\u0003\b\u0004\u0000\'(\u0005\u0001\u0000\u0000(-\u0003\u0002\u0001\u0000"+
		")*\u0005\u0002\u0000\u0000*,\u0003\u0002\u0001\u0000+)\u0001\u0000\u0000"+
		"\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005"+
		"\u0003\u0000\u000015\u0001\u0000\u0000\u000023\n\u0004\u0000\u000035\u0003"+
		"\n\u0005\u00004\u001d\u0001\u0000\u0000\u00004!\u0001\u0000\u0000\u0000"+
		"4%\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0003\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009C\u0005\t\u0000\u0000:C\u0005"+
		"\n\u0000\u0000;C\u0005\u000b\u0000\u0000<C\u0005\f\u0000\u0000=C\u0005"+
		"\r\u0000\u0000>C\u0005\u000e\u0000\u0000?C\u0005\u0013\u0000\u0000@C\u0005"+
		"\u0014\u0000\u0000AC\u0003\u0006\u0003\u0000B9\u0001\u0000\u0000\u0000"+
		"B:\u0001\u0000\u0000\u0000B;\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000"+
		"\u0000B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0005"+
		"\u0001\u0000\u0000\u0000DE\u0007\u0000\u0000\u0000E\u0007\u0001\u0000"+
		"\u0000\u0000FG\u0007\u0001\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0007"+
		"\u0002\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0007\u0003\u0000"+
		"\u0000K\r\u0001\u0000\u0000\u0000\u0005\u001b-46B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}