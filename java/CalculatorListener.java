// Generated from Calculator.g4 by ANTLR 4.7.2
 import java.util.*; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#topStatement}.
	 * @param ctx the parse tree
	 */
	void enterTopStatement(CalculatorParser.TopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#topStatement}.
	 * @param ctx the parse tree
	 */
	void exitTopStatement(CalculatorParser.TopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(CalculatorParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(CalculatorParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CalculatorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CalculatorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(CalculatorParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(CalculatorParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(CalculatorParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(CalculatorParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CalculatorParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CalculatorParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#defineFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefineFunction(CalculatorParser.DefineFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#defineFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefineFunction(CalculatorParser.DefineFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculatorParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculatorParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#libCall}.
	 * @param ctx the parse tree
	 */
	void enterLibCall(CalculatorParser.LibCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#libCall}.
	 * @param ctx the parse tree
	 */
	void exitLibCall(CalculatorParser.LibCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#readCall}.
	 * @param ctx the parse tree
	 */
	void enterReadCall(CalculatorParser.ReadCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#readCall}.
	 * @param ctx the parse tree
	 */
	void exitReadCall(CalculatorParser.ReadCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CalculatorParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CalculatorParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#binaryOperator1}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator1(CalculatorParser.BinaryOperator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#binaryOperator1}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator1(CalculatorParser.BinaryOperator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#binaryOperator2}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator2(CalculatorParser.BinaryOperator2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#binaryOperator2}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator2(CalculatorParser.BinaryOperator2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#binaryOperator3}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator3(CalculatorParser.BinaryOperator3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#binaryOperator3}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator3(CalculatorParser.BinaryOperator3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operatorAssignment1}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment1(CalculatorParser.OperatorAssignment1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operatorAssignment1}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment1(CalculatorParser.OperatorAssignment1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operatorAssignment2}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment2(CalculatorParser.OperatorAssignment2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operatorAssignment2}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment2(CalculatorParser.OperatorAssignment2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operatorAssignment3}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment3(CalculatorParser.OperatorAssignment3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operatorAssignment3}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment3(CalculatorParser.OperatorAssignment3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operatorAssignment4}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment4(CalculatorParser.OperatorAssignment4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operatorAssignment4}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment4(CalculatorParser.OperatorAssignment4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(CalculatorParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(CalculatorParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#booleanUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanUnaryOperator(CalculatorParser.BooleanUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#booleanUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanUnaryOperator(CalculatorParser.BooleanUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#booleanBinaryOperator1}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBinaryOperator1(CalculatorParser.BooleanBinaryOperator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#booleanBinaryOperator1}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBinaryOperator1(CalculatorParser.BooleanBinaryOperator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#booleanBinaryOperator2}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBinaryOperator2(CalculatorParser.BooleanBinaryOperator2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#booleanBinaryOperator2}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBinaryOperator2(CalculatorParser.BooleanBinaryOperator2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(CalculatorParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(CalculatorParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CalculatorParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CalculatorParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#defParameters}.
	 * @param ctx the parse tree
	 */
	void enterDefParameters(CalculatorParser.DefParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#defParameters}.
	 * @param ctx the parse tree
	 */
	void exitDefParameters(CalculatorParser.DefParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void enterDelimiter(CalculatorParser.DelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void exitDelimiter(CalculatorParser.DelimiterContext ctx);
}