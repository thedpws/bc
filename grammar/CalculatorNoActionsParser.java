// Generated from CalculatorNoActions.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorNoActionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, COMMENT=49, QUIT=50, ID=51, NUM=52, WS=53, 
		NEWLINE=54;
	public static final int
		RULE_program = 0, RULE_topStatement = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_statementList = 4, RULE_block = 5, RULE_whileLoop = 6, RULE_forLoop = 7, 
		RULE_ifStatement = 8, RULE_defineFunction = 9, RULE_condition = 10, RULE_libCall = 11, 
		RULE_readCall = 12, RULE_unaryOperator = 13, RULE_binaryOperator1 = 14, 
		RULE_binaryOperator2 = 15, RULE_binaryOperator3 = 16, RULE_operatorAssignment1 = 17, 
		RULE_operatorAssignment2 = 18, RULE_operatorAssignment3 = 19, RULE_operatorAssignment4 = 20, 
		RULE_comparisonOperator = 21, RULE_booleanUnaryOperator = 22, RULE_booleanBinaryOperator1 = 23, 
		RULE_booleanBinaryOperator2 = 24, RULE_variable = 25, RULE_fname = 26, 
		RULE_parameters = 27, RULE_defParameters = 28, RULE_delimiter = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topStatement", "statement", "expression", "statementList", 
			"block", "whileLoop", "forLoop", "ifStatement", "defineFunction", "condition", 
			"libCall", "readCall", "unaryOperator", "binaryOperator1", "binaryOperator2", 
			"binaryOperator3", "operatorAssignment1", "operatorAssignment2", "operatorAssignment3", 
			"operatorAssignment4", "comparisonOperator", "booleanUnaryOperator", 
			"booleanBinaryOperator1", "booleanBinaryOperator2", "variable", "fname", 
			"parameters", "defParameters", "delimiter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'continue'", "'halt'", "'return'", "'('", "')'", "'{'", 
			"'\n'", "'}'", "'while'", "'for'", "';'", "'if'", "'else'", "'define'", 
			"'true'", "'false'", "'s'", "'c'", "'l'", "'e'", "'sqrt'", "'read'", 
			"'++'", "'--'", "'-'", "'+'", "'^'", "'*'", "'/'", "'%'", "'^='", "'*='", 
			"'/='", "'%='", "'+='", "'-='", "'='", "'<'", "'<='", "'=='", "'!='", 
			"'>='", "'>'", "'!'", "'&&'", "'||'", "','", null, "'quit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "COMMENT", "QUIT", "ID", "NUM", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "CalculatorNoActions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorNoActionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DelimiterContext> delimiter() {
			return getRuleContexts(DelimiterContext.class);
		}
		public DelimiterContext delimiter(int i) {
			return getRuleContext(DelimiterContext.class,i);
		}
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__11) {
				{
				{
				setState(60);
				delimiter();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << QUIT) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(66);
				topStatement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
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

	public static class TopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<DelimiterContext> delimiter() {
			return getRuleContexts(DelimiterContext.class);
		}
		public DelimiterContext delimiter(int i) {
			return getRuleContext(DelimiterContext.class,i);
		}
		public TopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterTopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitTopStatement(this);
		}
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			statement();
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				delimiter();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==T__11 );

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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DefineFunctionContext defineFunction() {
			return getRuleContext(DefineFunctionContext.class,0);
		}
		public TerminalNode QUIT() { return getToken(CalculatorNoActionsParser.QUIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				block();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				whileLoop();

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				forLoop();

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				ifStatement();

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				defineFunction();

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(T__0);

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				match(T__1);

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==QUIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				match(T__3);
				setState(102);
				expression(0);

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(105);
				match(T__3);

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				condition(0);

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(110);
				expression(0);

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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext operand1;
		public ExpressionContext operand2;
		public TerminalNode NUM() { return getToken(CalculatorNoActionsParser.NUM, 0); }
		public ReadCallContext readCall() {
			return getRuleContext(ReadCallContext.class,0);
		}
		public LibCallContext libCall() {
			return getRuleContext(LibCallContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public OperatorAssignment1Context operatorAssignment1() {
			return getRuleContext(OperatorAssignment1Context.class,0);
		}
		public OperatorAssignment2Context operatorAssignment2() {
			return getRuleContext(OperatorAssignment2Context.class,0);
		}
		public OperatorAssignment3Context operatorAssignment3() {
			return getRuleContext(OperatorAssignment3Context.class,0);
		}
		public OperatorAssignment4Context operatorAssignment4() {
			return getRuleContext(OperatorAssignment4Context.class,0);
		}
		public BinaryOperator1Context binaryOperator1() {
			return getRuleContext(BinaryOperator1Context.class,0);
		}
		public BinaryOperator2Context binaryOperator2() {
			return getRuleContext(BinaryOperator2Context.class,0);
		}
		public BinaryOperator3Context binaryOperator3() {
			return getRuleContext(BinaryOperator3Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitExpression(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(116);
				match(NUM);

				}
				break;
			case 2:
				{
				setState(118);
				readCall();
				setState(119);
				match(T__4);
				setState(120);
				match(T__5);

				}
				break;
			case 3:
				{
				setState(123);
				libCall();
				setState(124);
				match(T__4);
				setState(125);
				parameters();
				setState(126);
				match(T__5);

				}
				break;
			case 4:
				{
				setState(129);
				fname();
				setState(130);
				match(T__4);
				setState(131);
				match(T__5);

				}
				break;
			case 5:
				{
				setState(134);
				fname();
				setState(135);
				match(T__4);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(136);
					parameters();
					}
				}

				setState(139);
				match(T__5);

				}
				break;
			case 6:
				{
				setState(142);
				variable();

				}
				break;
			case 7:
				{
				setState(145);
				match(T__4);
				setState(146);
				expression(0);
				setState(147);
				match(T__5);

				}
				break;
			case 8:
				{
				setState(150);
				variable();
				setState(151);
				unaryOperator();

				}
				break;
			case 9:
				{
				setState(154);
				unaryOperator();
				setState(155);
				variable();

				}
				break;
			case 10:
				{
				setState(158);
				unaryOperator();
				setState(159);
				expression(5);

				}
				break;
			case 11:
				{
				setState(162);
				variable();
				setState(163);
				operatorAssignment1();
				setState(164);
				expression(4);

				}
				break;
			case 12:
				{
				setState(167);
				variable();
				setState(168);
				operatorAssignment2();
				setState(169);
				expression(3);

				}
				break;
			case 13:
				{
				setState(172);
				variable();
				setState(173);
				operatorAssignment3();
				setState(174);
				expression(2);

				}
				break;
			case 14:
				{
				setState(177);
				variable();
				setState(178);
				operatorAssignment4();
				setState(179);
				expression(1);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(185);
						binaryOperator1();
						setState(186);
						((ExpressionContext)_localctx).operand2 = expression(11);

						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(190);
						binaryOperator2();
						setState(191);
						((ExpressionContext)_localctx).operand2 = expression(10);

						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(195);
						binaryOperator3();
						setState(196);
						((ExpressionContext)_localctx).operand2 = expression(9);

						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<DelimiterContext> delimiter() {
			return getRuleContexts(DelimiterContext.class);
		}
		public DelimiterContext delimiter(int i) {
			return getRuleContext(DelimiterContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		try {
			int _alt;
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(204);
				statement();
				setState(206); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(205);
						delimiter();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(208); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(210);
				statementList();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				statement();
				setState(215); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(214);
						delimiter();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(217); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				}

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
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__6);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					match(T__7);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			{
			setState(232);
			statementList();
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(233);
				match(T__7);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__8);

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

	public static class WhileLoopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileLoop);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__9);
				setState(243);
				match(T__4);
				setState(244);
				condition(0);
				setState(245);
				match(T__5);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(246);
					match(T__7);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				block();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(T__9);
				setState(256);
				match(T__4);
				setState(257);
				condition(0);
				setState(258);
				match(T__5);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(259);
					match(T__7);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				statement();

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

	public static class ForLoopContext extends ParserRuleContext {
		public StatementContext expr1;
		public ConditionContext expr2;
		public StatementContext expr3;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__10);
			setState(271);
			match(T__4);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << QUIT) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(272);
				((ForLoopContext)_localctx).expr1 = statement();
				}
			}

			setState(275);
			match(T__11);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(276);
				((ForLoopContext)_localctx).expr2 = condition(0);
				}
			}

			setState(279);
			match(T__11);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__44) | (1L << QUIT) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(280);
				((ForLoopContext)_localctx).expr3 = statement();
				}
			}

			setState(283);
			match(T__5);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(284);
				match(T__7);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			statement();

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

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext trueBranch;
		public StatementContext falseBranch;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DelimiterContext> delimiter() {
			return getRuleContexts(DelimiterContext.class);
		}
		public DelimiterContext delimiter(int i) {
			return getRuleContext(DelimiterContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__12);
				setState(294);
				match(T__4);
				setState(295);
				condition(0);
				setState(296);
				match(T__5);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__11) {
					{
					{
					setState(297);
					delimiter();
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				((IfStatementContext)_localctx).trueBranch = statement();
				setState(304);
				match(T__13);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(305);
					match(T__7);
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				((IfStatementContext)_localctx).falseBranch = statement();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__12);
				setState(315);
				match(T__4);
				setState(316);
				condition(0);
				setState(317);
				match(T__5);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__11) {
					{
					{
					setState(318);
					delimiter();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				((IfStatementContext)_localctx).trueBranch = statement();

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

	public static class DefineFunctionContext extends ParserRuleContext {
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DelimiterContext> delimiter() {
			return getRuleContexts(DelimiterContext.class);
		}
		public DelimiterContext delimiter(int i) {
			return getRuleContext(DelimiterContext.class,i);
		}
		public DefParametersContext defParameters() {
			return getRuleContext(DefParametersContext.class,0);
		}
		public DefineFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterDefineFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitDefineFunction(this);
		}
	}

	public final DefineFunctionContext defineFunction() throws RecognitionException {
		DefineFunctionContext _localctx = new DefineFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineFunction);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(T__14);
				setState(330);
				fname();
				setState(331);
				match(T__4);
				setState(332);
				match(T__5);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__11) {
					{
					{
					setState(333);
					delimiter();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				block();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(T__14);
				setState(343);
				fname();
				setState(344);
				match(T__4);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(345);
					defParameters();
					}
				}

				setState(348);
				match(T__5);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__11) {
					{
					{
					setState(349);
					delimiter();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				block();

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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext leftCondition;
		public ExpressionContext lexpr;
		public ExpressionContext rexpr;
		public ConditionContext rightCondition;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public BooleanUnaryOperatorContext booleanUnaryOperator() {
			return getRuleContext(BooleanUnaryOperatorContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanBinaryOperator1Context booleanBinaryOperator1() {
			return getRuleContext(BooleanBinaryOperator1Context.class,0);
		}
		public BooleanBinaryOperator2Context booleanBinaryOperator2() {
			return getRuleContext(BooleanBinaryOperator2Context.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(361);
				match(T__15);

				}
				break;
			case 2:
				{
				setState(363);
				match(T__16);

				}
				break;
			case 3:
				{
				setState(365);
				match(T__4);
				setState(366);
				condition(0);
				setState(367);
				match(T__5);

				}
				break;
			case 4:
				{
				setState(370);
				booleanUnaryOperator();
				setState(371);
				condition(4);

				}
				break;
			case 5:
				{
				setState(374);
				((ConditionContext)_localctx).lexpr = expression(0);
				setState(375);
				comparisonOperator();
				setState(376);
				((ConditionContext)_localctx).rexpr = expression(0);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.leftCondition = _prevctx;
						_localctx.leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(381);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(382);
						booleanBinaryOperator1();
						setState(383);
						((ConditionContext)_localctx).rightCondition = condition(3);

						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.leftCondition = _prevctx;
						_localctx.leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(386);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(387);
						booleanBinaryOperator2();
						setState(388);
						((ConditionContext)_localctx).rightCondition = condition(2);

						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class LibCallContext extends ParserRuleContext {
		public LibCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterLibCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitLibCall(this);
		}
	}

	public final LibCallContext libCall() throws RecognitionException {
		LibCallContext _localctx = new LibCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_libCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class ReadCallContext extends ParserRuleContext {
		public ReadCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterReadCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitReadCall(this);
		}
	}

	public final ReadCallContext readCall() throws RecognitionException {
		ReadCallContext _localctx = new ReadCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_readCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(398);
			match(T__22);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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

	public static class BinaryOperator1Context extends ParserRuleContext {
		public BinaryOperator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterBinaryOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitBinaryOperator1(this);
		}
	}

	public final BinaryOperator1Context binaryOperator1() throws RecognitionException {
		BinaryOperator1Context _localctx = new BinaryOperator1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_binaryOperator1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__27);
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

	public static class BinaryOperator2Context extends ParserRuleContext {
		public BinaryOperator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterBinaryOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitBinaryOperator2(this);
		}
	}

	public final BinaryOperator2Context binaryOperator2() throws RecognitionException {
		BinaryOperator2Context _localctx = new BinaryOperator2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryOperator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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

	public static class BinaryOperator3Context extends ParserRuleContext {
		public BinaryOperator3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterBinaryOperator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitBinaryOperator3(this);
		}
	}

	public final BinaryOperator3Context binaryOperator3() throws RecognitionException {
		BinaryOperator3Context _localctx = new BinaryOperator3Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_binaryOperator3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
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

	public static class OperatorAssignment1Context extends ParserRuleContext {
		public OperatorAssignment1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAssignment1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterOperatorAssignment1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitOperatorAssignment1(this);
		}
	}

	public final OperatorAssignment1Context operatorAssignment1() throws RecognitionException {
		OperatorAssignment1Context _localctx = new OperatorAssignment1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_operatorAssignment1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__31);
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

	public static class OperatorAssignment2Context extends ParserRuleContext {
		public OperatorAssignment2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAssignment2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterOperatorAssignment2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitOperatorAssignment2(this);
		}
	}

	public final OperatorAssignment2Context operatorAssignment2() throws RecognitionException {
		OperatorAssignment2Context _localctx = new OperatorAssignment2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_operatorAssignment2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class OperatorAssignment3Context extends ParserRuleContext {
		public OperatorAssignment3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAssignment3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterOperatorAssignment3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitOperatorAssignment3(this);
		}
	}

	public final OperatorAssignment3Context operatorAssignment3() throws RecognitionException {
		OperatorAssignment3Context _localctx = new OperatorAssignment3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_operatorAssignment3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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

	public static class OperatorAssignment4Context extends ParserRuleContext {
		public OperatorAssignment4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAssignment4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterOperatorAssignment4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitOperatorAssignment4(this);
		}
	}

	public final OperatorAssignment4Context operatorAssignment4() throws RecognitionException {
		OperatorAssignment4Context _localctx = new OperatorAssignment4Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_operatorAssignment4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__37);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
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

	public static class BooleanUnaryOperatorContext extends ParserRuleContext {
		public BooleanUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterBooleanUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitBooleanUnaryOperator(this);
		}
	}

	public final BooleanUnaryOperatorContext booleanUnaryOperator() throws RecognitionException {
		BooleanUnaryOperatorContext _localctx = new BooleanUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanUnaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(T__44);
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

	public static class BooleanBinaryOperator1Context extends ParserRuleContext {
		public BooleanBinaryOperator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanBinaryOperator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterBooleanBinaryOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitBooleanBinaryOperator1(this);
		}
	}

	public final BooleanBinaryOperator1Context booleanBinaryOperator1() throws RecognitionException {
		BooleanBinaryOperator1Context _localctx = new BooleanBinaryOperator1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanBinaryOperator1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__45);
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

	public static class BooleanBinaryOperator2Context extends ParserRuleContext {
		public BooleanBinaryOperator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanBinaryOperator2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterBooleanBinaryOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitBooleanBinaryOperator2(this);
		}
	}

	public final BooleanBinaryOperator2Context booleanBinaryOperator2() throws RecognitionException {
		BooleanBinaryOperator2Context _localctx = new BooleanBinaryOperator2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanBinaryOperator2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__46);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorNoActionsParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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

	public static class FnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorNoActionsParser.ID, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitFname(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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

	public static class ParametersContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameters);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				expression(0);
				setState(429);
				match(T__47);
				setState(430);
				parameters();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				expression(0);

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

	public static class DefParametersContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DefParametersContext defParameters() {
			return getRuleContext(DefParametersContext.class,0);
		}
		public DefParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterDefParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitDefParameters(this);
		}
	}

	public final DefParametersContext defParameters() throws RecognitionException {
		DefParametersContext _localctx = new DefParametersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_defParameters);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				variable();
				setState(439);
				match(T__47);
				setState(440);
				defParameters();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				variable();

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

	public static class DelimiterContext extends ParserRuleContext {
		public DelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).enterDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorNoActionsListener ) ((CalculatorNoActionsListener)listener).exitDelimiter(this);
		}
	}

	public final DelimiterContext delimiter() throws RecognitionException {
		DelimiterContext _localctx = new DelimiterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__11) ) {
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 10:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\6\3M\n\3\r\3\16"+
		"\3N\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4t\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008c\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00b9\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\u00ca\n\5\f\5\16\5\u00cd\13\5\3\6\3\6\6\6\u00d1\n\6\r"+
		"\6\16\6\u00d2\3\6\3\6\3\6\3\6\3\6\6\6\u00da\n\6\r\6\16\6\u00db\3\6\3\6"+
		"\3\6\3\6\5\6\u00e2\n\6\3\7\3\7\7\7\u00e6\n\7\f\7\16\7\u00e9\13\7\3\7\3"+
		"\7\7\7\u00ed\n\7\f\7\16\7\u00f0\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00fa\n\b\f\b\16\b\u00fd\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0107"+
		"\n\b\f\b\16\b\u010a\13\b\3\b\3\b\3\b\5\b\u010f\n\b\3\t\3\t\3\t\5\t\u0114"+
		"\n\t\3\t\3\t\5\t\u0118\n\t\3\t\3\t\5\t\u011c\n\t\3\t\3\t\7\t\u0120\n\t"+
		"\f\t\16\t\u0123\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u012d\n\n\f\n"+
		"\16\n\u0130\13\n\3\n\3\n\3\n\7\n\u0135\n\n\f\n\16\n\u0138\13\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0142\n\n\f\n\16\n\u0145\13\n\3\n\3\n\3\n"+
		"\5\n\u014a\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u0151\n\13\f\13\16\13\u0154"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u015d\n\13\3\13\3\13\7"+
		"\13\u0161\n\13\f\13\16\13\u0164\13\13\3\13\3\13\3\13\5\13\u0169\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u017e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u018a\n"+
		"\f\f\f\16\f\u018d\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01b7\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01c1\n\36\3\37\3\37\3\37\2\4\b\26 \2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<\2\13\4\2\5\5\64\64\3\2\24\31\3\2\32\35"+
		"\3\2\37!\3\2\34\35\3\2#%\3\2&\'\3\2).\4\2\n\n\16\16\2\u01e2\2A\3\2\2\2"+
		"\4J\3\2\2\2\6s\3\2\2\2\b\u00b8\3\2\2\2\n\u00e1\3\2\2\2\f\u00e3\3\2\2\2"+
		"\16\u010e\3\2\2\2\20\u0110\3\2\2\2\22\u0149\3\2\2\2\24\u0168\3\2\2\2\26"+
		"\u017d\3\2\2\2\30\u018e\3\2\2\2\32\u0190\3\2\2\2\34\u0192\3\2\2\2\36\u0194"+
		"\3\2\2\2 \u0196\3\2\2\2\"\u0198\3\2\2\2$\u019a\3\2\2\2&\u019c\3\2\2\2"+
		"(\u019e\3\2\2\2*\u01a0\3\2\2\2,\u01a2\3\2\2\2.\u01a4\3\2\2\2\60\u01a6"+
		"\3\2\2\2\62\u01a8\3\2\2\2\64\u01aa\3\2\2\2\66\u01ac\3\2\2\28\u01b6\3\2"+
		"\2\2:\u01c0\3\2\2\2<\u01c2\3\2\2\2>@\5<\37\2?>\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2"+
		"\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JL\5\6\4\2KM\5<\37\2LK\3\2\2\2MN\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\3\1\2Q\5\3\2\2\2RS\5\f\7\2ST"+
		"\b\4\1\2Tt\3\2\2\2UV\5\16\b\2VW\b\4\1\2Wt\3\2\2\2XY\5\20\t\2YZ\b\4\1\2"+
		"Zt\3\2\2\2[\\\5\22\n\2\\]\b\4\1\2]t\3\2\2\2^_\5\24\13\2_`\b\4\1\2`t\3"+
		"\2\2\2ab\7\3\2\2bt\b\4\1\2cd\7\4\2\2dt\b\4\1\2ef\t\2\2\2ft\b\4\1\2gh\7"+
		"\6\2\2hi\5\b\5\2ij\b\4\1\2jt\3\2\2\2kl\7\6\2\2lt\b\4\1\2mn\5\26\f\2no"+
		"\b\4\1\2ot\3\2\2\2pq\5\b\5\2qr\b\4\1\2rt\3\2\2\2sR\3\2\2\2sU\3\2\2\2s"+
		"X\3\2\2\2s[\3\2\2\2s^\3\2\2\2sa\3\2\2\2sc\3\2\2\2se\3\2\2\2sg\3\2\2\2"+
		"sk\3\2\2\2sm\3\2\2\2sp\3\2\2\2t\7\3\2\2\2uv\b\5\1\2vw\7\66\2\2w\u00b9"+
		"\b\5\1\2xy\5\32\16\2yz\7\7\2\2z{\7\b\2\2{|\b\5\1\2|\u00b9\3\2\2\2}~\5"+
		"\30\r\2~\177\7\7\2\2\177\u0080\58\35\2\u0080\u0081\7\b\2\2\u0081\u0082"+
		"\b\5\1\2\u0082\u00b9\3\2\2\2\u0083\u0084\5\66\34\2\u0084\u0085\7\7\2\2"+
		"\u0085\u0086\7\b\2\2\u0086\u0087\b\5\1\2\u0087\u00b9\3\2\2\2\u0088\u0089"+
		"\5\66\34\2\u0089\u008b\7\7\2\2\u008a\u008c\58\35\2\u008b\u008a\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\b\2\2\u008e\u008f"+
		"\b\5\1\2\u008f\u00b9\3\2\2\2\u0090\u0091\5\64\33\2\u0091\u0092\b\5\1\2"+
		"\u0092\u00b9\3\2\2\2\u0093\u0094\7\7\2\2\u0094\u0095\5\b\5\2\u0095\u0096"+
		"\7\b\2\2\u0096\u0097\b\5\1\2\u0097\u00b9\3\2\2\2\u0098\u0099\5\64\33\2"+
		"\u0099\u009a\5\34\17\2\u009a\u009b\b\5\1\2\u009b\u00b9\3\2\2\2\u009c\u009d"+
		"\5\34\17\2\u009d\u009e\5\64\33\2\u009e\u009f\b\5\1\2\u009f\u00b9\3\2\2"+
		"\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\5\b\5\7\u00a2\u00a3\b\5\1\2\u00a3"+
		"\u00b9\3\2\2\2\u00a4\u00a5\5\64\33\2\u00a5\u00a6\5$\23\2\u00a6\u00a7\5"+
		"\b\5\6\u00a7\u00a8\b\5\1\2\u00a8\u00b9\3\2\2\2\u00a9\u00aa\5\64\33\2\u00aa"+
		"\u00ab\5&\24\2\u00ab\u00ac\5\b\5\5\u00ac\u00ad\b\5\1\2\u00ad\u00b9\3\2"+
		"\2\2\u00ae\u00af\5\64\33\2\u00af\u00b0\5(\25\2\u00b0\u00b1\5\b\5\4\u00b1"+
		"\u00b2\b\5\1\2\u00b2\u00b9\3\2\2\2\u00b3\u00b4\5\64\33\2\u00b4\u00b5\5"+
		"*\26\2\u00b5\u00b6\5\b\5\3\u00b6\u00b7\b\5\1\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"u\3\2\2\2\u00b8x\3\2\2\2\u00b8}\3\2\2\2\u00b8\u0083\3\2\2\2\u00b8\u0088"+
		"\3\2\2\2\u00b8\u0090\3\2\2\2\u00b8\u0093\3\2\2\2\u00b8\u0098\3\2\2\2\u00b8"+
		"\u009c\3\2\2\2\u00b8\u00a0\3\2\2\2\u00b8\u00a4\3\2\2\2\u00b8\u00a9\3\2"+
		"\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b9\u00cb\3\2\2\2\u00ba"+
		"\u00bb\f\f\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\5\b\5\r\u00bd\u00be\b"+
		"\5\1\2\u00be\u00ca\3\2\2\2\u00bf\u00c0\f\13\2\2\u00c0\u00c1\5 \21\2\u00c1"+
		"\u00c2\5\b\5\f\u00c2\u00c3\b\5\1\2\u00c3\u00ca\3\2\2\2\u00c4\u00c5\f\n"+
		"\2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c7\5\b\5\13\u00c7\u00c8\b\5\1\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c4\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\t\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\5\6\4\2\u00cf\u00d1\5<\37\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5\n\6\2\u00d5\u00d6\b\6\1\2\u00d6"+
		"\u00e2\3\2\2\2\u00d7\u00d9\5\6\4\2\u00d8\u00da\5<\37\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\b\6\1\2\u00de\u00e2\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\b\6\1\2\u00e1\u00ce\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\13\3\2\2\2\u00e3\u00e7\7\t\2\2\u00e4\u00e6\7\n\2"+
		"\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ee\5\n\6\2\u00eb"+
		"\u00ed\7\n\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\7\13\2\2\u00f2\u00f3\b\7\1\2\u00f3\r\3\2\2\2\u00f4\u00f5\7\f\2"+
		"\2\u00f5\u00f6\7\7\2\2\u00f6\u00f7\5\26\f\2\u00f7\u00fb\7\b\2\2\u00f8"+
		"\u00fa\7\n\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00ff\5\f\7\2\u00ff\u0100\b\b\1\2\u0100\u010f\3\2\2\2\u0101\u0102\7\f"+
		"\2\2\u0102\u0103\7\7\2\2\u0103\u0104\5\26\f\2\u0104\u0108\7\b\2\2\u0105"+
		"\u0107\7\n\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\5\6\4\2\u010c\u010d\b\b\1\2\u010d\u010f\3\2\2\2\u010e\u00f4\3\2"+
		"\2\2\u010e\u0101\3\2\2\2\u010f\17\3\2\2\2\u0110\u0111\7\r\2\2\u0111\u0113"+
		"\7\7\2\2\u0112\u0114\5\6\4\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0117\7\16\2\2\u0116\u0118\5\26\f\2\u0117\u0116\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\16\2\2\u011a"+
		"\u011c\5\6\4\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0121\7\b\2\2\u011e\u0120\7\n\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\5\6\4\2\u0125\u0126\b\t\1\2\u0126"+
		"\21\3\2\2\2\u0127\u0128\7\17\2\2\u0128\u0129\7\7\2\2\u0129\u012a\5\26"+
		"\f\2\u012a\u012e\7\b\2\2\u012b\u012d\5<\37\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5\6\4\2\u0132\u0136\7\20\2\2\u0133"+
		"\u0135\7\n\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013a\5\6\4\2\u013a\u013b\b\n\1\2\u013b\u014a\3\2\2\2\u013c\u013d\7\17"+
		"\2\2\u013d\u013e\7\7\2\2\u013e\u013f\5\26\f\2\u013f\u0143\7\b\2\2\u0140"+
		"\u0142\5<\37\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0147\5\6\4\2\u0147\u0148\b\n\1\2\u0148\u014a\3\2\2\2\u0149\u0127\3\2"+
		"\2\2\u0149\u013c\3\2\2\2\u014a\23\3\2\2\2\u014b\u014c\7\21\2\2\u014c\u014d"+
		"\5\66\34\2\u014d\u014e\7\7\2\2\u014e\u0152\7\b\2\2\u014f\u0151\5<\37\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5\f\7\2\u0156"+
		"\u0157\b\13\1\2\u0157\u0169\3\2\2\2\u0158\u0159\7\21\2\2\u0159\u015a\5"+
		"\66\34\2\u015a\u015c\7\7\2\2\u015b\u015d\5:\36\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0162\7\b\2\2\u015f\u0161\5<"+
		"\37\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\5\f"+
		"\7\2\u0166\u0167\b\13\1\2\u0167\u0169\3\2\2\2\u0168\u014b\3\2\2\2\u0168"+
		"\u0158\3\2\2\2\u0169\25\3\2\2\2\u016a\u016b\b\f\1\2\u016b\u016c\7\22\2"+
		"\2\u016c\u017e\b\f\1\2\u016d\u016e\7\23\2\2\u016e\u017e\b\f\1\2\u016f"+
		"\u0170\7\7\2\2\u0170\u0171\5\26\f\2\u0171\u0172\7\b\2\2\u0172\u0173\b"+
		"\f\1\2\u0173\u017e\3\2\2\2\u0174\u0175\5.\30\2\u0175\u0176\5\26\f\6\u0176"+
		"\u0177\b\f\1\2\u0177\u017e\3\2\2\2\u0178\u0179\5\b\5\2\u0179\u017a\5,"+
		"\27\2\u017a\u017b\5\b\5\2\u017b\u017c\b\f\1\2\u017c\u017e\3\2\2\2\u017d"+
		"\u016a\3\2\2\2\u017d\u016d\3\2\2\2\u017d\u016f\3\2\2\2\u017d\u0174\3\2"+
		"\2\2\u017d\u0178\3\2\2\2\u017e\u018b\3\2\2\2\u017f\u0180\f\4\2\2\u0180"+
		"\u0181\5\60\31\2\u0181\u0182\5\26\f\5\u0182\u0183\b\f\1\2\u0183\u018a"+
		"\3\2\2\2\u0184\u0185\f\3\2\2\u0185\u0186\5\62\32\2\u0186\u0187\5\26\f"+
		"\4\u0187\u0188\b\f\1\2\u0188\u018a\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0184"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\27\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\t\3\2\2\u018f\31\3\2\2\2\u0190"+
		"\u0191\7\31\2\2\u0191\33\3\2\2\2\u0192\u0193\t\4\2\2\u0193\35\3\2\2\2"+
		"\u0194\u0195\7\36\2\2\u0195\37\3\2\2\2\u0196\u0197\t\5\2\2\u0197!\3\2"+
		"\2\2\u0198\u0199\t\6\2\2\u0199#\3\2\2\2\u019a\u019b\7\"\2\2\u019b%\3\2"+
		"\2\2\u019c\u019d\t\7\2\2\u019d\'\3\2\2\2\u019e\u019f\t\b\2\2\u019f)\3"+
		"\2\2\2\u01a0\u01a1\7(\2\2\u01a1+\3\2\2\2\u01a2\u01a3\t\t\2\2\u01a3-\3"+
		"\2\2\2\u01a4\u01a5\7/\2\2\u01a5/\3\2\2\2\u01a6\u01a7\7\60\2\2\u01a7\61"+
		"\3\2\2\2\u01a8\u01a9\7\61\2\2\u01a9\63\3\2\2\2\u01aa\u01ab\7\65\2\2\u01ab"+
		"\65\3\2\2\2\u01ac\u01ad\7\65\2\2\u01ad\67\3\2\2\2\u01ae\u01af\5\b\5\2"+
		"\u01af\u01b0\7\62\2\2\u01b0\u01b1\58\35\2\u01b1\u01b2\b\35\1\2\u01b2\u01b7"+
		"\3\2\2\2\u01b3\u01b4\5\b\5\2\u01b4\u01b5\b\35\1\2\u01b5\u01b7\3\2\2\2"+
		"\u01b6\u01ae\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b79\3\2\2\2\u01b8\u01b9\5"+
		"\64\33\2\u01b9\u01ba\7\62\2\2\u01ba\u01bb\5:\36\2\u01bb\u01bc\b\36\1\2"+
		"\u01bc\u01c1\3\2\2\2\u01bd\u01be\5\64\33\2\u01be\u01bf\b\36\1\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01b8\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c1;\3\2\2\2"+
		"\u01c2\u01c3\t\n\2\2\u01c3=\3\2\2\2#AGNs\u008b\u00b8\u00c9\u00cb\u00d2"+
		"\u00db\u00e1\u00e7\u00ee\u00fb\u0108\u010e\u0113\u0117\u011b\u0121\u012e"+
		"\u0136\u0143\u0149\u0152\u015c\u0162\u0168\u017d\u0189\u018b\u01b6\u01c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}