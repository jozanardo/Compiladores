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
	import br.com.professorisidro.isilanguage.ast.CommandWhile;
	import br.com.professorisidro.isilanguage.ast.CommandDoWhile;
	import java.util.ArrayList;
	import java.util.Stack;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private IsiSymbolTable symbolTable = new IsiSymbolTable();
	private IsiSymbolTable symbolTableWar = new IsiSymbolTable();
	private IsiSymbolTable symbolUsedButNotInitialized = new IsiSymbolTable();
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
	
	public void exibeInitialized() {
		for (IsiSymbol is: symbolUsedButNotInitialized.getMap()) {
			System.out.println("ISILINDOWARNING: Simbolo usado " + is.getName() + " mas nao iniciado");
	}
	}
	
	public void verificaID(String id){
		if (!symbolTable.exists(id)){
			throw new IsiSemanticException("Symbol "+id+" not declared");
		}
		else{
			symbolTableWar.drop(id);
		}
	}
	
	public void dropInitialized(String id){
		if (!symbolTable.exists(id)){
			throw new IsiSemanticException("Symbol "+id+" not declared");
		}else{
			symbolUsedButNotInitialized.drop(id);
		}
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}

	public void exibeComandos(){
		for (AbstractCommand c: program.getComandos()){
			System.out.println(c);
		}
	}
	
	public void generateCode(){
		program.generateTarget();
	}
	
	
	public void exibeWarnings() {
		for (IsiSymbol is: symbolTableWar.getMap()) {
			dropInitialized(is.getName());
			System.out.println("ISILINDOWARNING: Simbolo " + is.getName() + " declarado mas nao utilizado");
		}
	
	
	}
}

prog	: 'programa' decl bloco  'fimprog.'
           {  program.setVarTable(symbolTable);
           	  program.setComandos(stack.pop());
           	 
           } 
		;
		
decl    :  (declaravar)+
        ;
        
        
declaravar :  tipo ID  {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);
	                     symbolTableWar.add(symbol);
			     		 symbolUsedButNotInitialized.add(symbol);	
	                  }
	                  else{
	                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
	                  }
                    } 
              (  VIR 
              	 ID {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);
	                     symbolTableWar.add(symbol);
		             	 symbolUsedButNotInitialized.add(symbol);	
	                  }
	                  else{
	                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
	                  }
                    }
              )* 
               SC
           ;
           
tipo       : 'numero' { _tipo = IsiVariable.NUMBER;  }
           | 'texto'  { _tipo = IsiVariable.TEXT;  }
           ;
        
bloco	: { curThread = new ArrayList<AbstractCommand>(); 
	        stack.push(curThread);  
          }
          (cmd)+
		;
		

cmd		:  cmdleitura  
 		|  cmdescrita 
 		|  cmdattrib
 		|  cmdselecao
 		|  cmdWhile
		|  cmdDoWhile 
		;

cmdDoWhile : 'faca' ACH
				
			  { curThread = new ArrayList<AbstractCommand>(); 
	                      stack.push(curThread);
	                }
	                (cmd)+
				 FCH ( 'enquanto' AP
				 		ID    { _exprDecision = _input.LT(-1).getText(); }
                 				OPREL { _exprDecision += _input.LT(-1).getText(); }
                 				(ID | NUMBER) {_exprDecision += _input.LT(-1).getText(); }
				 FP
					
					{
				 	stack.pop();
				 	CommandDoWhile cmd = new CommandDoWhile(_exprDecision, curThread);
				 	stack.peek().add(cmd);
				 }
			)?
               ;
		
		
		

cmdWhile : 'enquanto' AP
				 ID    { _exprDecision = _input.LT(-1).getText(); }
                 OPREL { _exprDecision += _input.LT(-1).getText(); }
                 (ID | NUMBER) {_exprDecision += _input.LT(-1).getText(); }
				 FP
				 ACH
					 { curThread = new ArrayList<AbstractCommand>(); 
	                      stack.push(curThread);
	                }
	                (cmd)+
				 FCH{
				 	stack.pop();
				 	CommandWhile cmd = new CommandWhile(_exprDecision, curThread);
				 	stack.peek().add(cmd);
				 }
		 ;
		
cmdleitura	: 'leia' AP
                     ID { verificaID(_input.LT(-1).getText());
                     	  _readID = _input.LT(-1).getText();
                     	  dropInitialized(_input.LT(-1).getText());
                        } 
                     FP 
                     SC 
                     
              {
              	IsiVariable var = (IsiVariable)symbolTable.get(_readID);
              	CommandLeitura cmd = new CommandLeitura(_readID, var);
              	stack.peek().add(cmd);
              }   
			;
			
cmdescrita	: 'escreva' 
                 AP 
                 ID { verificaID(_input.LT(-1).getText());
	                  _writeID = _input.LT(-1).getText();
                     } 
                 FP 
                 SC
               {
               	  CommandEscrita cmd = new CommandEscrita(_writeID);
               	  stack.peek().add(cmd);
               }
			;
			
cmdattrib	:  ID { verificaID(_input.LT(-1).getText());
					dropInitialized(_input.LT(-1).getText());		
                    _exprID = _input.LT(-1).getText();
		    	
                   } 
               ATTR { _exprContent = ""; } 
               expr 
               SC
               {
               	 
                 IsiVariable var = (IsiVariable)symbolTable.get(_exprID);
			        if (var.getType() == 0 & _exprContent.indexOf("\'") >=0) {
			        	throw new IsiSemanticException("Symbol "+_exprID+" is declared as number");
			        }
			        else if(var.getType() == 1 & _exprContent.indexOf("\"") < 0) {
			        	throw new IsiSemanticException("Symbol "+_exprID+" is declared as string");
			        }
               	 CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
               	 stack.peek().add(cmd);
               }
			;
			
			
cmdselecao  :  'se' AP
                    ID    { _exprDecision = _input.LT(-1).getText(); }
                    OPREL { _exprDecision += _input.LT(-1).getText(); }
                    (ID | NUMBER) {_exprDecision += _input.LT(-1).getText(); }
                    FP 
                    ACH 
                    { curThread = new ArrayList<AbstractCommand>(); 
                      stack.push(curThread);
                    }
                    (cmd)+ 
                    
                    FCH 
                    {
                       listaTrue = stack.pop();	
                    } 
                   ('senao' 
                   	 ACH
                   	 {
                   	 	curThread = new ArrayList<AbstractCommand>();
                   	 	stack.push(curThread);
                   	 } 
                   	(cmd+) 
                   	FCH
                   	{
                   		listaFalse = stack.pop();
                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
                   		stack.peek().add(cmd);
                   	}
                   )?
            ;
			
expr		:  termo ( 
	             OP  { _exprContent += _input.LT(-1).getText();}
	            termo
	            )*
			;
			
termo		: ID { verificaID(_input.LT(-1).getText());
	               _exprContent += _input.LT(-1).getText();
                 } 
            | 
              (NUMBER | TEXTO)
              {
              	_exprContent += _input.LT(-1).getText();
              }
              
              
			;
			
	
AP	: '('
	;
	
FP	: ')'
	;
	
SC	: '.'
	;
	
OP	: '+' | '-' | '*' | '/'
	;
	
ATTR : ':='
	 ;
	 
VIR  : ','
     ;
     
ACH  : '{'
     ;
     
FCH  : '}'
     ;
	 
	 
OPREL : '>' | '<' | '>=' | '<=' | '==' | '!='
      ;
      
ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;
	
NUMBER	: [0-9]+ ('.' [0-9]+)?
		;
		
TEXTO	: ['"']([a-z] | [A-Z] | [0-9])*['"']
 	 	;		

WS	: (' ' | '\t' | '\n' | '\r') -> skip;

INTEGER : [0-9]+
		;