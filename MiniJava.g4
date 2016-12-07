grammar MiniJava;
goal : mainClass ( classDeclaration )* EOF;
mainClass : 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' '}' '}';
classDeclaration : 'class';
statement : Identifier ';';
Identifier : [A-Za-z][A-Za-z0-9_]*;
WS : [ \t\r\n]+ -> skip ;