grammar MiniJava;

goal : mainClass ( classDeclaration )* EOF ;
mainClass : 'class' name '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}' ;
classDeclaration : 'class' name ('extends' baseclass)? '{' vars methodDeclarations '}' ;
name: identifier ;
baseclass: identifier ;
methodDeclarations:( method )*;
var : type identifier ';' ;
method : 'public' returnType name '(' params? ')' '{' vars statements '}' ;
params : ( type identifier ( ',' type identifier )* ) ;
vars : ( var )* ;
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
andExpr
    ;	

//(expression)>'a.func()/a.length' > 'a[b]' > 'new A()' > 'new int[n]' > '!' >  '*' > '+-' > '<' > '&&' >  (integer|'true' | 'false'| identifier | 'this')

andExpr : andExpr '&&' lessExpr #and
	| lessExpr #nextAnd
	;
lessExpr : lessExpr '<' addExpr #isLessThan
	| addExpr #nextLess
	;

addExpr : addExpr '+' multiplyExpr #add
    | addExpr '-' multiplyExpr #subtract
	| multiplyExpr #nextPlus
	;
multiplyExpr : multiplyExpr '*' notExpr #multiply
	| notExpr #nextMultiply
	;
notExpr : '!' notExpr #not
	| newarrayExpr #nextNot
	;
newarrayExpr : 'new' 'int' '[' special ']' #newarray
	| newidExpr #nextneWarray
	;
newidExpr : 'new' identifier '(' ')' #new
	| arrayExpr #nextNewid
	;
arrayExpr : arrayExpr '[' special ']' #array
	| functionExpr #nextArray
	;
functionExpr : functionExpr '.' 'length' #getLength
	//| function '.' identifier '(' ')' #functionNone
	| functionExpr '.' funcname '(' args ')'  #methodCall 
	| element #nextFunction
;
//funcobject :
	//functionExpr #object
	//;
element : 
	integer
	| specialElement
	| identifier 
    | '('andExpr')'
;
args:
	(special ( ',' special )*)?;
special:
	integer
	| specialElement
	| identifier 
    | andExpr
;

funcname : identifier #functionName
;
specialElement: 'true' | 'false' | 'this' ;
identifier: Identifier ;
integer: INTEGER_LITERAL ;

Identifier : [A-Za-z][A-Za-z0-9_]* ;
INTEGER_LITERAL : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '//'.*?[\n] -> skip ;