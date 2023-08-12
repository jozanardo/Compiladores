grammar IsiLanguage;

programa    : 'programa' declara bloco 'fimprog.' ;

declara     : 'declare' ID (',' ID)* '.' ;

bloco       : (cmd '.')+ ;

cmd         : cmdLeitura | cmdEscrita | cmdExpr | cmdIf ;

cmdLeitura  : 'leia' '(' ID ')' ;

cmdEscrita  : 'escreva' '(' TEXTO | ID ')' ;

cmdIf       : 'se' '(' expr OP_REL expr ')' 'entao' '{' cmd+ '}' ('senao' '{' cmd+ '}')? ;

cmdExpr     : ID ':=' expr ;

OP_REL      : '<' | '>' | '<=' | '>=' | '!=' | '==' ;

expr        : termo exprl ;

exprl       : ('+' termo exprl)* | ('-' termo exprl)* ;

termo       : fator termol ;

termol      : ('*' fator termol)* | ('/' fator termol)* ;

fator       : NUM | ID | '(' expr ')' ;

TEXTO       : '\"' ([0-9] | [a-z] | [A-Z] | '\s')+ '\"' ;

NUM         : [0-9]+ ('.' [0-9]+)? ;

ID          : [a-zA-Z] ([a-z] | [A-Z] | [0-9])* ;

WS          : (' ' | '\t' | '\n' | '\r') -> skip ;