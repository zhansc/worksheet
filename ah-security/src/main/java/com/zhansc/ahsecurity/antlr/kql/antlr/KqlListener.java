// Generated from java-escape by ANTLR 4.11.1
package com.zhansc.ahsecurity.antlr.kql.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KqlParser}.
 */
public interface KqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(KqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(KqlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(KqlParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(KqlParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpression(KqlParser.DecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpression(KqlParser.DecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(KqlParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(KqlParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(KqlParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(KqlParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(KqlParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(KqlParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(KqlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(KqlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(KqlParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(KqlParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparatorExpression(KqlParser.ComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparatorExpression(KqlParser.ComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExistExpression(KqlParser.ExistExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExistExpression(KqlParser.ExistExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KqlParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(KqlParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KqlParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(KqlParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KqlParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(KqlParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KqlParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(KqlParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KqlParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(KqlParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KqlParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(KqlParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KqlParser#exist}.
	 * @param ctx the parse tree
	 */
	void enterExist(KqlParser.ExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link KqlParser#exist}.
	 * @param ctx the parse tree
	 */
	void exitExist(KqlParser.ExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link KqlParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(KqlParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link KqlParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(KqlParser.BoolContext ctx);
}