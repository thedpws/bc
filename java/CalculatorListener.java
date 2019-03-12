// Generated from Calculator.g4 by ANTLR 4.7.2


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
	 * Enter a parse tree produced by {@link CalculatorParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(CalculatorParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(CalculatorParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operatorAssignment}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment(CalculatorParser.OperatorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operatorAssignment}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment(CalculatorParser.OperatorAssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link CalculatorParser#booleanBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBinaryOperator(CalculatorParser.BooleanBinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#booleanBinaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBinaryOperator(CalculatorParser.BooleanBinaryOperatorContext ctx);
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
	 * Enter a parse tree produced by {@link CalculatorParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CalculatorParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CalculatorParser.FunctionContext ctx);
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