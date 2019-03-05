// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.*;
    import java.lang.*;
    import java.util.function.*;

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
	 * Enter a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CalculatorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CalculatorParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#topBoolExpr}.
	 * @param ctx the parse tree
	 */
	void enterTopBoolExpr(CalculatorParser.TopBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#topBoolExpr}.
	 * @param ctx the parse tree
	 */
	void exitTopBoolExpr(CalculatorParser.TopBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void enterTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void exitTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalculatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CalculatorParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CalculatorParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CalculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CalculatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(CalculatorParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(CalculatorParser.ArrContext ctx);
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
	 * Enter a parse tree produced by {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(CalculatorParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(CalculatorParser.BoolExprContext ctx);
}