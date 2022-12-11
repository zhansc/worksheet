// Generated from java-escape by ANTLR 4.11.1
package com.zhansc.ahsecurity.antlr.kql.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(KqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(KqlParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(KqlParser.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(KqlParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(KqlParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(KqlParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(KqlParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(KqlParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorExpression(KqlParser.ComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existExpression}
	 * labeled alternative in {@link KqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistExpression(KqlParser.ExistExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KqlParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(KqlParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KqlParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(KqlParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KqlParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(KqlParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KqlParser#exist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist(KqlParser.ExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link KqlParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(KqlParser.BoolContext ctx);
}