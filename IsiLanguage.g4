grammar IsiLanguage;

@header {
    import datastructures.IsiSymbol;
    import datastructures.IsiVariable;
    import datastructures.IsiSymbolTable;
    import exceptions.IsiSemanticException;
    import java.util.ArrayList;
}

@members {
    private int _tipo;
    private String _varName;
    private String _varValue;
    private IsiSymbolTable symbolTable = new IsiSymbolTable();
    private IsiSymbol symbol;

    public void addID(String id, IsiSymbol symbol) {
    	
        if (!symbolTable.exists(id)) {
            symbolTable.add(symbol);
            System.out.println("Simbolo adicionado " + symbol);
        } else {
            throw new IsiSemanticException("Symbol "+ id + " already declared");
        }
    }

    public void verifyID(String id) {
        if (!symbolTable.exists(id)) {
            throw new IsiSemanticException("Symbol "+ id + " not declared");
        }
    }
}

programa    : 'programa' declara bloco 'fimprog' PF ;

declara     : (declaravar)+ ;

declaravar  : tipo ID {
                _varName = _input.LT(-1).getText();
                _varValue = null;
                symbol = new IsiVariable(_varName, _tipo, _varValue);
                addID(_varName, symbol);
            }
            (VIR ID {
                _varName = _input.LT(-1).getText();
                _varValue = null;
                symbol = new IsiVariable(_varName, _tipo, _varValue);
                addID(_varName, symbol);
            })* PF
            ;

tipo        : 'numero' { _tipo = IsiVariable.NUMBER; }
            | 'texto' { _tipo = IsiVariable.TEXT; }
            ;

bloco       : (cmd)+ ;

cmd         : cmdLeitura | cmdEscrita | cmdExpr | cmdIf | cmdWhile | cmdDoWhile | cmdFor ;

cmdLeitura  : 'leia' AP ID { verifyID(_input.LT(-1).getText()); } FP PF ;

cmdEscrita  : 'escreva' AP (TEXTO | ID { verifyID(_input.LT(-1).getText()); } ) FP PF ;

cmdIf       : 'se' AP condicao FP 'entao' AC bloco FC ('senao' AC bloco FC)? ;

cmdWhile    : 'enquanto' AP condicao FP AC bloco FC ;

cmdDoWhile  : 'faca' AC bloco FC 'enquanto' AP expr OP_REL expr FP ;

cmdFor      : 'para' AP forExpr? PV? condicao? PV? forExpr? FP AC bloco FC ;

forExpr      : ID { verifyID(_input.LT(-1).getText()); } ATTR expr ;

condicao     : expr OP_REL expr ;

cmdExpr     : ID { verifyID(_input.LT(-1).getText()); } ATTR expr PF ;

OP_REL      : '<' | '>' | '<=' | '>=' | '!=' | '==' ;

expr        : termo exprl ;

exprl       : ('+' termo exprl)* | ('-' termo exprl)* ;

termo       : fator termol ;

termol      : ('*' fator termol)* | ('/' fator termol)* ;

fator       : NUM | ID { verifyID(_input.LT(-1).getText()); } | AP expr FP ;

TEXTO       : '"' ( '\\"' | . )*? '"' ;

NUM         : [0-9]+ ('.' [0-9]+)? ;

ID          : [a-zA-Z] ([a-z] | [A-Z] | [0-9])* ;

PF          : '.' ;

VIR         : ',' ;

PV          : ';' ;

ATTR        : ':=' ;

AP          : '(' ;

FP          : ')' ;

AC          : '{' ;

FC          : '}' ;

WS          : (' ' | '\t' | '\n' | '\r') -> skip ;