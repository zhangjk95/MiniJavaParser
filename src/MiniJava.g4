grammar MiniJava;

goal : mainClass ( classDeclaration )* EOF ;
mainClass : name '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}' ;
classDeclaration : name ( baseclass)? '{' varDeclarations methodDeclarations '}' ;
name:
	'class' identifier
	;
baseclass:
	'extends' identifier 
    ;
varDeclarations:( varDeclaration )*;
methodDeclarations:( methodDeclaration )*;
varDeclaration : type identifier ';' ;
methodDeclaration : 'public' type identifier '(' ( type identifier ( ',' type identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}' ;
type : 'int' '[' ']'
    | 'boolean'
    | 'int'
    | identifier
    ;
statement : '{' ( statement )* '}' #allStatement
    | 'if' '(' expression ')' statement 'else' statement #if
    | 'while' '(' expression ')' statement  #while
    | 'System.out.println' '(' expression ')' ';' #sprint
    | identifier '=' expression ';'  #indentifier
    | identifier '[' expression ']' '=' expression ';' #identifierOneofArray
    ;

expression :
and
    ;	

//(expression)>'a.func()/a.length' > 'a[b]' > 'new A()' > 'new int[n]' > '!' >  '*' > '+-' > '<' > '&&' >  (integer|'true' | 'false'| identifier | 'this')


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
newid : 'new' identifier '(' ')' #newTo
	| array #nextNewid
	;
array : array '[' special ']' #arrayTo
	| function #nextArray
	;
function : function '.' 'length' #functionLengh
	//| function '.' identifier '(' ')' #functionNone
	| function '.' identifier '(' args ')'  #functionVariable 
	| element #nextFunction
;
element : 
	integer
	| specialElement
	| identifier 
    | '('and')'
;
args:
	(special ( ',' special )*)?;
special:
	integer
	| specialElement
	| identifier 
    | and
;

specialElement: 'true' | 'false' | 'this' ;
identifier: Identifier ;
integer: INTEGER_LITERAL ;

Identifier : [A-Za-z][A-Za-z0-9_]* ;
INTEGER_LITERAL : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '//'.*?[\n] -> skip ;