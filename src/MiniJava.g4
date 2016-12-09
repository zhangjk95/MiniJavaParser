grammar MiniJava;

goal : mainClass ( classDeclaration )* EOF ;
mainClass : 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' ;
classDeclaration : 'class' Identifier ( 'extends' Identifier )? '{' varDeclarations methodDeclarations '}' ;
varDeclarations:( varDeclaration )*;
methodDeclarations:( methodDeclaration )*;
varDeclaration : type Identifier ';' ;
methodDeclaration : 'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' ;
type : 'int' '[' ']'
    | 'boolean'
    | 'int'
    | Identifier
    ;
statement : '{' ( statement )* '}'
    | 'if' '(' expression ')' statement 'else' statement
    | 'while' '(' expression ')' statement
    | 'System.out.println' '(' expression ')' ';'
    | Identifier '=' expression ';'
    | Identifier '[' expression ']' '=' expression ';'
    ;
expression : expression ( '&&' | '<' | '+' | '-' | '*' ) expression
    | expression '[' expression ']'
    | expression '.' 'length'
    | expression '.' Identifier '(' ( expression ( ',' expression )* )? ')'
    | INTEGER_LITERAL
    | 'true'
    | 'false'
    | Identifier
    | 'this'
    | 'new' 'int' '[' expression ']'
    | 'new' Identifier '(' ')'
    | '!' expression
    | '(' expression ')'
    ;

Identifier : [A-Za-z][A-Za-z0-9_]* ;
INTEGER_LITERAL : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '//'.*?[\n] -> skip ;