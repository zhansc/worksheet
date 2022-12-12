package com.zhansc.ahsecurity.antlr.ArrayInit;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * 自定义语法翻译
 * @author zhanshuchan
 * @date 2022/12/10
 **/
public class ShortToUnicodeString extends ArrayInitBaseListener {
    /**
     * 将"{" 翻译为'"'
     * @param ctx
     */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /**
     * //将 ”}“ 翻译为 '”'
     * @param ctx
     */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        TerminalNode node = ctx.INT();
        if (node == null) {
            return;
        }
        Integer value = Integer.valueOf(node.getText());
        System.out.printf("\\u%04x", value);
    }

    public static void main(String[] args) {
        String str = "{\"shuxue\":99,\"mingci\":3,\"kaixinzhi\":451}";

        ANTLRInputStream input = new ANTLRInputStream(str);
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicodeString(), tree);
        System.out.println();

    }
}
