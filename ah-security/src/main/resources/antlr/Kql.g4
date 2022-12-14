// 定义一个文法名称，必须和文件名称一致
grammar Kql;

parse
 : expression EOF
 ;

expression
 : LPAREN expression RPAREN                                                 #parenExpression
 | NOT expression                                                           #notExpression
 | left=expression op=comparator right=expression                           #comparatorExpression
 | left=expression op=binary right=expression                               #binaryExpression
 | left=expression op=range right='[' expression (',' expression)* ']'      #rangeExpression
 | left=expression op=exist                                                 #existExpression
 | bool                                                                     #boolExpression
 | nihao                                                                     #nihaoExpression
 | IDENTIFIER                                                               #identifierExpression
 | DECIMAL                                                                  #decimalExpression
 ;

comparator
 : GT | GE | LT | LE | EQ | NOTEQ | CONTAINS | NOTCONTAINS
 ;

binary
 : AND | OR
 ;

range
 : IN | NOTIN
 ;

exist
 : EXIST | NOTEXIST
 ;

bool
 : TRUE | FALSE
 ;

nihao
 : NIHAO
 ;

// 词法分析器的规则必须用大写字母开头
// 定义语法符号INT，它由一个或多个数字组成
AND        : 'and' | 'AND' ;
OR         : 'OR' ;
NOT        : 'not' | 'NOT';
NIHAO       : 'nihao' | 'NIHAO' ;
TRUE       : 'true' | 'TRUE' ;
FALSE      : 'false' | 'FALSE' ;
GT         : '>' ;
GE         : '>=' ;
LT         : '<' ;
LE         : '<=' ;
EQ         : '==' ;
NOTEQ         : '!=' ;
IN         : 'in' | 'IN' ;
NOTIN      : 'notin' | 'NOTIN' ;
EXIST      : 'exist' | 'EXIST' ;
NOTEXIST      : 'notexist' | 'NOTEXIST' ;
CONTAINS      : 'contains' | 'CONTAINS' ;
NOTCONTAINS      : 'notcontains' | 'NOTCONTAINS' ;

LPAREN     : '(' ;
RPAREN     : ')' ;
DECIMAL    : '-'? [0-9]+ ( '.' [0-9]+ )? ;
IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]* ;
WS         : [ \t\n\r]+ -> skip ;

