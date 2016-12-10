grammar MiniJava;

goal : mainClass ( classDeclaration )* EOF ;
mainClass : 'class' name '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}' ;
classDeclaration : 'class' name ('extends' baseclass)? '{' varDeclarations methodDeclarations '}' ;
name: identifier ;
baseclass: identifier ;
varDeclarations:( varDeclaration )*;
methodDeclarations:( method )*;
varDeclaration : type identifier ';' ;
method : 'public' returnType name '(' params? ')' '{' vars statements '}' ;
params : ( type identifier ( ',' type identifier )* ) ;
vars : ( varDeclaration )* ;
statements : ( statement )* ;
returnType : type ;
type : 'int' '[' ']'
    | 'boolean'
    | 'int'
    | identifier
    ;
statement : '{' ( statement )* '}' #block
    | 'if' '(' expression ')' statement 'else' statement #if
    | 'while' '(' expression ')' statement  #while
    | 'System.out.println' '(' expression ')' ';' #output
    | identifier '=' expression ';'  #assign
    | identifier '[' expression ']' '=' expression ';' #assignArray
    | 'return' expression ';' #return
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