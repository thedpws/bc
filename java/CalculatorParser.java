// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.*;

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
		RULE_fname = 24, RULE_parameters = 25, RULE_delimiter = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topStatement", "statement", "expression", "statementList", 
			"block", "whileLoop", "forLoop", "ifStatement", "defineFunction", "condition", 
			"unaryOperator", "binaryOperator1", "binaryOperator2", "binaryOperator3", 
			"operatorAssignment1", "operatorAssignment2", "operatorAssignment3", 
			"operatorAssignment4", "comparisonOperator", "booleanUnaryOperator", 
			"booleanBinaryOperator1", "booleanBinaryOperator2", "variable", "fname", 
			"parameters", "delimiter"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    AST ast = new AST();

	public CalculatorParser(TokenStream input) {
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(54);
				topStatement();
				}
				}
				setState(59);
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

	public static class TopStatementContext extends ParserRuleContext {
		public StatementContext statement;
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterTopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitTopStatement(this);
		}
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((TopStatementContext)_localctx).statement = statement();
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				delimiter();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==T__11 );
			 ast.push(((TopStatementContext)_localctx).statement.rval); 
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
		public Statement rval;
		public BlockContext block;
		public WhileLoopContext whileLoop;
		public ForLoopContext forLoop;
		public IfStatementContext ifStatement;
		public DefineFunctionContext defineFunction;
		public ExpressionContext expression;
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((StatementContext)_localctx).block = block();
				 ((StatementContext)_localctx).rval =  ((StatementContext)_localctx).block.rval;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((StatementContext)_localctx).whileLoop = whileLoop();
				 ((StatementContext)_localctx).rval =  ((StatementContext)_localctx).whileLoop.rval;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				((StatementContext)_localctx).forLoop = forLoop();
				 ((StatementContext)_localctx).rval =  ((StatementContext)_localctx).forLoop.rval; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).rval =  ((StatementContext)_localctx).ifStatement.rval; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				((StatementContext)_localctx).defineFunction = defineFunction();
				 ((StatementContext)_localctx).rval =  ((StatementContext)_localctx).defineFunction.rval;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(T__0);
				 ((StatementContext)_localctx).rval =  new BreakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				match(T__1);
				 ((StatementContext)_localctx).rval =  new ContinueStatement(); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				match(T__2);
				 ((StatementContext)_localctx).rval =  new HaltStatement(); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				match(T__3);
				setState(90);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).rval =  new ReturnStatement(((StatementContext)_localctx).expression.rval);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				match(T__3);
				 ((StatementContext)_localctx).rval =  new ReturnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).rval =  ((StatementContext)_localctx).expression.rval;
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
		public Expression rval;
		public ExpressionContext operand1;
		public Token NUM;
		public FnameContext fname;
		public ParametersContext parameters;
		public VariableContext variable;
		public ExpressionContext expression;
		public UnaryOperatorContext unaryOperator;
		public OperatorAssignment1Context operatorAssignment1;
		public OperatorAssignment2Context operatorAssignment2;
		public OperatorAssignment3Context operatorAssignment3;
		public OperatorAssignment4Context operatorAssignment4;
		public BinaryOperator1Context binaryOperator1;
		public ExpressionContext operand2;
		public BinaryOperator2Context binaryOperator2;
		public BinaryOperator3Context binaryOperator3;
		public TerminalNode NUM() { return getToken(CalculatorParser.NUM, 0); }
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(101);
				((ExpressionContext)_localctx).NUM = match(NUM);
				 ((ExpressionContext)_localctx).rval =  new ExpressionConstant(Double.parseDouble((((ExpressionContext)_localctx).NUM!=null?((ExpressionContext)_localctx).NUM.getText():null))); 
				}
				break;
			case 2:
				{
				setState(103);
				((ExpressionContext)_localctx).fname = fname();
				setState(104);
				match(T__4);
				setState(105);
				((ExpressionContext)_localctx).parameters = parameters();
				setState(106);
				match(T__5);
				 ((ExpressionContext)_localctx).rval =  new ExpressionFunctionCall((((ExpressionContext)_localctx).fname!=null?_input.getText(((ExpressionContext)_localctx).fname.start,((ExpressionContext)_localctx).fname.stop):null), ((ExpressionContext)_localctx).parameters.rval); 
				}
				break;
			case 3:
				{
				setState(109);
				((ExpressionContext)_localctx).variable = variable();
				 ((ExpressionContext)_localctx).rval =  new ExpressionVariable((((ExpressionContext)_localctx).variable!=null?_input.getText(((ExpressionContext)_localctx).variable.start,((ExpressionContext)_localctx).variable.stop):null)); 
				}
				break;
			case 4:
				{
				setState(112);
				match(T__4);
				setState(113);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(114);
				match(T__5);
				 ((ExpressionContext)_localctx).rval =  ((ExpressionContext)_localctx).expression.rval; 
				}
				break;
			case 5:
				{
				setState(117);
				((ExpressionContext)_localctx).variable = variable();
				setState(118);
				((ExpressionContext)_localctx).unaryOperator = unaryOperator();
				 ((ExpressionContext)_localctx).rval =  new ExpressionVariableUnary(new ExpressionVariable((((ExpressionContext)_localctx).variable!=null?_input.getText(((ExpressionContext)_localctx).variable.start,((ExpressionContext)_localctx).variable.stop):null)), (((ExpressionContext)_localctx).unaryOperator!=null?_input.getText(((ExpressionContext)_localctx).unaryOperator.start,((ExpressionContext)_localctx).unaryOperator.stop):null)); 
				}
				break;
			case 6:
				{
				setState(121);
				((ExpressionContext)_localctx).unaryOperator = unaryOperator();
				setState(122);
				((ExpressionContext)_localctx).variable = variable();
				 ((ExpressionContext)_localctx).rval =  new ExpressionVariableUnary((((ExpressionContext)_localctx).unaryOperator!=null?_input.getText(((ExpressionContext)_localctx).unaryOperator.start,((ExpressionContext)_localctx).unaryOperator.stop):null), new ExpressionVariable((((ExpressionContext)_localctx).variable!=null?_input.getText(((ExpressionContext)_localctx).variable.start,((ExpressionContext)_localctx).variable.stop):null))); 
				}
				break;
			case 7:
				{
				setState(125);
				((ExpressionContext)_localctx).unaryOperator = unaryOperator();
				setState(126);
				((ExpressionContext)_localctx).expression = expression(5);
				 ((ExpressionContext)_localctx).rval =  new ExpressionUnary((((ExpressionContext)_localctx).unaryOperator!=null?_input.getText(((ExpressionContext)_localctx).unaryOperator.start,((ExpressionContext)_localctx).unaryOperator.stop):null), ((ExpressionContext)_localctx).expression.rval); 
				}
				break;
			case 8:
				{
				setState(129);
				((ExpressionContext)_localctx).variable = variable();
				setState(130);
				((ExpressionContext)_localctx).operatorAssignment1 = operatorAssignment1();
				setState(131);
				((ExpressionContext)_localctx).expression = expression(4);
				 ((ExpressionContext)_localctx).rval =  new ExpressionAssignment(new ExpressionVariable((((ExpressionContext)_localctx).variable!=null?_input.getText(((ExpressionContext)_localctx).variable.start,((ExpressionContext)_localctx).variable.stop):null)), (((ExpressionContext)_localctx).operatorAssignment1!=null?_input.getText(((ExpressionContext)_localctx).operatorAssignment1.start,((ExpressionContext)_localctx).operatorAssignment1.stop):null), ((ExpressionContext)_localctx).expression.rval); 
				}
				break;
			case 9:
				{
				setState(134);
				((ExpressionContext)_localctx).variable = variable();
				setState(135);
				((ExpressionContext)_localctx).operatorAssignment2 = operatorAssignment2();
				setState(136);
				((ExpressionContext)_localctx).expression = expression(3);
				 ((ExpressionContext)_localctx).rval =  new ExpressionAssignment(new ExpressionVariable((((ExpressionContext)_localctx).variable!=null?_input.getText(((ExpressionContext)_localctx).variable.start,((ExpressionContext)_localctx).variable.stop):null)), (((ExpressionContext)_localctx).operatorAssignment2!=null?_input.getText(((ExpressionContext)_localctx).operatorAssignment2.start,((ExpressionContext)_localctx).operatorAssignment2.stop):null), ((ExpressionContext)_localctx).expression.rval); 
				}
				break;
			case 10:
				{
				setState(139);
				((ExpressionContext)_localctx).variable = variable();
				setState(140);
				((ExpressionContext)_localctx).operatorAssignment3 = operatorAssignment3();
				setState(141);
				((ExpressionContext)_localctx).expression = expression(2);
				 ((ExpressionContext)_localctx).rval =  new ExpressionAssignment(new ExpressionVariable((((ExpressionContext)_localctx).variable!=null?_input.getText(((ExpressionContext)_localctx).variable.start,((ExpressionContext)_localctx).variable.stop):null)), (((ExpressionContext)_localctx).operatorAssignment3!=null?_input.getText(((ExpressionContext)_localctx).operatorAssignment3.start,((ExpressionContext)_localctx).operatorAssignment3.stop):null), ((ExpressionContext)_localctx).expression.rval); 
				}
				break;
			case 11:
				{
				setState(144);
				((ExpressionContext)_localctx).variable = variable();
				setState(145);
				((ExpressionContext)_localctx).operatorAssignment4 = operatorAssignment4();
				setState(146);
				((ExpressionContext)_localctx).expression = expression(1);
				 ((ExpressionContext)_localctx).rval =  new ExpressionAssignment(new ExpressionVariable((((ExpressionContext)_localctx).variable!=null?_input.getText(((ExpressionContext)_localctx).variable.start,((ExpressionContext)_localctx).variable.stop):null)), (((ExpressionContext)_localctx).operatorAssignment4!=null?_input.getText(((ExpressionContext)_localctx).operatorAssignment4.start,((ExpressionContext)_localctx).operatorAssignment4.stop):null), ((ExpressionContext)_localctx).expression.rval); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(152);
						((ExpressionContext)_localctx).binaryOperator1 = binaryOperator1();
						setState(153);
						((ExpressionContext)_localctx).operand2 = ((ExpressionContext)_localctx).expression = expression(11);
						 ((ExpressionContext)_localctx).rval =  new ExpressionBinary(((ExpressionContext)_localctx).operand1.rval, (((ExpressionContext)_localctx).binaryOperator1!=null?_input.getText(((ExpressionContext)_localctx).binaryOperator1.start,((ExpressionContext)_localctx).binaryOperator1.stop):null), ((ExpressionContext)_localctx).operand2.rval); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(157);
						((ExpressionContext)_localctx).binaryOperator2 = binaryOperator2();
						setState(158);
						((ExpressionContext)_localctx).operand2 = ((ExpressionContext)_localctx).expression = expression(10);
						 ((ExpressionContext)_localctx).rval =  new ExpressionBinary(((ExpressionContext)_localctx).operand1.rval, (((ExpressionContext)_localctx).binaryOperator2!=null?_input.getText(((ExpressionContext)_localctx).binaryOperator2.start,((ExpressionContext)_localctx).binaryOperator2.stop):null), ((ExpressionContext)_localctx).operand2.rval); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand1 = _prevctx;
						_localctx.operand1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(162);
						((ExpressionContext)_localctx).binaryOperator3 = binaryOperator3();
						setState(163);
						((ExpressionContext)_localctx).operand2 = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).rval =  new ExpressionBinary(((ExpressionContext)_localctx).operand1.rval, (((ExpressionContext)_localctx).binaryOperator3!=null?_input.getText(((ExpressionContext)_localctx).binaryOperator3.start,((ExpressionContext)_localctx).binaryOperator3.stop):null), ((ExpressionContext)_localctx).operand2.rval); 
						}
						break;
					}
					} 
				}
				setState(170);
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
		public List<Statement> rval;
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
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(171);
				statement();
				setState(173); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(172);
						delimiter();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(175); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((StatementListContext)_localctx).rval =  new LinkedList<Statement>(); 
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
		public Block rval;
		public StatementListContext statementList;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBlock(this);
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
			setState(184);
			match(T__6);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					match(T__7);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			{
			setState(191);
			((BlockContext)_localctx).statementList = statementList();
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(192);
				match(T__7);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__8);
			 ((BlockContext)_localctx).rval =  new Block(((BlockContext)_localctx).statementList.rval); 
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
		public WhileLoop rval;
		public ConditionContext condition;
		public StatementContext statement;
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
		enterRule(_localctx, 12, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__9);
			setState(202);
			match(T__4);
			setState(203);
			((WhileLoopContext)_localctx).condition = condition(0);
			setState(204);
			match(T__5);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(205);
				match(T__7);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			((WhileLoopContext)_localctx).statement = statement();
			 ((WhileLoopContext)_localctx).rval =  new WhileLoop(((WhileLoopContext)_localctx).condition.rval, ((WhileLoopContext)_localctx).statement.rval); 
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
		public ForLoop rval;
		public StatementContext expr1;
		public StatementContext statement;
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__10);
			setState(215);
			match(T__4);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(216);
				((ForLoopContext)_localctx).expr1 = ((ForLoopContext)_localctx).statement = statement();
				}
			}

			setState(219);
			match(T__11);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__38) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(220);
				((ForLoopContext)_localctx).expr2 = condition(0);
				}
			}

			setState(223);
			match(T__11);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(224);
				((ForLoopContext)_localctx).expr3 = ((ForLoopContext)_localctx).statement = statement();
				}
			}

			setState(227);
			match(T__5);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(228);
				match(T__7);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			((ForLoopContext)_localctx).statement = statement();
			 ((ForLoopContext)_localctx).rval =  new ForLoop(((ForLoopContext)_localctx).expr1.rval, ((ForLoopContext)_localctx).expr2.rval, ((ForLoopContext)_localctx).expr3.rval, ((ForLoopContext)_localctx).statement.rval); 
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
		public IfStatement rval;
		public ConditionContext condition;
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__12);
			setState(238);
			match(T__4);
			setState(239);
			((IfStatementContext)_localctx).condition = condition(0);
			setState(240);
			match(T__5);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__11) {
				{
				{
				setState(241);
				delimiter();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			((IfStatementContext)_localctx).trueBranch = statement();
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(248);
				match(T__13);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(249);
					match(T__7);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				((IfStatementContext)_localctx).falseBranch = statement();
				}
				break;
			}
			 ((IfStatementContext)_localctx).rval =  new IfStatement(((IfStatementContext)_localctx).condition.rval, ((IfStatementContext)_localctx).trueBranch.rval, ((IfStatementContext)_localctx).falseBranch.rval); 
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
		public FunctionDefinition rval;
		public FnameContext fname;
		public ParametersContext parameters;
		public BlockContext block;
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDefineFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDefineFunction(this);
		}
	}

	public final DefineFunctionContext defineFunction() throws RecognitionException {
		DefineFunctionContext _localctx = new DefineFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__14);
			setState(261);
			((DefineFunctionContext)_localctx).fname = fname();
			setState(262);
			match(T__4);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(263);
				((DefineFunctionContext)_localctx).parameters = parameters();
				}
			}

			setState(266);
			match(T__5);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__11) {
				{
				{
				setState(267);
				delimiter();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			((DefineFunctionContext)_localctx).block = block();
			 ((DefineFunctionContext)_localctx).rval =  new FunctionDefinition((((DefineFunctionContext)_localctx).fname!=null?_input.getText(((DefineFunctionContext)_localctx).fname.start,((DefineFunctionContext)_localctx).fname.stop):null), ((DefineFunctionContext)_localctx).parameters.rval, ((DefineFunctionContext)_localctx).block.rval); 
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
		public Condition rval;
		public ConditionContext leftCondition;
		public ConditionContext condition;
		public BooleanUnaryOperatorContext booleanUnaryOperator;
		public ExpressionContext lexpr;
		public ComparisonOperatorContext comparisonOperator;
		public ExpressionContext rexpr;
		public BooleanBinaryOperator1Context booleanBinaryOperator1;
		public ConditionContext rightCondition;
		public BooleanBinaryOperator2Context booleanBinaryOperator2;
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(277);
				match(T__15);
				 ((ConditionContext)_localctx).rval =  new ConditionConstant(true); 
				}
				break;
			case 2:
				{
				setState(279);
				match(T__16);
				 ((ConditionContext)_localctx).rval =  new ConditionConstant(false); 
				}
				break;
			case 3:
				{
				setState(281);
				match(T__4);
				setState(282);
				((ConditionContext)_localctx).condition = condition(0);
				setState(283);
				match(T__5);
				 ((ConditionContext)_localctx).rval =  ((ConditionContext)_localctx).condition.rval; 
				}
				break;
			case 4:
				{
				setState(286);
				((ConditionContext)_localctx).booleanUnaryOperator = booleanUnaryOperator();
				setState(287);
				((ConditionContext)_localctx).condition = condition(4);
				 ((ConditionContext)_localctx).rval =  new ConditionUnary((((ConditionContext)_localctx).booleanUnaryOperator!=null?_input.getText(((ConditionContext)_localctx).booleanUnaryOperator.start,((ConditionContext)_localctx).booleanUnaryOperator.stop):null), ((ConditionContext)_localctx).condition.rval);
				                                                    
				}
				break;
			case 5:
				{
				setState(290);
				((ConditionContext)_localctx).lexpr = expression(0);
				setState(291);
				((ConditionContext)_localctx).comparisonOperator = comparisonOperator();
				setState(292);
				((ConditionContext)_localctx).rexpr = expression(0);
				 ((ConditionContext)_localctx).rval =  new ConditionComparison(((ConditionContext)_localctx).lexpr.rval, (((ConditionContext)_localctx).comparisonOperator!=null?_input.getText(((ConditionContext)_localctx).comparisonOperator.start,((ConditionContext)_localctx).comparisonOperator.stop):null), ((ConditionContext)_localctx).rexpr.rval);
				                                                    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.leftCondition = _prevctx;
						_localctx.leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(297);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(298);
						((ConditionContext)_localctx).booleanBinaryOperator1 = booleanBinaryOperator1();
						setState(299);
						((ConditionContext)_localctx).rightCondition = ((ConditionContext)_localctx).condition = condition(3);
						 ((ConditionContext)_localctx).rval =  new ConditionBinary(((ConditionContext)_localctx).leftCondition.rval, (((ConditionContext)_localctx).booleanBinaryOperator1!=null?_input.getText(((ConditionContext)_localctx).booleanBinaryOperator1.start,((ConditionContext)_localctx).booleanBinaryOperator1.stop):null), ((ConditionContext)_localctx).rightCondition.rval);
						                                                              
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.leftCondition = _prevctx;
						_localctx.leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(302);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(303);
						((ConditionContext)_localctx).booleanBinaryOperator2 = booleanBinaryOperator2();
						setState(304);
						((ConditionContext)_localctx).rightCondition = ((ConditionContext)_localctx).condition = condition(2);
						 ((ConditionContext)_localctx).rval =  new ConditionBinary(((ConditionContext)_localctx).leftCondition.rval, (((ConditionContext)_localctx).booleanBinaryOperator2!=null?_input.getText(((ConditionContext)_localctx).booleanBinaryOperator2.start,((ConditionContext)_localctx).booleanBinaryOperator2.stop):null), ((ConditionContext)_localctx).rightCondition.rval);
						                                                              
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 22, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBinaryOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBinaryOperator1(this);
		}
	}

	public final BinaryOperator1Context binaryOperator1() throws RecognitionException {
		BinaryOperator1Context _localctx = new BinaryOperator1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_binaryOperator1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBinaryOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBinaryOperator2(this);
		}
	}

	public final BinaryOperator2Context binaryOperator2() throws RecognitionException {
		BinaryOperator2Context _localctx = new BinaryOperator2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_binaryOperator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBinaryOperator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBinaryOperator3(this);
		}
	}

	public final BinaryOperator3Context binaryOperator3() throws RecognitionException {
		BinaryOperator3Context _localctx = new BinaryOperator3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_binaryOperator3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOperatorAssignment1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOperatorAssignment1(this);
		}
	}

	public final OperatorAssignment1Context operatorAssignment1() throws RecognitionException {
		OperatorAssignment1Context _localctx = new OperatorAssignment1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_operatorAssignment1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOperatorAssignment2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOperatorAssignment2(this);
		}
	}

	public final OperatorAssignment2Context operatorAssignment2() throws RecognitionException {
		OperatorAssignment2Context _localctx = new OperatorAssignment2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_operatorAssignment2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOperatorAssignment3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOperatorAssignment3(this);
		}
	}

	public final OperatorAssignment3Context operatorAssignment3() throws RecognitionException {
		OperatorAssignment3Context _localctx = new OperatorAssignment3Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_operatorAssignment3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterOperatorAssignment4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitOperatorAssignment4(this);
		}
	}

	public final OperatorAssignment4Context operatorAssignment4() throws RecognitionException {
		OperatorAssignment4Context _localctx = new OperatorAssignment4Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_operatorAssignment4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBooleanUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBooleanUnaryOperator(this);
		}
	}

	public final BooleanUnaryOperatorContext booleanUnaryOperator() throws RecognitionException {
		BooleanUnaryOperatorContext _localctx = new BooleanUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanUnaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBooleanBinaryOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBooleanBinaryOperator1(this);
		}
	}

	public final BooleanBinaryOperator1Context booleanBinaryOperator1() throws RecognitionException {
		BooleanBinaryOperator1Context _localctx = new BooleanBinaryOperator1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanBinaryOperator1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterBooleanBinaryOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitBooleanBinaryOperator2(this);
		}
	}

	public final BooleanBinaryOperator2Context booleanBinaryOperator2() throws RecognitionException {
		BooleanBinaryOperator2Context _localctx = new BooleanBinaryOperator2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanBinaryOperator2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFname(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		public List<Expression> rval;
		public ExpressionContext expression;
		public ParametersContext parameters;
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameters);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				((ParametersContext)_localctx).expression = expression(0);
				setState(341);
				match(T__41);
				setState(342);
				((ParametersContext)_localctx).parameters = parameters();
				 ((ParametersContext)_localctx).rval =  ((ParametersContext)_localctx).parameters.rval; _localctx.rval.add(((ParametersContext)_localctx).expression.rval); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				((ParametersContext)_localctx).expression = expression(0);
				 ((ParametersContext)_localctx).rval =  new LinkedList<>(); _localctx.rval.add(((ParametersContext)_localctx).expression.rval); 
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
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDelimiter(this);
		}
	}

	public final DelimiterContext delimiter() throws RecognitionException {
		DelimiterContext _localctx = new DelimiterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0163\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\6\3"+
		"A\n\3\r\3\16\3B\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4e\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0098\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\u00a9\n\5\f\5\16\5\u00ac\13\5\3\6\3\6\6\6\u00b0\n\6\r\6\16\6"+
		"\u00b1\7\6\u00b4\n\6\f\6\16\6\u00b7\13\6\3\6\3\6\3\7\3\7\7\7\u00bd\n\7"+
		"\f\7\16\7\u00c0\13\7\3\7\3\7\7\7\u00c4\n\7\f\7\16\7\u00c7\13\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00d1\n\b\f\b\16\b\u00d4\13\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\5\t\u00dc\n\t\3\t\3\t\5\t\u00e0\n\t\3\t\3\t\5\t\u00e4\n\t"+
		"\3\t\3\t\7\t\u00e8\n\t\f\t\16\t\u00eb\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u00f5\n\n\f\n\16\n\u00f8\13\n\3\n\3\n\3\n\7\n\u00fd\n\n\f\n\16"+
		"\n\u0100\13\n\3\n\5\n\u0103\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u010b"+
		"\n\13\3\13\3\13\7\13\u010f\n\13\f\13\16\13\u0112\13\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u012a\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0136"+
		"\n\f\f\f\16\f\u0139\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015f"+
		"\n\33\3\34\3\34\3\34\2\4\b\26\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\t\3\2\24\27\3\2\31\33\3\2\26\27\3\2\35\37\3\2"+
		" !\3\2#(\4\2\n\n\16\16\2\u0175\2;\3\2\2\2\4>\3\2\2\2\6d\3\2\2\2\b\u0097"+
		"\3\2\2\2\n\u00b5\3\2\2\2\f\u00ba\3\2\2\2\16\u00cb\3\2\2\2\20\u00d8\3\2"+
		"\2\2\22\u00ef\3\2\2\2\24\u0106\3\2\2\2\26\u0129\3\2\2\2\30\u013a\3\2\2"+
		"\2\32\u013c\3\2\2\2\34\u013e\3\2\2\2\36\u0140\3\2\2\2 \u0142\3\2\2\2\""+
		"\u0144\3\2\2\2$\u0146\3\2\2\2&\u0148\3\2\2\2(\u014a\3\2\2\2*\u014c\3\2"+
		"\2\2,\u014e\3\2\2\2.\u0150\3\2\2\2\60\u0152\3\2\2\2\62\u0154\3\2\2\2\64"+
		"\u015e\3\2\2\2\66\u0160\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<\3\3\2\2\2=;\3\2\2\2>@\5\6\4\2?A\5\66\34\2@?\3\2\2\2AB\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\3\1\2E\5\3\2\2\2FG\5\f\7\2GH"+
		"\b\4\1\2He\3\2\2\2IJ\5\16\b\2JK\b\4\1\2Ke\3\2\2\2LM\5\20\t\2MN\b\4\1\2"+
		"Ne\3\2\2\2OP\5\22\n\2PQ\b\4\1\2Qe\3\2\2\2RS\5\24\13\2ST\b\4\1\2Te\3\2"+
		"\2\2UV\7\3\2\2Ve\b\4\1\2WX\7\4\2\2Xe\b\4\1\2YZ\7\5\2\2Ze\b\4\1\2[\\\7"+
		"\6\2\2\\]\5\b\5\2]^\b\4\1\2^e\3\2\2\2_`\7\6\2\2`e\b\4\1\2ab\5\b\5\2bc"+
		"\b\4\1\2ce\3\2\2\2dF\3\2\2\2dI\3\2\2\2dL\3\2\2\2dO\3\2\2\2dR\3\2\2\2d"+
		"U\3\2\2\2dW\3\2\2\2dY\3\2\2\2d[\3\2\2\2d_\3\2\2\2da\3\2\2\2e\7\3\2\2\2"+
		"fg\b\5\1\2gh\7\60\2\2h\u0098\b\5\1\2ij\5\62\32\2jk\7\7\2\2kl\5\64\33\2"+
		"lm\7\b\2\2mn\b\5\1\2n\u0098\3\2\2\2op\5\60\31\2pq\b\5\1\2q\u0098\3\2\2"+
		"\2rs\7\7\2\2st\5\b\5\2tu\7\b\2\2uv\b\5\1\2v\u0098\3\2\2\2wx\5\60\31\2"+
		"xy\5\30\r\2yz\b\5\1\2z\u0098\3\2\2\2{|\5\30\r\2|}\5\60\31\2}~\b\5\1\2"+
		"~\u0098\3\2\2\2\177\u0080\5\30\r\2\u0080\u0081\5\b\5\7\u0081\u0082\b\5"+
		"\1\2\u0082\u0098\3\2\2\2\u0083\u0084\5\60\31\2\u0084\u0085\5 \21\2\u0085"+
		"\u0086\5\b\5\6\u0086\u0087\b\5\1\2\u0087\u0098\3\2\2\2\u0088\u0089\5\60"+
		"\31\2\u0089\u008a\5\"\22\2\u008a\u008b\5\b\5\5\u008b\u008c\b\5\1\2\u008c"+
		"\u0098\3\2\2\2\u008d\u008e\5\60\31\2\u008e\u008f\5$\23\2\u008f\u0090\5"+
		"\b\5\4\u0090\u0091\b\5\1\2\u0091\u0098\3\2\2\2\u0092\u0093\5\60\31\2\u0093"+
		"\u0094\5&\24\2\u0094\u0095\5\b\5\3\u0095\u0096\b\5\1\2\u0096\u0098\3\2"+
		"\2\2\u0097f\3\2\2\2\u0097i\3\2\2\2\u0097o\3\2\2\2\u0097r\3\2\2\2\u0097"+
		"w\3\2\2\2\u0097{\3\2\2\2\u0097\177\3\2\2\2\u0097\u0083\3\2\2\2\u0097\u0088"+
		"\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0092\3\2\2\2\u0098\u00aa\3\2\2\2\u0099"+
		"\u009a\f\f\2\2\u009a\u009b\5\32\16\2\u009b\u009c\5\b\5\r\u009c\u009d\b"+
		"\5\1\2\u009d\u00a9\3\2\2\2\u009e\u009f\f\13\2\2\u009f\u00a0\5\34\17\2"+
		"\u00a0\u00a1\5\b\5\f\u00a1\u00a2\b\5\1\2\u00a2\u00a9\3\2\2\2\u00a3\u00a4"+
		"\f\n\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\5\b\5\13\u00a6\u00a7\b\5\1"+
		"\2\u00a7\u00a9\3\2\2\2\u00a8\u0099\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8\u00a3"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\t\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\6\4\2\u00ae\u00b0\5\66\34"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\b\6\1\2\u00b9\13\3\2\2\2\u00ba\u00be\7\t\2\2\u00bb\u00bd"+
		"\7\n\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c5\5\n"+
		"\6\2\u00c2\u00c4\7\n\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\b\7\1\2\u00ca\r\3\2\2\2\u00cb\u00cc"+
		"\7\f\2\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00d2\7\b\2\2"+
		"\u00cf\u00d1\7\n\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\5\6\4\2\u00d6\u00d7\b\b\1\2\u00d7\17\3\2\2\2\u00d8\u00d9\7\r\2"+
		"\2\u00d9\u00db\7\7\2\2\u00da\u00dc\5\6\4\2\u00db\u00da\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\7\16\2\2\u00de\u00e0\5\26\f\2"+
		"\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3"+
		"\7\16\2\2\u00e2\u00e4\5\6\4\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e9\7\b\2\2\u00e6\u00e8\7\n\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\5\6\4\2\u00ed\u00ee\b\t"+
		"\1\2\u00ee\21\3\2\2\2\u00ef\u00f0\7\17\2\2\u00f0\u00f1\7\7\2\2\u00f1\u00f2"+
		"\5\26\f\2\u00f2\u00f6\7\b\2\2\u00f3\u00f5\5\66\34\2\u00f4\u00f3\3\2\2"+
		"\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u0102\5\6\4\2\u00fa\u00fe\7\20\2\2"+
		"\u00fb\u00fd\7\n\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0103\5\6\4\2\u0102\u00fa\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\b\n\1\2\u0105\23\3\2\2\2\u0106\u0107\7\21\2\2\u0107\u0108"+
		"\5\62\32\2\u0108\u010a\7\7\2\2\u0109\u010b\5\64\33\2\u010a\u0109\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0110\7\b\2\2\u010d\u010f"+
		"\5\66\34\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114"+
		"\5\f\7\2\u0114\u0115\b\13\1\2\u0115\25\3\2\2\2\u0116\u0117\b\f\1\2\u0117"+
		"\u0118\7\22\2\2\u0118\u012a\b\f\1\2\u0119\u011a\7\23\2\2\u011a\u012a\b"+
		"\f\1\2\u011b\u011c\7\7\2\2\u011c\u011d\5\26\f\2\u011d\u011e\7\b\2\2\u011e"+
		"\u011f\b\f\1\2\u011f\u012a\3\2\2\2\u0120\u0121\5*\26\2\u0121\u0122\5\26"+
		"\f\6\u0122\u0123\b\f\1\2\u0123\u012a\3\2\2\2\u0124\u0125\5\b\5\2\u0125"+
		"\u0126\5(\25\2\u0126\u0127\5\b\5\2\u0127\u0128\b\f\1\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0116\3\2\2\2\u0129\u0119\3\2\2\2\u0129\u011b\3\2\2\2\u0129"+
		"\u0120\3\2\2\2\u0129\u0124\3\2\2\2\u012a\u0137\3\2\2\2\u012b\u012c\f\4"+
		"\2\2\u012c\u012d\5,\27\2\u012d\u012e\5\26\f\5\u012e\u012f\b\f\1\2\u012f"+
		"\u0136\3\2\2\2\u0130\u0131\f\3\2\2\u0131\u0132\5.\30\2\u0132\u0133\5\26"+
		"\f\4\u0133\u0134\b\f\1\2\u0134\u0136\3\2\2\2\u0135\u012b\3\2\2\2\u0135"+
		"\u0130\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\27\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\t\2\2\2\u013b\31"+
		"\3\2\2\2\u013c\u013d\7\30\2\2\u013d\33\3\2\2\2\u013e\u013f\t\3\2\2\u013f"+
		"\35\3\2\2\2\u0140\u0141\t\4\2\2\u0141\37\3\2\2\2\u0142\u0143\7\34\2\2"+
		"\u0143!\3\2\2\2\u0144\u0145\t\5\2\2\u0145#\3\2\2\2\u0146\u0147\t\6\2\2"+
		"\u0147%\3\2\2\2\u0148\u0149\7\"\2\2\u0149\'\3\2\2\2\u014a\u014b\t\7\2"+
		"\2\u014b)\3\2\2\2\u014c\u014d\7)\2\2\u014d+\3\2\2\2\u014e\u014f\7*\2\2"+
		"\u014f-\3\2\2\2\u0150\u0151\7+\2\2\u0151/\3\2\2\2\u0152\u0153\7/\2\2\u0153"+
		"\61\3\2\2\2\u0154\u0155\7/\2\2\u0155\63\3\2\2\2\u0156\u0157\5\b\5\2\u0157"+
		"\u0158\7,\2\2\u0158\u0159\5\64\33\2\u0159\u015a\b\33\1\2\u015a\u015f\3"+
		"\2\2\2\u015b\u015c\5\b\5\2\u015c\u015d\b\33\1\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0156\3\2\2\2\u015e\u015b\3\2\2\2\u015f\65\3\2\2\2\u0160\u0161\t\b\2"+
		"\2\u0161\67\3\2\2\2\32;Bd\u0097\u00a8\u00aa\u00b1\u00b5\u00be\u00c5\u00d2"+
		"\u00db\u00df\u00e3\u00e9\u00f6\u00fe\u0102\u010a\u0110\u0129\u0135\u0137"+
		"\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}