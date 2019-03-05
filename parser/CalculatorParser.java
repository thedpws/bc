// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.*;
    import java.lang.*;
    import java.util.function.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, COMMENT=34, QUIT=35, ID=36, NUM=37, WS=38, NEWLINE=39;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_topBoolExpr = 2, RULE_topExpr = 3, 
		RULE_print = 4, RULE_printExpr = 5, RULE_expr = 6, RULE_var = 7, RULE_arr = 8, 
		RULE_function = 9, RULE_boolExpr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "topBoolExpr", "topExpr", "print", "printExpr", "expr", 
			"var", "arr", "function", "boolExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print '", "','", "'('", "')'", "'--'", "'++'", "'-'", "'+'", 
			"'^'", "'*'", "'/'", "'%'", "'='", "'^='", "'%='", "'*='", "'/='", "'+='", 
			"'-='", "'['", "']'", "'()'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'!'", "'&&'", "'||'", "'true'", "'false'", null, "'quit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "COMMENT", 
			"QUIT", "ID", "NUM", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    static Scanner sc = new Scanner(System.in);
	    static Map<String, Double> memory = new HashMap<String, Double>(); 
	    static Map<String, DoubleFunction<Double>> fx = new HashMap<String, DoubleFunction<Double>>(){
	    {
	            //insert s(), c(), l(), e() into functions
	            put("s", d -> Math.sin(d));
	            put("c", d -> Math.cos(d));
	            put("l", d -> Math.log(d));
	            put("e", d -> Math.exp(d));
	            put("read", d -> sc.nextDouble());
	            put("sqrt", d -> Math.sqrt(d));

	    }
	    };
	    final static double EPSILON = 0.0000000000000000;
	    static boolean print = false;
	    static boolean printDouble = false;

	    

	    private static Double functions(String fName, double d){

	        return fx.get(fName).apply(d);
	    }


	    //returns the previous value
	    private static Double insert(String key, Double value){ return memory.put(key, value); }

	    private static boolean has(String key){ return memory.get(key) != null; }

	    private static Double lookup(String key){ if (!has(key)) insert(key, 0.0); return memory.get(key); }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << ID) | (1L << NUM) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(22);
				line();
				}
				}
				setState(27);
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public TopBoolExprContext topBoolExpr() {
			return getRuleContext(TopBoolExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(28);
				topExpr();
				}
				break;
			case 2:
				{
				setState(29);
				topBoolExpr();
				}
				break;
			case 3:
				{
				setState(30);
				print();
				}
				break;
			}
			setState(33);
			match(NEWLINE);
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

	public static class TopBoolExprContext extends ParserRuleContext {
		public BoolExprContext boolExpr;
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TopBoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topBoolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterTopBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitTopBoolExpr(this);
		}
	}

	public final TopBoolExprContext topBoolExpr() throws RecognitionException {
		TopBoolExprContext _localctx = new TopBoolExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topBoolExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((TopBoolExprContext)_localctx).boolExpr = boolExpr(0);
			 if (print) System.out.println(((TopBoolExprContext)_localctx).boolExpr.b); 
			}
			_ctx.stop = _input.LT(-1);
			 print=false; printDouble=false; 
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

	public static class TopExprContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitTopExpr(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((TopExprContext)_localctx).expr = expr(0);
			 if (print) if (Math.abs(((TopExprContext)_localctx).expr.i % 1) <= EPSILON) System.out.println((int)((TopExprContext)_localctx).expr.i); else System.out.printf("%.20f%n", ((TopExprContext)_localctx).expr.i);
			}
			_ctx.stop = _input.LT(-1);
			 print=false; printDouble=false; 
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

	public static class PrintContext extends ParserRuleContext {
		public List<PrintExprContext> printExpr() {
			return getRuleContexts(PrintExprContext.class);
		}
		public PrintExprContext printExpr(int i) {
			return getRuleContext(PrintExprContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			{
			setState(42);
			printExpr();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(43);
				match(T__1);
				setState(44);
				printExpr();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class PrintExprContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPrintExpr(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((PrintExprContext)_localctx).expr = expr(0);
			 System.out.print(((PrintExprContext)_localctx).expr.i); 
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
		public double i;
		public ExprContext el;
		public ExprContext e;
		public ExprContext expr;
		public VarContext var;
		public FunctionContext function;
		public Token NUM;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpr(this);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(54);
				match(T__2);
				setState(55);
				((ExprContext)_localctx).e = ((ExprContext)_localctx).expr = expr(0);
				setState(56);
				match(T__3);
				 ((ExprContext)_localctx).i = ((ExprContext)_localctx).expr.i; print=true;
				}
				break;
			case 2:
				{
				setState(59);
				((ExprContext)_localctx).var = var();
				setState(60);
				match(T__4);
				 ((ExprContext)_localctx).i = insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)-1); print=true;
				}
				break;
			case 3:
				{
				setState(63);
				((ExprContext)_localctx).var = var();
				setState(64);
				match(T__5);
				 ((ExprContext)_localctx).i = insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)+1); print=true;
				}
				break;
			case 4:
				{
				setState(67);
				match(T__4);
				setState(68);
				((ExprContext)_localctx).var = var();
				 insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)-1); ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=true;
				}
				break;
			case 5:
				{
				setState(71);
				match(T__5);
				setState(72);
				((ExprContext)_localctx).var = var();
				 insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)+1); ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=true;
				}
				break;
			case 6:
				{
				setState(75);
				match(T__6);
				setState(76);
				((ExprContext)_localctx).var = var();
				 ((ExprContext)_localctx).i = -1.0*lookup(((ExprContext)_localctx).var.s); print=true;
				}
				break;
			case 7:
				{
				setState(79);
				match(T__7);
				setState(80);
				((ExprContext)_localctx).var = var();
				 ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=true;
				}
				break;
			case 8:
				{
				setState(83);
				((ExprContext)_localctx).function = function();
				 ((ExprContext)_localctx).i = ((ExprContext)_localctx).function.i; print=true; 
				}
				break;
			case 9:
				{
				setState(86);
				((ExprContext)_localctx).NUM = match(NUM);
				 ((ExprContext)_localctx).i = Double.parseDouble((((ExprContext)_localctx).NUM!=null?((ExprContext)_localctx).NUM.getText():null)); print=true;
				}
				break;
			case 10:
				{
				setState(88);
				((ExprContext)_localctx).var = var();
				 ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=true;
				}
				break;
			case 11:
				{
				setState(91);
				((ExprContext)_localctx).var = var();
				setState(92);
				match(T__12);
				setState(93);
				((ExprContext)_localctx).expr = expr(7);
				 ((ExprContext)_localctx).i = ((ExprContext)_localctx).expr.i; insert(((ExprContext)_localctx).var.s, ((ExprContext)_localctx).expr.i); print=false;
				}
				break;
			case 12:
				{
				setState(96);
				((ExprContext)_localctx).var = var();
				setState(97);
				match(T__13);
				setState(98);
				((ExprContext)_localctx).expr = expr(6);
				 insert(((ExprContext)_localctx).var.s, Math.pow(lookup(((ExprContext)_localctx).var.s), ((ExprContext)_localctx).expr.i)); ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=false;
				}
				break;
			case 13:
				{
				setState(101);
				((ExprContext)_localctx).var = var();
				setState(102);
				match(T__14);
				setState(103);
				((ExprContext)_localctx).expr = expr(5);
				 insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)%((ExprContext)_localctx).expr.i); ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=false;
				}
				break;
			case 14:
				{
				setState(106);
				((ExprContext)_localctx).var = var();
				setState(107);
				match(T__15);
				setState(108);
				((ExprContext)_localctx).expr = expr(4);
				 insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)*((ExprContext)_localctx).expr.i); ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=false;
				}
				break;
			case 15:
				{
				setState(111);
				((ExprContext)_localctx).var = var();
				setState(112);
				match(T__16);
				setState(113);
				((ExprContext)_localctx).expr = expr(3);
				 insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)/((ExprContext)_localctx).expr.i); ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=false;
				}
				break;
			case 16:
				{
				setState(116);
				((ExprContext)_localctx).var = var();
				setState(117);
				match(T__17);
				setState(118);
				((ExprContext)_localctx).expr = expr(2);
				 insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)+((ExprContext)_localctx).expr.i); ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=false;
				}
				break;
			case 17:
				{
				setState(121);
				((ExprContext)_localctx).var = var();
				setState(122);
				match(T__18);
				setState(123);
				((ExprContext)_localctx).expr = expr(1);
				 insert(((ExprContext)_localctx).var.s, lookup(((ExprContext)_localctx).var.s)-((ExprContext)_localctx).expr.i); ((ExprContext)_localctx).i = lookup(((ExprContext)_localctx).var.s); print=false;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(129);
						((ExprContext)_localctx).op = match(T__8);
						setState(130);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(14);
						 ((ExprContext)_localctx).i = Math.pow(((ExprContext)_localctx).el.i, ((ExprContext)_localctx).er.i); print=true;
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(134);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(13);
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("*")) ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i*((ExprContext)_localctx).er.i; else if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("/")) ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i/((ExprContext)_localctx).er.i; else if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("%")) ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i%((ExprContext)_localctx).er.i; print=true;
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(139);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(12);
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("+")) ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i+((ExprContext)_localctx).er.i; else if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("-")) ((ExprContext)_localctx).i = ((ExprContext)_localctx).el.i-((ExprContext)_localctx).er.i; print=true; 
						}
						break;
					}
					} 
				}
				setState(147);
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

	public static class VarContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public ArrContext arr;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((VarContext)_localctx).ID = match(ID);
				 ((VarContext)_localctx).s =  (((VarContext)_localctx).ID!=null?((VarContext)_localctx).ID.getText():null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				((VarContext)_localctx).arr = arr();
				 ((VarContext)_localctx).s =  ((VarContext)_localctx).arr.s; 
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

	public static class ArrContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitArr(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((ArrContext)_localctx).ID = match(ID);
			setState(156);
			match(T__19);
			setState(157);
			((ArrContext)_localctx).expr = expr(0);
			setState(158);
			match(T__20);
			 ((ArrContext)_localctx).s =  (((ArrContext)_localctx).ID!=null?((ArrContext)_localctx).ID.getText():null) + '[' + (int)Math.floor(((ArrContext)_localctx).expr.i) + ']'; 
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

	public static class FunctionContext extends ParserRuleContext {
		public double i;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				((FunctionContext)_localctx).ID = match(ID);
				setState(162);
				match(T__2);
				setState(163);
				((FunctionContext)_localctx).expr = expr(0);
				setState(164);
				match(T__3);
				 ((FunctionContext)_localctx).i =  functions((((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), ((FunctionContext)_localctx).expr.i); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				((FunctionContext)_localctx).ID = match(ID);
				setState(168);
				match(T__21);
				 ((FunctionContext)_localctx).i =  functions((((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null), -1.0); 
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

	public static class BoolExprContext extends ParserRuleContext {
		public boolean b;
		public BoolExprContext elb;
		public ExprContext el;
		public ExprContext er;
		public BoolExprContext boolExpr;
		public Token ID;
		public BoolExprContext erb;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(173);
				((BoolExprContext)_localctx).el = expr(0);
				setState(174);
				match(T__22);
				setState(175);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).el.i<((BoolExprContext)_localctx).er.i; print=true;
				}
				break;
			case 2:
				{
				setState(178);
				((BoolExprContext)_localctx).el = expr(0);
				setState(179);
				match(T__23);
				setState(180);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).el.i<=((BoolExprContext)_localctx).er.i; print=true;
				}
				break;
			case 3:
				{
				setState(183);
				((BoolExprContext)_localctx).el = expr(0);
				setState(184);
				match(T__24);
				setState(185);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).el.i>((BoolExprContext)_localctx).er.i; print=true;
				}
				break;
			case 4:
				{
				setState(188);
				((BoolExprContext)_localctx).el = expr(0);
				setState(189);
				match(T__25);
				setState(190);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).el.i>=((BoolExprContext)_localctx).er.i; print=true;
				}
				break;
			case 5:
				{
				setState(193);
				((BoolExprContext)_localctx).el = expr(0);
				setState(194);
				match(T__26);
				setState(195);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).el.i==((BoolExprContext)_localctx).er.i; print=true;
				}
				break;
			case 6:
				{
				setState(198);
				((BoolExprContext)_localctx).el = expr(0);
				setState(199);
				match(T__27);
				setState(200);
				((BoolExprContext)_localctx).er = expr(0);
				 ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).el.i!=((BoolExprContext)_localctx).er.i; print=true;
				}
				break;
			case 7:
				{
				setState(203);
				match(T__28);
				setState(204);
				((BoolExprContext)_localctx).boolExpr = boolExpr(6);
				 ((BoolExprContext)_localctx).b = !((BoolExprContext)_localctx).boolExpr.b; print=true;
				}
				break;
			case 8:
				{
				setState(207);
				match(T__31);
				 ((BoolExprContext)_localctx).b = true; print=true;
				}
				break;
			case 9:
				{
				setState(209);
				match(T__32);
				 ((BoolExprContext)_localctx).b = false; print=true;
				}
				break;
			case 10:
				{
				setState(211);
				((BoolExprContext)_localctx).ID = match(ID);
				setState(212);
				match(T__12);
				setState(213);
				((BoolExprContext)_localctx).boolExpr = boolExpr(1);
				 insert((((BoolExprContext)_localctx).ID!=null?((BoolExprContext)_localctx).ID.getText():null), ((BoolExprContext)_localctx).boolExpr.b ? 1.0:0.0); ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).boolExpr.b;print=false;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState);
						_localctx.elb = _prevctx;
						_localctx.elb = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(218);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219);
						match(T__29);
						setState(220);
						((BoolExprContext)_localctx).erb = ((BoolExprContext)_localctx).boolExpr = boolExpr(6);
						 ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).elb.b&&((BoolExprContext)_localctx).erb.b; print=true;
						}
						break;
					case 2:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState);
						_localctx.elb = _prevctx;
						_localctx.elb = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(223);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(224);
						match(T__30);
						setState(225);
						((BoolExprContext)_localctx).erb = ((BoolExprContext)_localctx).boolExpr = boolExpr(5);
						 ((BoolExprContext)_localctx).b = ((BoolExprContext)_localctx).elb.b||((BoolExprContext)_localctx).erb.b; print=true;
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 10:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\5\3\"\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0092\n\b\f\b\16\b\u0095\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u009c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ad\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00db\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e7"+
		"\n\f\f\f\16\f\u00ea\13\f\3\f\2\4\16\26\r\2\4\6\b\n\f\16\20\22\24\26\2"+
		"\4\3\2\f\16\3\2\t\n\2\u0105\2\33\3\2\2\2\4!\3\2\2\2\6%\3\2\2\2\b(\3\2"+
		"\2\2\n+\3\2\2\2\f\64\3\2\2\2\16\u0080\3\2\2\2\20\u009b\3\2\2\2\22\u009d"+
		"\3\2\2\2\24\u00ac\3\2\2\2\26\u00da\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2"+
		"\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2"+
		"\36\"\5\b\5\2\37\"\5\6\4\2 \"\5\n\6\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2"+
		"\2!\"\3\2\2\2\"#\3\2\2\2#$\7)\2\2$\5\3\2\2\2%&\5\26\f\2&\'\b\4\1\2\'\7"+
		"\3\2\2\2()\5\16\b\2)*\b\5\1\2*\t\3\2\2\2+,\7\3\2\2,\61\5\f\7\2-.\7\4\2"+
		"\2.\60\5\f\7\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\13"+
		"\3\2\2\2\63\61\3\2\2\2\64\65\5\16\b\2\65\66\b\7\1\2\66\r\3\2\2\2\678\b"+
		"\b\1\289\7\5\2\29:\5\16\b\2:;\7\6\2\2;<\b\b\1\2<\u0081\3\2\2\2=>\5\20"+
		"\t\2>?\7\7\2\2?@\b\b\1\2@\u0081\3\2\2\2AB\5\20\t\2BC\7\b\2\2CD\b\b\1\2"+
		"D\u0081\3\2\2\2EF\7\7\2\2FG\5\20\t\2GH\b\b\1\2H\u0081\3\2\2\2IJ\7\b\2"+
		"\2JK\5\20\t\2KL\b\b\1\2L\u0081\3\2\2\2MN\7\t\2\2NO\5\20\t\2OP\b\b\1\2"+
		"P\u0081\3\2\2\2QR\7\n\2\2RS\5\20\t\2ST\b\b\1\2T\u0081\3\2\2\2UV\5\24\13"+
		"\2VW\b\b\1\2W\u0081\3\2\2\2XY\7\'\2\2Y\u0081\b\b\1\2Z[\5\20\t\2[\\\b\b"+
		"\1\2\\\u0081\3\2\2\2]^\5\20\t\2^_\7\17\2\2_`\5\16\b\t`a\b\b\1\2a\u0081"+
		"\3\2\2\2bc\5\20\t\2cd\7\20\2\2de\5\16\b\bef\b\b\1\2f\u0081\3\2\2\2gh\5"+
		"\20\t\2hi\7\21\2\2ij\5\16\b\7jk\b\b\1\2k\u0081\3\2\2\2lm\5\20\t\2mn\7"+
		"\22\2\2no\5\16\b\6op\b\b\1\2p\u0081\3\2\2\2qr\5\20\t\2rs\7\23\2\2st\5"+
		"\16\b\5tu\b\b\1\2u\u0081\3\2\2\2vw\5\20\t\2wx\7\24\2\2xy\5\16\b\4yz\b"+
		"\b\1\2z\u0081\3\2\2\2{|\5\20\t\2|}\7\25\2\2}~\5\16\b\3~\177\b\b\1\2\177"+
		"\u0081\3\2\2\2\u0080\67\3\2\2\2\u0080=\3\2\2\2\u0080A\3\2\2\2\u0080E\3"+
		"\2\2\2\u0080I\3\2\2\2\u0080M\3\2\2\2\u0080Q\3\2\2\2\u0080U\3\2\2\2\u0080"+
		"X\3\2\2\2\u0080Z\3\2\2\2\u0080]\3\2\2\2\u0080b\3\2\2\2\u0080g\3\2\2\2"+
		"\u0080l\3\2\2\2\u0080q\3\2\2\2\u0080v\3\2\2\2\u0080{\3\2\2\2\u0081\u0093"+
		"\3\2\2\2\u0082\u0083\f\17\2\2\u0083\u0084\7\13\2\2\u0084\u0085\5\16\b"+
		"\20\u0085\u0086\b\b\1\2\u0086\u0092\3\2\2\2\u0087\u0088\f\16\2\2\u0088"+
		"\u0089\t\2\2\2\u0089\u008a\5\16\b\17\u008a\u008b\b\b\1\2\u008b\u0092\3"+
		"\2\2\2\u008c\u008d\f\r\2\2\u008d\u008e\t\3\2\2\u008e\u008f\5\16\b\16\u008f"+
		"\u0090\b\b\1\2\u0090\u0092\3\2\2\2\u0091\u0082\3\2\2\2\u0091\u0087\3\2"+
		"\2\2\u0091\u008c\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\17\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7&\2\2"+
		"\u0097\u009c\b\t\1\2\u0098\u0099\5\22\n\2\u0099\u009a\b\t\1\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0098\3\2\2\2\u009c\21\3\2\2\2\u009d"+
		"\u009e\7&\2\2\u009e\u009f\7\26\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\7"+
		"\27\2\2\u00a1\u00a2\b\n\1\2\u00a2\23\3\2\2\2\u00a3\u00a4\7&\2\2\u00a4"+
		"\u00a5\7\5\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\b"+
		"\13\1\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\7&\2\2\u00aa\u00ab\7\30\2\2\u00ab"+
		"\u00ad\b\13\1\2\u00ac\u00a3\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\25\3\2\2"+
		"\2\u00ae\u00af\b\f\1\2\u00af\u00b0\5\16\b\2\u00b0\u00b1\7\31\2\2\u00b1"+
		"\u00b2\5\16\b\2\u00b2\u00b3\b\f\1\2\u00b3\u00db\3\2\2\2\u00b4\u00b5\5"+
		"\16\b\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\5\16\b\2\u00b7\u00b8\b\f\1\2"+
		"\u00b8\u00db\3\2\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\7\33\2\2\u00bb\u00bc"+
		"\5\16\b\2\u00bc\u00bd\b\f\1\2\u00bd\u00db\3\2\2\2\u00be\u00bf\5\16\b\2"+
		"\u00bf\u00c0\7\34\2\2\u00c0\u00c1\5\16\b\2\u00c1\u00c2\b\f\1\2\u00c2\u00db"+
		"\3\2\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\7\35\2\2\u00c5\u00c6\5\16\b"+
		"\2\u00c6\u00c7\b\f\1\2\u00c7\u00db\3\2\2\2\u00c8\u00c9\5\16\b\2\u00c9"+
		"\u00ca\7\36\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\b\f\1\2\u00cc\u00db\3"+
		"\2\2\2\u00cd\u00ce\7\37\2\2\u00ce\u00cf\5\26\f\b\u00cf\u00d0\b\f\1\2\u00d0"+
		"\u00db\3\2\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00db\b\f\1\2\u00d3\u00d4\7#"+
		"\2\2\u00d4\u00db\b\f\1\2\u00d5\u00d6\7&\2\2\u00d6\u00d7\7\17\2\2\u00d7"+
		"\u00d8\5\26\f\3\u00d8\u00d9\b\f\1\2\u00d9\u00db\3\2\2\2\u00da\u00ae\3"+
		"\2\2\2\u00da\u00b4\3\2\2\2\u00da\u00b9\3\2\2\2\u00da\u00be\3\2\2\2\u00da"+
		"\u00c3\3\2\2\2\u00da\u00c8\3\2\2\2\u00da\u00cd\3\2\2\2\u00da\u00d1\3\2"+
		"\2\2\u00da\u00d3\3\2\2\2\u00da\u00d5\3\2\2\2\u00db\u00e8\3\2\2\2\u00dc"+
		"\u00dd\f\7\2\2\u00dd\u00de\7 \2\2\u00de\u00df\5\26\f\b\u00df\u00e0\b\f"+
		"\1\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2\f\6\2\2\u00e2\u00e3\7!\2\2\u00e3"+
		"\u00e4\5\26\f\7\u00e4\u00e5\b\f\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00dc\3"+
		"\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\27\3\2\2\2\u00ea\u00e8\3\2\2\2\r\33!\61\u0080\u0091"+
		"\u0093\u009b\u00ac\u00da\u00e6\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}