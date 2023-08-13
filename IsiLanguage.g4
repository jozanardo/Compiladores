grammar IsiLanguage;

programa    : 'programa' declara bloco 'fimprog' PF ;

declara     : 'declare' ID (',' ID)* PF ;

bloco       : (cmd)+ ;

cmd         : cmdLeitura | cmdEscrita | cmdExpr | cmdIf ;

cmdLeitura  : 'leia' AP ID FP PF ;

cmdEscrita  : 'escreva' AP (TEXTO | ID) FP PF ;

cmdIf       : 'se' AP expr OP_REL expr FP 'entao' AC cmd+ FC ('senao' AC cmd+ FC)? ;

cmdExpr     : ID ':=' expr PF ;

OP_REL      : '<' | '>' | '<=' | '>=' | '!=' | '==' ;

expr        : termo exprl ;

exprl       : ('+' termo exprl)* | ('-' termo exprl)* ;

termo       : fator termol ;

termol      : ('*' fator termol)* | ('/' fator termol)* ;

fator       : NUM | ID | '(' expr ')' ;

TEXTO       : '"' ( '\\"' | . )*? '"' ;

NUM         : [0-9]+ ('.' [0-9]+)? ;

ID          : [a-zA-Z] ([a-z] | [A-Z] | [0-9])* ;

PF          : '.' ;

AP          : '(' ;

FP          : ')' ;

AC          : '{' ;

FC          : '}' ;

WS          : (' ' | '\t' | '\n' | '\r') -> skip ;