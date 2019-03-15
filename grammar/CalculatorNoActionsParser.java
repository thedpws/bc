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
		T__38=39, T__39=40, T__40=41, T__41=42, COMMENT=43, QUIT=44, ID=45, NUM=46, 
		WS=47, NEWLINE=48;
	public static final int
		RULE_program = 0, RULE_topStatement = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_statementList = 4, RULE_block = 5, RULE_whileLoop = 6, RULE_forLoop = 7, 
		RULE_ifStatement = 8, RULE_defineFunction = 9, RULE_condition = 10, RULE_unaryOperator = 11, 
		RULE_binaryOperator1 = 12, RULE_binaryOperator2 = 13, RULE_binaryOperator3 = 14, 
		RULE_operatorAssignment1 = 15, RULE_operatorAssignment2 = 16, RULE_operatorAssignment3 = 17, 
		RULE_operatorAssignment4 = 18, RULE_comparisonOperator = 19, RULE_booleanUnaryOperator = 20, 
		RULE_booleanBinaryOperator1 = 21, RULE_booleanBinaryOperator2 = 22, RULE_variable = 23, 
		RULE_fname = 24, RULE_parameters = 25, RULE_defParameters = 26, RULE_delimiter = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topStatement", "statement", "expression", "statementList", 
			"block", "whileLoop", "forLoop", "ifStatement", "defineFunction", "condition", 
			"unaryOperator", "binaryOperator1", "binaryOperator2", "binaryOperator3", 
			"operatorAssignment1", "operatorAssignment2", "operatorAssignment3", 
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
			"'true'", "'false'", "'++'", "'--'", "'-'", "'+'", "'^'", "'*'", "'/'", 
			"'%'", "'^='", "'*='", "'/='", "'%='", "'+='", "'-='", "'='", "'<'", 
			"'<='", "'=='", "'!='", "'>='", "'>'", "'!'", "'&&'", "'||'", "','", 
			null, "'quit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "COMMENT", "QUIT", "ID", "NUM", 
			"WS", "NEWLINE"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(56);
				topStatement();
				}
				}
				setState(61);
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
			setState(62);
			statement();
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				delimiter();
				}
				}
				setState(66); 
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				block();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				whileLoop();

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				forLoop();

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				ifStatement();

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				defineFunction();

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(T__0);

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				match(T__1);

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				match(T__2);

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				match(T__3);
				setState(92);
				expression(0);

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				match(T__3);

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
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
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(103);
				match(NUM);

				}
				break;
			case 2:
				{
				setState(105);
				fname();
				setState(106);
				match(T__4);
				setState(107);
				parameters();
				setState(108);
				match(T__5);

				}
				break;
			case 3:
				{
				setState(111);
				variable();

				}
				break;
			case 4:
				{
				setState(114);
				match(T__4);
				setState(115);
				expression(0);
				setState(116);
				match(T__5);

				}
				break;
			case 5:
				{
				setState(119);
				variable();
				setState(120);
				unaryOperator();

				}
				break;
			case 6:
				{
				setState(123);
				unaryOperator();
				setState(124);
				variable();

				}
				break;
			case 7:
				{
				setState(127);
				unaryOperator();
				setState(128);
				expression(5);

				}
				break;
			case 8:
				{
				setState(131);
				variable();
				setState(132);
				operatorAssignment1();
				setState(133);
				expression(4);

				}
				break;
			case 9:
				{
				setState(136);
				variable();
				setState(137);
				operatorAssignment2();
				setState(138);
				expression(3);

				}
				break;
			case 10:
				{
				setState(141);
				variable();
				setState(142);
				operatorAssignment3();
				setState(143);
				expression(2);

				}
				break;
			case 11:
				{
				setState(146);
				variable();
				setState(147);
				operatorAssignment4();
				setState(148);
				expression(1);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(154);
						binaryOperator1();
						setState(155);
						((ExpressionContext)_localctx).operand2 = expression(11);

						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(159);
						binaryOperator2();
						setState(160);
						((ExpressionContext)_localctx).operand2 = expression(10);

						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
						binaryOperator3();
						setState(165);
						((ExpressionContext)_localctx).operand2 = expression(9);

						}
						break;
					}
					} 
				}
				setState(172);
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(173);
				statement();
				setState(175); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(174);
						delimiter();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(177); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(179);
				statementList();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				statement();
				setState(184); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(183);
						delimiter();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(186); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(194);
			match(T__6);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(T__7);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			{
			setState(201);
			statementList();
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(202);
				match(T__7);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__9);
			setState(212);
			match(T__4);
			setState(213);
			condition(0);
			setState(214);
			match(T__5);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(215);
				match(T__7);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
			setState(224);
			match(T__10);
			setState(225);
			match(T__4);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(226);
				((ForLoopContext)_localctx).expr1 = statement();
				}
			}

			setState(229);
			match(T__11);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__38) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(230);
				((ForLoopContext)_localctx).expr2 = condition(0);
				}
			}

			setState(233);
			match(T__11);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(234);
				((ForLoopContext)_localctx).expr3 = statement();
				}
			}

			setState(237);
			match(T__5);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(238);
				match(T__7);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__12);
				setState(248);
				match(T__4);
				setState(249);
				condition(0);
				setState(250);
				match(T__5);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__11) {
					{
					{
					setState(251);
					delimiter();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				((IfStatementContext)_localctx).trueBranch = statement();
				setState(258);
				match(T__13);
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
				((IfStatementContext)_localctx).falseBranch = statement();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(T__12);
				setState(269);
				match(T__4);
				setState(270);
				condition(0);
				setState(271);
				match(T__5);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__11) {
					{
					{
					setState(272);
					delimiter();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
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
		public DefParametersContext defParameters() {
			return getRuleContext(DefParametersContext.class,0);
		}
		public List<DelimiterContext> delimiter() {
			return getRuleContexts(DelimiterContext.class);
		}
		public DelimiterContext delimiter(int i) {
			return getRuleContext(DelimiterContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__14);
			setState(284);
			fname();
			setState(285);
			match(T__4);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(286);
				defParameters();
				}
			}

			setState(289);
			match(T__5);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__11) {
				{
				{
				setState(290);
				delimiter();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(300);
				match(T__15);

				}
				break;
			case 2:
				{
				setState(302);
				match(T__16);

				}
				break;
			case 3:
				{
				setState(304);
				match(T__4);
				setState(305);
				condition(0);
				setState(306);
				match(T__5);

				}
				break;
			case 4:
				{
				setState(309);
				booleanUnaryOperator();
				setState(310);
				condition(4);

				}
				break;
			case 5:
				{
				setState(313);
				((ConditionContext)_localctx).lexpr = expression(0);
				setState(314);
				comparisonOperator();
				setState(315);
				((ConditionContext)_localctx).rexpr = expression(0);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.leftCondition = _prevctx;
						_localctx.leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(320);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(321);
						booleanBinaryOperator1();
						setState(322);
						((ConditionContext)_localctx).rightCondition = condition(3);

						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.leftCondition = _prevctx;
						_localctx.leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(325);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(326);
						booleanBinaryOperator2();
						setState(327);
						((ConditionContext)_localctx).rightCondition = condition(2);

						}
						break;
					}
					} 
				}
				setState(334);
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
		enterRule(_localctx, 22, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_binaryOperator1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__21);
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
		enterRule(_localctx, 26, RULE_binaryOperator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_binaryOperator3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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
		enterRule(_localctx, 30, RULE_operatorAssignment1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__25);
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
		enterRule(_localctx, 32, RULE_operatorAssignment2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_operatorAssignment3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
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
		enterRule(_localctx, 36, RULE_operatorAssignment4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 38, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_booleanUnaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__38);
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
		enterRule(_localctx, 42, RULE_booleanBinaryOperator1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__39);
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
		enterRule(_localctx, 44, RULE_booleanBinaryOperator2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__40);
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
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 48, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 50, RULE_parameters);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				expression(0);
				setState(364);
				match(T__41);
				setState(365);
				parameters();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
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
		enterRule(_localctx, 52, RULE_defParameters);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				variable();
				setState(374);
				match(T__41);
				setState(375);
				defParameters();

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
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
		enterRule(_localctx, 54, RULE_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0184\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\6\3C\n\3\r\3\16\3D\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4g\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u009a\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u00ab\n\5\f\5\16\5\u00ae\13\5\3\6\3\6\6\6\u00b2\n\6"+
		"\r\6\16\6\u00b3\3\6\3\6\3\6\3\6\3\6\6\6\u00bb\n\6\r\6\16\6\u00bc\3\6\3"+
		"\6\3\6\3\6\5\6\u00c3\n\6\3\7\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca\13\7\3\7"+
		"\3\7\7\7\u00ce\n\7\f\7\16\7\u00d1\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00db\n\b\f\b\16\b\u00de\13\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00e6\n"+
		"\t\3\t\3\t\5\t\u00ea\n\t\3\t\3\t\5\t\u00ee\n\t\3\t\3\t\7\t\u00f2\n\t\f"+
		"\t\16\t\u00f5\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00ff\n\n\f\n\16"+
		"\n\u0102\13\n\3\n\3\n\3\n\7\n\u0107\n\n\f\n\16\n\u010a\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u0114\n\n\f\n\16\n\u0117\13\n\3\n\3\n\3\n\5"+
		"\n\u011c\n\n\3\13\3\13\3\13\3\13\5\13\u0122\n\13\3\13\3\13\7\13\u0126"+
		"\n\13\f\13\16\13\u0129\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0141\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u014d\n\f\f\f\16\f\u0150\13\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0176\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0180\n\34\3\35\3\35\3\35\2\4\b\26\36\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\t\3\2\24\27"+
		"\3\2\31\33\3\2\26\27\3\2\35\37\3\2 !\3\2#(\4\2\n\n\16\16\2\u0199\2=\3"+
		"\2\2\2\4@\3\2\2\2\6f\3\2\2\2\b\u0099\3\2\2\2\n\u00c2\3\2\2\2\f\u00c4\3"+
		"\2\2\2\16\u00d5\3\2\2\2\20\u00e2\3\2\2\2\22\u011b\3\2\2\2\24\u011d\3\2"+
		"\2\2\26\u0140\3\2\2\2\30\u0151\3\2\2\2\32\u0153\3\2\2\2\34\u0155\3\2\2"+
		"\2\36\u0157\3\2\2\2 \u0159\3\2\2\2\"\u015b\3\2\2\2$\u015d\3\2\2\2&\u015f"+
		"\3\2\2\2(\u0161\3\2\2\2*\u0163\3\2\2\2,\u0165\3\2\2\2.\u0167\3\2\2\2\60"+
		"\u0169\3\2\2\2\62\u016b\3\2\2\2\64\u0175\3\2\2\2\66\u017f\3\2\2\28\u0181"+
		"\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2"+
		"?=\3\2\2\2@B\5\6\4\2AC\58\35\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"EF\3\2\2\2FG\b\3\1\2G\5\3\2\2\2HI\5\f\7\2IJ\b\4\1\2Jg\3\2\2\2KL\5\16\b"+
		"\2LM\b\4\1\2Mg\3\2\2\2NO\5\20\t\2OP\b\4\1\2Pg\3\2\2\2QR\5\22\n\2RS\b\4"+
		"\1\2Sg\3\2\2\2TU\5\24\13\2UV\b\4\1\2Vg\3\2\2\2WX\7\3\2\2Xg\b\4\1\2YZ\7"+
		"\4\2\2Zg\b\4\1\2[\\\7\5\2\2\\g\b\4\1\2]^\7\6\2\2^_\5\b\5\2_`\b\4\1\2`"+
		"g\3\2\2\2ab\7\6\2\2bg\b\4\1\2cd\5\b\5\2de\b\4\1\2eg\3\2\2\2fH\3\2\2\2"+
		"fK\3\2\2\2fN\3\2\2\2fQ\3\2\2\2fT\3\2\2\2fW\3\2\2\2fY\3\2\2\2f[\3\2\2\2"+
		"f]\3\2\2\2fa\3\2\2\2fc\3\2\2\2g\7\3\2\2\2hi\b\5\1\2ij\7\60\2\2j\u009a"+
		"\b\5\1\2kl\5\62\32\2lm\7\7\2\2mn\5\64\33\2no\7\b\2\2op\b\5\1\2p\u009a"+
		"\3\2\2\2qr\5\60\31\2rs\b\5\1\2s\u009a\3\2\2\2tu\7\7\2\2uv\5\b\5\2vw\7"+
		"\b\2\2wx\b\5\1\2x\u009a\3\2\2\2yz\5\60\31\2z{\5\30\r\2{|\b\5\1\2|\u009a"+
		"\3\2\2\2}~\5\30\r\2~\177\5\60\31\2\177\u0080\b\5\1\2\u0080\u009a\3\2\2"+
		"\2\u0081\u0082\5\30\r\2\u0082\u0083\5\b\5\7\u0083\u0084\b\5\1\2\u0084"+
		"\u009a\3\2\2\2\u0085\u0086\5\60\31\2\u0086\u0087\5 \21\2\u0087\u0088\5"+
		"\b\5\6\u0088\u0089\b\5\1\2\u0089\u009a\3\2\2\2\u008a\u008b\5\60\31\2\u008b"+
		"\u008c\5\"\22\2\u008c\u008d\5\b\5\5\u008d\u008e\b\5\1\2\u008e\u009a\3"+
		"\2\2\2\u008f\u0090\5\60\31\2\u0090\u0091\5$\23\2\u0091\u0092\5\b\5\4\u0092"+
		"\u0093\b\5\1\2\u0093\u009a\3\2\2\2\u0094\u0095\5\60\31\2\u0095\u0096\5"+
		"&\24\2\u0096\u0097\5\b\5\3\u0097\u0098\b\5\1\2\u0098\u009a\3\2\2\2\u0099"+
		"h\3\2\2\2\u0099k\3\2\2\2\u0099q\3\2\2\2\u0099t\3\2\2\2\u0099y\3\2\2\2"+
		"\u0099}\3\2\2\2\u0099\u0081\3\2\2\2\u0099\u0085\3\2\2\2\u0099\u008a\3"+
		"\2\2\2\u0099\u008f\3\2\2\2\u0099\u0094\3\2\2\2\u009a\u00ac\3\2\2\2\u009b"+
		"\u009c\f\f\2\2\u009c\u009d\5\32\16\2\u009d\u009e\5\b\5\r\u009e\u009f\b"+
		"\5\1\2\u009f\u00ab\3\2\2\2\u00a0\u00a1\f\13\2\2\u00a1\u00a2\5\34\17\2"+
		"\u00a2\u00a3\5\b\5\f\u00a3\u00a4\b\5\1\2\u00a4\u00ab\3\2\2\2\u00a5\u00a6"+
		"\f\n\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\5\b\5\13\u00a8\u00a9\b\5\1"+
		"\2\u00a9\u00ab\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a5"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\t\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\5\6\4\2\u00b0\u00b2\58\35\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5\n\6\2\u00b6\u00b7\b\6\1\2\u00b7"+
		"\u00c3\3\2\2\2\u00b8\u00ba\5\6\4\2\u00b9\u00bb\58\35\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\b\6\1\2\u00bf\u00c3\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\b\6\1\2\u00c2\u00af\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\13\3\2\2\2\u00c4\u00c8\7\t\2\2\u00c5\u00c7\7\n\2"+
		"\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\5\n\6\2\u00cc"+
		"\u00ce\7\n\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7\13\2\2\u00d3\u00d4\b\7\1\2\u00d4\r\3\2\2\2\u00d5\u00d6\7\f\2"+
		"\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00dc\7\b\2\2\u00d9"+
		"\u00db\7\n\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\5\6\4\2\u00e0\u00e1\b\b\1\2\u00e1\17\3\2\2\2\u00e2\u00e3\7\r\2"+
		"\2\u00e3\u00e5\7\7\2\2\u00e4\u00e6\5\6\4\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\16\2\2\u00e8\u00ea\5\26\f\2"+
		"\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed"+
		"\7\16\2\2\u00ec\u00ee\5\6\4\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00f3\7\b\2\2\u00f0\u00f2\7\n\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\6\4\2\u00f7\u00f8\b\t"+
		"\1\2\u00f8\21\3\2\2\2\u00f9\u00fa\7\17\2\2\u00fa\u00fb\7\7\2\2\u00fb\u00fc"+
		"\5\26\f\2\u00fc\u0100\7\b\2\2\u00fd\u00ff\58\35\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\5\6\4\2\u0104\u0108\7\20\2\2"+
		"\u0105\u0107\7\n\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\5\6\4\2\u010c\u010d\b\n\1\2\u010d\u011c\3\2\2\2\u010e\u010f\7\17"+
		"\2\2\u010f\u0110\7\7\2\2\u0110\u0111\5\26\f\2\u0111\u0115\7\b\2\2\u0112"+
		"\u0114\58\35\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\5\6\4\2\u0119\u011a\b\n\1\2\u011a\u011c\3\2\2\2\u011b\u00f9\3\2"+
		"\2\2\u011b\u010e\3\2\2\2\u011c\23\3\2\2\2\u011d\u011e\7\21\2\2\u011e\u011f"+
		"\5\62\32\2\u011f\u0121\7\7\2\2\u0120\u0122\5\66\34\2\u0121\u0120\3\2\2"+
		"\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0127\7\b\2\2\u0124\u0126"+
		"\58\35\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\5\f"+
		"\7\2\u012b\u012c\b\13\1\2\u012c\25\3\2\2\2\u012d\u012e\b\f\1\2\u012e\u012f"+
		"\7\22\2\2\u012f\u0141\b\f\1\2\u0130\u0131\7\23\2\2\u0131\u0141\b\f\1\2"+
		"\u0132\u0133\7\7\2\2\u0133\u0134\5\26\f\2\u0134\u0135\7\b\2\2\u0135\u0136"+
		"\b\f\1\2\u0136\u0141\3\2\2\2\u0137\u0138\5*\26\2\u0138\u0139\5\26\f\6"+
		"\u0139\u013a\b\f\1\2\u013a\u0141\3\2\2\2\u013b\u013c\5\b\5\2\u013c\u013d"+
		"\5(\25\2\u013d\u013e\5\b\5\2\u013e\u013f\b\f\1\2\u013f\u0141\3\2\2\2\u0140"+
		"\u012d\3\2\2\2\u0140\u0130\3\2\2\2\u0140\u0132\3\2\2\2\u0140\u0137\3\2"+
		"\2\2\u0140\u013b\3\2\2\2\u0141\u014e\3\2\2\2\u0142\u0143\f\4\2\2\u0143"+
		"\u0144\5,\27\2\u0144\u0145\5\26\f\5\u0145\u0146\b\f\1\2\u0146\u014d\3"+
		"\2\2\2\u0147\u0148\f\3\2\2\u0148\u0149\5.\30\2\u0149\u014a\5\26\f\4\u014a"+
		"\u014b\b\f\1\2\u014b\u014d\3\2\2\2\u014c\u0142\3\2\2\2\u014c\u0147\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\27\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\t\2\2\2\u0152\31\3\2\2\2\u0153"+
		"\u0154\7\30\2\2\u0154\33\3\2\2\2\u0155\u0156\t\3\2\2\u0156\35\3\2\2\2"+
		"\u0157\u0158\t\4\2\2\u0158\37\3\2\2\2\u0159\u015a\7\34\2\2\u015a!\3\2"+
		"\2\2\u015b\u015c\t\5\2\2\u015c#\3\2\2\2\u015d\u015e\t\6\2\2\u015e%\3\2"+
		"\2\2\u015f\u0160\7\"\2\2\u0160\'\3\2\2\2\u0161\u0162\t\7\2\2\u0162)\3"+
		"\2\2\2\u0163\u0164\7)\2\2\u0164+\3\2\2\2\u0165\u0166\7*\2\2\u0166-\3\2"+
		"\2\2\u0167\u0168\7+\2\2\u0168/\3\2\2\2\u0169\u016a\7/\2\2\u016a\61\3\2"+
		"\2\2\u016b\u016c\7/\2\2\u016c\63\3\2\2\2\u016d\u016e\5\b\5\2\u016e\u016f"+
		"\7,\2\2\u016f\u0170\5\64\33\2\u0170\u0171\b\33\1\2\u0171\u0176\3\2\2\2"+
		"\u0172\u0173\5\b\5\2\u0173\u0174\b\33\1\2\u0174\u0176\3\2\2\2\u0175\u016d"+
		"\3\2\2\2\u0175\u0172\3\2\2\2\u0176\65\3\2\2\2\u0177\u0178\5\60\31\2\u0178"+
		"\u0179\7,\2\2\u0179\u017a\5\66\34\2\u017a\u017b\b\34\1\2\u017b\u0180\3"+
		"\2\2\2\u017c\u017d\5\60\31\2\u017d\u017e\b\34\1\2\u017e\u0180\3\2\2\2"+
		"\u017f\u0177\3\2\2\2\u017f\u017c\3\2\2\2\u0180\67\3\2\2\2\u0181\u0182"+
		"\t\b\2\2\u01829\3\2\2\2\35=Df\u0099\u00aa\u00ac\u00b3\u00bc\u00c2\u00c8"+
		"\u00cf\u00dc\u00e5\u00e9\u00ed\u00f3\u0100\u0108\u0115\u011b\u0121\u0127"+
		"\u0140\u014c\u014e\u0175\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}