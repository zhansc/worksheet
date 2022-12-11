package com.zhansc.ahsecurity.antlr;

import com.zhansc.ahsecurity.antlr.kql.antlr.KqlBaseVisitor;
import com.zhansc.ahsecurity.antlr.kql.antlr.KqlLexer;
import com.zhansc.ahsecurity.antlr.kql.antlr.KqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Map;

/**
 * KQL解析
 *
 * @author zhanshuchan
 * @date 2022/12/11
 **/
public class KqlCustomVisitor extends KqlBaseVisitor<Map<String, String>> {
    @Override
    public Map<String, String> visitParse(KqlParser.ParseContext ctx) {
        return super.visitParse(ctx);
    }

    @Override
    public Map<String, String> visitBinaryExpression(KqlParser.BinaryExpressionContext ctx) {
        return super.visitBinaryExpression(ctx);
    }

    @Override
    public Map<String, String> visitDecimalExpression(KqlParser.DecimalExpressionContext ctx) {
        return super.visitDecimalExpression(ctx);
    }

    @Override
    public Map<String, String> visitBoolExpression(KqlParser.BoolExpressionContext ctx) {
        return super.visitBoolExpression(ctx);
    }

    @Override
    public Map<String, String> visitIdentifierExpression(KqlParser.IdentifierExpressionContext ctx) {
        return super.visitIdentifierExpression(ctx);
    }

    @Override
    public Map<String, String> visitRangeExpression(KqlParser.RangeExpressionContext ctx) {
        return super.visitRangeExpression(ctx);
    }

    @Override
    public Map<String, String> visitNotExpression(KqlParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public Map<String, String> visitParenExpression(KqlParser.ParenExpressionContext ctx) {
        return super.visitParenExpression(ctx);
    }

    @Override
    public Map<String, String> visitComparatorExpression(KqlParser.ComparatorExpressionContext ctx) {
        return super.visitComparatorExpression(ctx);
    }

    @Override
    public Map<String, String> visitExistExpression(KqlParser.ExistExpressionContext ctx) {
        return super.visitExistExpression(ctx);
    }

    @Override
    public Map<String, String> visitComparator(KqlParser.ComparatorContext ctx) {
        return super.visitComparator(ctx);
    }

    @Override
    public Map<String, String> visitBinary(KqlParser.BinaryContext ctx) {
        return super.visitBinary(ctx);
    }

    @Override
    public Map<String, String> visitRange(KqlParser.RangeContext ctx) {
        return super.visitRange(ctx);
    }

    @Override
    public Map<String, String> visitExist(KqlParser.ExistContext ctx) {
        return super.visitExist(ctx);
    }

    @Override
    public Map<String, String> visitBool(KqlParser.BoolContext ctx) {
        return super.visitBool(ctx);
    }

    public static void main(String[] args) {
        String kql = "alarm == false";
        String kql1 = "alarm != true AND desc in [hao]";
        KqlLexer lexer = new KqlLexer(CharStreams.fromString(kql));
        KqlParser parser = new KqlParser(new CommonTokenStream(lexer));
        KqlCustomVisitor visitor = new KqlCustomVisitor();

        System.out.println(visitor.visit(parser.parse()));
        System.out.println("end");
    }

}
