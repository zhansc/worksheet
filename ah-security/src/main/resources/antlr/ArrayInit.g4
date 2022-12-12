// 定义一个语法文件（语法规则以小写字母开头）
grammar ArrayInit;

// 名为init的规则，它匹配一对花括号中的、逗号分隔的value
init	:	'{' value (',' value)* '}';
// 一个value可以是嵌套的花括号结构，也可以是一个简单的整数，即INT语法符号
value : init
	 | INT
	 ;
// 词法分析器的规则必须用大写字母开头
// 定义语法符号INT，它由一个或多个数字组成
INT : 	[0-9]+ ;
// 定义语法规则“空白符号”，skip
WS  :	[\t\r\n]+ -> skip ;