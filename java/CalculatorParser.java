// Generated from Calculator.g4 by ANTLR 4.7.2


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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		COMMENT=39, QUIT=40, ID=41, NUM=42, WS=43, NEWLINE=44;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_whileLoop = 3, 
		RULE_forLoop = 4, RULE_ifStatement = 5, RULE_defineFunction = 6, RULE_condition = 7, 
		RULE_unaryOperator = 8, RULE_binaryOperator = 9, RULE_operatorAssignment = 10, 
		RULE_comparisonOperator = 11, RULE_booleanUnaryOperator = 12, RULE_booleanBinaryOperator = 13, 
		RULE_variable = 14, RULE_function = 15, RULE_parameters = 16, RULE_delimiter = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression", "whileLoop", "forLoop", "ifStatement", 
			"defineFunction", "condition", "unaryOperator", "binaryOperator", "operatorAssignment", 
			"comparisonOperator", "booleanUnaryOperator", "booleanBinaryOperator", 
			"variable", "function", "parameters", "delimiter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'while'", "'for'", "';'", "'if'", 
			"'else'", "'define'", "'return'", "'true'", "'false'", "'++'", "'--'", 
			"'-'", "'+'", "'*'", "'/'", "'^'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'^='", "'%='", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", 
			"'!'", "'&&'", "'||'", "','", null, "'quit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "COMMENT", "QUIT", "ID", "NUM", "WS", "NEWLINE"
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

	 
	    //AST ast = new AST();

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID) | (1L << NUM) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(41);
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

	public static class StatementContext extends ParserRuleContext {
		public DelimiterContext delimiter() {
			return getRuleContext(DelimiterContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				delimiter();
				}
				break;
			case T__2:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				expression(0);
				setState(44);
				delimiter();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(T__0);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID) | (1L << NUM) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(47);
					statement();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(T__1);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				whileLoop();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				forLoop();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				ifStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				defineFunction();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
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
		public OperatorAssignmentContext operatorAssignment() {
			return getRuleContext(OperatorAssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpression(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(61);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(62);
				variable();
				}
				break;
			case 3:
				{
				setState(63);
				match(T__2);
				setState(64);
				expression(0);
				setState(65);
				match(T__3);
				}
				break;
			case 4:
				{
				setState(67);
				variable();
				setState(68);
				unaryOperator();
				}
				break;
			case 5:
				{
				setState(70);
				unaryOperator();
				setState(71);
				expression(4);
				}
				break;
			case 6:
				{
				setState(73);
				variable();
				setState(74);
				operatorAssignment();
				setState(75);
				expression(2);
				}
				break;
			case 7:
				{
				setState(77);
				function();
				setState(78);
				match(T__2);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(79);
					expression(0);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(89);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(90);
					binaryOperator();
					setState(91);
					expression(4);
					}
					} 
				}
				setState(97);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__4);
			setState(99);
			match(T__2);
			setState(100);
			condition(0);
			setState(101);
			match(T__3);
			setState(102);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__5);
			setState(105);
			match(T__2);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(106);
				expression(0);
				}
			}

			setState(109);
			match(T__6);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(110);
				condition(0);
				}
			}

			setState(113);
			match(T__6);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(114);
				expression(0);
				}
			}

			setState(117);
			match(T__3);
			setState(118);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__7);
			setState(121);
			match(T__2);
			setState(122);
			condition(0);
			setState(123);
			match(T__3);
			setState(124);
			statement();
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(125);
				match(T__8);
				setState(126);
				statement();
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

	public static class DefineFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefineFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDefineFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDefineFunction(this);
		}
	}

	public final DefineFunctionContext defineFunction() throws RecognitionException {
		DefineFunctionContext _localctx = new DefineFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defineFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__9);
			setState(130);
			match(ID);
			setState(131);
			match(T__2);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(132);
				parameters();
				}
			}

			setState(135);
			match(T__3);
			setState(136);
			match(T__0);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID) | (1L << NUM) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(137);
				statement();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__10);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(144);
				expression(0);
				}
			}

			setState(147);
			match(T__6);
			setState(148);
			match(T__1);
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public BooleanUnaryOperatorContext booleanUnaryOperator() {
			return getRuleContext(BooleanUnaryOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public BooleanBinaryOperatorContext booleanBinaryOperator() {
			return getRuleContext(BooleanBinaryOperatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitCondition(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(151);
				match(T__11);
				}
				break;
			case 2:
				{
				setState(152);
				match(T__12);
				}
				break;
			case 3:
				{
				setState(153);
				match(T__2);
				setState(154);
				condition(0);
				setState(155);
				match(T__3);
				}
				break;
			case 4:
				{
				setState(157);
				booleanUnaryOperator();
				setState(158);
				condition(3);
				}
				break;
			case 5:
				{
				setState(160);
				expression(0);
				setState(161);
				comparisonOperator();
				setState(162);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(166);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(167);
					booleanBinaryOperator();
					setState(168);
					condition(2);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBinaryOperator(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class OperatorAssignmentContext extends ParserRuleContext {
		public OperatorAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOperatorAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOperatorAssignment(this);
		}
	}

	public final OperatorAssignmentContext operatorAssignment() throws RecognitionException {
		OperatorAssignmentContext _localctx = new OperatorAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operatorAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBooleanUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBooleanUnaryOperator(this);
		}
	}

	public final BooleanUnaryOperatorContext booleanUnaryOperator() throws RecognitionException {
		BooleanUnaryOperatorContext _localctx = new BooleanUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanUnaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__34);
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

	public static class BooleanBinaryOperatorContext extends ParserRuleContext {
		public BooleanBinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanBinaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBooleanBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBooleanBinaryOperator(this);
		}
	}

	public final BooleanBinaryOperatorContext booleanBinaryOperator() throws RecognitionException {
		BooleanBinaryOperatorContext _localctx = new BooleanBinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanBinaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
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
		enterRule(_localctx, 30, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ID);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(192);
				match(T__37);
				setState(193);
				match(ID);
				}
				}
				setState(198);
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

	public static class DelimiterContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public DelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDelimiter(this);
		}
	}

	public final DelimiterContext delimiter() throws RecognitionException {
		DelimiterContext _localctx = new DelimiterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==NEWLINE) ) {
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 7:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4S\n\4"+
		"\f\4\16\4V\13\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\5\6r\n\6\3\6\3"+
		"\6\5\6v\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b"+
		"\3\b\3\b\3\b\5\b\u0088\n\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13"+
		"\b\3\b\3\b\5\b\u0094\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a7\n\t\3\t\3\t\3\t\3\t\7\t\u00ad\n\t\f\t"+
		"\16\t\u00b0\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22\u00c5\n\22\f\22\16\22\u00c8\13"+
		"\22\3\23\3\23\3\23\2\4\6\20\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\b\3\2\20\23\3\2\22\27\3\2\30\36\3\2\37$\3\2&\'\4\2\t\t..\2\u00d6"+
		"\2)\3\2\2\2\4<\3\2\2\2\6Y\3\2\2\2\bd\3\2\2\2\nj\3\2\2\2\fz\3\2\2\2\16"+
		"\u0083\3\2\2\2\20\u00a6\3\2\2\2\22\u00b1\3\2\2\2\24\u00b3\3\2\2\2\26\u00b5"+
		"\3\2\2\2\30\u00b7\3\2\2\2\32\u00b9\3\2\2\2\34\u00bb\3\2\2\2\36\u00bd\3"+
		"\2\2\2 \u00bf\3\2\2\2\"\u00c1\3\2\2\2$\u00c9\3\2\2\2&(\5\4\3\2\'&\3\2"+
		"\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,=\5$\23\2-.\5"+
		"\6\4\2./\5$\23\2/=\3\2\2\2\60\64\7\3\2\2\61\63\5\4\3\2\62\61\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67"+
		"=\7\4\2\28=\5\b\5\29=\5\n\6\2:=\5\f\7\2;=\5\16\b\2<,\3\2\2\2<-\3\2\2\2"+
		"<\60\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>?\b\4"+
		"\1\2?Z\7,\2\2@Z\5\36\20\2AB\7\5\2\2BC\5\6\4\2CD\7\6\2\2DZ\3\2\2\2EF\5"+
		"\36\20\2FG\5\22\n\2GZ\3\2\2\2HI\5\22\n\2IJ\5\6\4\6JZ\3\2\2\2KL\5\36\20"+
		"\2LM\5\26\f\2MN\5\6\4\4NZ\3\2\2\2OP\5 \21\2PT\7\5\2\2QS\5\6\4\2RQ\3\2"+
		"\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\6\2\2XZ\3\2"+
		"\2\2Y>\3\2\2\2Y@\3\2\2\2YA\3\2\2\2YE\3\2\2\2YH\3\2\2\2YK\3\2\2\2YO\3\2"+
		"\2\2Za\3\2\2\2[\\\f\5\2\2\\]\5\24\13\2]^\5\6\4\6^`\3\2\2\2_[\3\2\2\2`"+
		"c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2de\7\7\2\2ef\7\5\2\2"+
		"fg\5\20\t\2gh\7\6\2\2hi\5\4\3\2i\t\3\2\2\2jk\7\b\2\2km\7\5\2\2ln\5\6\4"+
		"\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\7\t\2\2pr\5\20\t\2qp\3\2\2\2qr\3\2"+
		"\2\2rs\3\2\2\2su\7\t\2\2tv\5\6\4\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\6"+
		"\2\2xy\5\4\3\2y\13\3\2\2\2z{\7\n\2\2{|\7\5\2\2|}\5\20\t\2}~\7\6\2\2~\u0081"+
		"\5\4\3\2\177\u0080\7\13\2\2\u0080\u0082\5\4\3\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\r\3\2\2\2\u0083\u0084\7\f\2\2\u0084\u0085\7+\2\2"+
		"\u0085\u0087\7\5\2\2\u0086\u0088\5\"\22\2\u0087\u0086\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\6\2\2\u008a\u008e\7\3\2\2\u008b"+
		"\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0093\7\r\2\2\u0092\u0094\5\6\4\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\t\2\2\u0096\u0097\7\4\2\2\u0097"+
		"\17\3\2\2\2\u0098\u0099\b\t\1\2\u0099\u00a7\7\16\2\2\u009a\u00a7\7\17"+
		"\2\2\u009b\u009c\7\5\2\2\u009c\u009d\5\20\t\2\u009d\u009e\7\6\2\2\u009e"+
		"\u00a7\3\2\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\5\20\t\5\u00a1\u00a7"+
		"\3\2\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\5\6\4\2"+
		"\u00a5\u00a7\3\2\2\2\u00a6\u0098\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u009b"+
		"\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00ae\3\2\2\2\u00a8"+
		"\u00a9\f\3\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\5\20\t\4\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\t\2\2"+
		"\2\u00b2\23\3\2\2\2\u00b3\u00b4\t\3\2\2\u00b4\25\3\2\2\2\u00b5\u00b6\t"+
		"\4\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\t\5\2\2\u00b8\31\3\2\2\2\u00b9\u00ba"+
		"\7%\2\2\u00ba\33\3\2\2\2\u00bb\u00bc\t\6\2\2\u00bc\35\3\2\2\2\u00bd\u00be"+
		"\7+\2\2\u00be\37\3\2\2\2\u00bf\u00c0\7+\2\2\u00c0!\3\2\2\2\u00c1\u00c6"+
		"\7+\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c5\7+\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7#\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00ca\t\7\2\2\u00ca%\3\2\2\2\22)\64<TYamqu"+
		"\u0081\u0087\u008e\u0093\u00a6\u00ae\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}