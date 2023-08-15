grammar IsiLang;

@header{
	import br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
	import br.com.professorisidro.isilanguage.datastructures.IsiVariable;
	import br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;
	import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
	import br.com.professorisidro.isilanguage.ast.IsiProgram;
	import br.com.professorisidro.isilanguage.ast.AbstractCommand;
	import br.com.professorisidro.isilanguage.ast.CommandLeitura;
	import br.com.professorisidro.isilanguage.ast.CommandEscrita;
	import br.com.professorisidro.isilanguage.ast.CommandAtribuicao;
	import br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import java.util.ArrayList;
	import java.util.Stack;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private IsiSymbolTable symbolTable = new IsiSymbolTable();
	private IsiSymbol symbol;
	private IsiProgram program = new IsiProgram();
	private ArrayList<AbstractCommand> curThread;
	private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
	private String _readID;
	private String _writeID;
	private String _exprID;
	private String _exprContent;
	private String _exprDecision;
	private ArrayList<AbstractCommand> listaTrue;
	private ArrayList<AbstractCommand> listaFalse;
	
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
            throw new IsiSemanticException("Symbol "+ id + " already declared");
        }
    }
	
	public void showComands(){
		for (AbstractCommand c: program.getComandos()){
			System.out.println(c);
		}
	}
	
	public void generateCode(){
		program.generateTarget();
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