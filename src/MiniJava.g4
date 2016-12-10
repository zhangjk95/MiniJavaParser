grammar MiniJava;

goal : mainClass ( classDeclaration )* EOF ;
mainClass : name '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}' ;
classDeclaration : name ( baseclass)? '{' varDeclarations methodDeclarations '}' ;
name:
	'class' Identifier
	;
baseclass:
	'extends' Identifier 
    ;
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
/*Expression	::=	Expression ( "&&" | "<" | "+" | "-" | "*" ) Expression
|	Expression "[" Expression "]"
|	Expression "." "length"
|	Expression "." Identifier "(" ( Expression ( "," Expression )* )? ")"
|	<INTEGER_LITERAL>
|	"true"
|	"false"
|	Identifier
|	"this"
|	"new" "int" "[" Expression "]"
|	"new" Identifier "(" ")"
|	"!" Expression
|	"(" Expression ")"*/
expression :
and
    ;	

//expr: expr ('-' | '+' ) term | term ;
//term: term '*' factor | factor ;
//factor : Identifier|INTEGER_LITERAL |/*'('factor')' |'('term')'| */'('expr')'|'('expression')';

//(expression)>'a.func()/a.length' > 'a[b]' > 'new A()' > 'new int[n]' > '!' >  '*' > '+-' > '<' > '&&' >  (INTEGER_LITERAL|'true' | 'false'| Identifier | 'this')


and : and '&&' less #andTo
	| less #nextAnd
	;
less : less '<' plus #lessThan
	| plus #nextLess
	;
plus : plus ( '-' | '+' ) multiply #plusTo
	| multiply #nextPlus
	;
multiply : multiply '*' not #multiplyTo
	| not #nextMultiply
	;
not : '!' not #notTo
	| newarray #nextNot
	;
newarray : 'new' 'int' '[' special ']' #newarrayTo
	| newid #nextneWarray
	;
newid : 'new' Identifier '(' ')' #newTo
	| array #nextNewid
	;
array : array '[' special ']' #arrayTo
	| function #nextArray
	;
function : function '.' 'length' #functionLengh
	| function '.' Identifier '(' ')' #functionNone
	| function '.' Identifier '(' ( special ( ',' special )* ) ')'  #functionVariable 
	| element #nextFunction
;
element : 
	INTEGER_LITERAL
	| 'true' 
	| 'false'
	| Identifier 
	| 'this' 
    | '('and')'
;
special:
	INTEGER_LITERAL
	| 'true' 
	| 'false'
	| Identifier 
	| 'this' 
    | and
;

/*
and : and '<' less
	| less #nextLess
	;
less : less '<' plus
	| plus #nextplus
	;
plus : plus ( '-' | '+' ) multiply 
	| multiply #nextmultiply
	;
multiply : multiply '*' not
	| not #nextnot
	;
not : '!' not
	| newarray #nextnewarray
	;
newarray : 'new' 'int' '[' special ']'
	| newid #nextnewid
	;
newid : 'new' Identifier '(' ')'
	| array #nextarray
	;
array : array '[' special ']'
	| function #nextfunction
	;
function : function '.' 'length' 
	| function '.' Identifier '(' ')' 
	| function '.' 'length' | function '.' Identifier '(' ( special ( ',' special )* ) ')'  
	| function '.' 'length'
	| element #nextelement
;
element : 
	INTEGER_LITERAL
	| 'true' 
	| 'false'
	| Identifier 
	| 'this' 
    | '('and')'
;
special:
	INTEGER_LITERAL
	| 'true' 
	| 'false'
	| Identifier 
	| 'this' 
    | and
;
*/
Identifier : [A-Za-z][A-Za-z0-9_]* ;
INTEGER_LITERAL : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '//'.*?[\n] -> skip ;