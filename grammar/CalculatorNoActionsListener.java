// Generated from CalculatorNoActions.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorNoActionsParser}.
 */
public interface CalculatorNoActionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorNoActionsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorNoActionsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#topStatement}.
	 * @param ctx the parse tree
	 */
	void enterTopStatement(CalculatorNoActionsParser.TopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#topStatement}.
	 * @param ctx the parse tree
	 */
	void exitTopStatement(CalculatorNoActionsParser.TopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculatorNoActionsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculatorNoActionsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorNoActionsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorNoActionsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(CalculatorNoActionsParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(CalculatorNoActionsParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CalculatorNoActionsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CalculatorNoActionsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(CalculatorNoActionsParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(CalculatorNoActionsParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(CalculatorNoActionsParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(CalculatorNoActionsParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CalculatorNoActionsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CalculatorNoActionsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#defineFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefineFunction(CalculatorNoActionsParser.DefineFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#defineFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefineFunction(CalculatorNoActionsParser.DefineFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalculatorNoActionsParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalculatorNoActionsParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#libCall}.
	 * @param ctx the parse tree
	 */
	void enterLibCall(CalculatorNoActionsParser.LibCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#libCall}.
	 * @param ctx the parse tree
	 */
	void exitLibCall(CalculatorNoActionsParser.LibCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#readCall}.
	 * @param ctx the parse tree
	 */
	void enterReadCall(CalculatorNoActionsParser.ReadCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#readCall}.
	 * @param ctx the parse tree
	 */
	void exitReadCall(CalculatorNoActionsParser.ReadCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CalculatorNoActionsParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CalculatorNoActionsParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#binaryOperator1}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator1(CalculatorNoActionsParser.BinaryOperator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#binaryOperator1}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator1(CalculatorNoActionsParser.BinaryOperator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#binaryOperator2}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator2(CalculatorNoActionsParser.BinaryOperator2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#binaryOperator2}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator2(CalculatorNoActionsParser.BinaryOperator2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#binaryOperator3}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator3(CalculatorNoActionsParser.BinaryOperator3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#binaryOperator3}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator3(CalculatorNoActionsParser.BinaryOperator3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#operatorAssignment1}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment1(CalculatorNoActionsParser.OperatorAssignment1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#operatorAssignment1}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment1(CalculatorNoActionsParser.OperatorAssignment1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#operatorAssignment2}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment2(CalculatorNoActionsParser.OperatorAssignment2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#operatorAssignment2}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment2(CalculatorNoActionsParser.OperatorAssignment2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#operatorAssignment3}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment3(CalculatorNoActionsParser.OperatorAssignment3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#operatorAssignment3}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment3(CalculatorNoActionsParser.OperatorAssignment3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#operatorAssignment4}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment4(CalculatorNoActionsParser.OperatorAssignment4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#operatorAssignment4}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment4(CalculatorNoActionsParser.OperatorAssignment4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(CalculatorNoActionsParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(CalculatorNoActionsParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#booleanUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanUnaryOperator(CalculatorNoActionsParser.BooleanUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#booleanUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanUnaryOperator(CalculatorNoActionsParser.BooleanUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#booleanBinaryOperator1}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBinaryOperator1(CalculatorNoActionsParser.BooleanBinaryOperator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#booleanBinaryOperator1}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBinaryOperator1(CalculatorNoActionsParser.BooleanBinaryOperator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#booleanBinaryOperator2}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBinaryOperator2(CalculatorNoActionsParser.BooleanBinaryOperator2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#booleanBinaryOperator2}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBinaryOperator2(CalculatorNoActionsParser.BooleanBinaryOperator2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculatorNoActionsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculatorNoActionsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(CalculatorNoActionsParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(CalculatorNoActionsParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CalculatorNoActionsParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CalculatorNoActionsParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#defParameters}.
	 * @param ctx the parse tree
	 */
	void enterDefParameters(CalculatorNoActionsParser.DefParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#defParameters}.
	 * @param ctx the parse tree
	 */
	void exitDefParameters(CalculatorNoActionsParser.DefParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorNoActionsParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void enterDelimiter(CalculatorNoActionsParser.DelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorNoActionsParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void exitDelimiter(CalculatorNoActionsParser.DelimiterContext ctx);
}