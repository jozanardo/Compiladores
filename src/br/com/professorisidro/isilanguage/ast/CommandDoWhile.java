package br.com.professorisidro.isilanguage.ast;

import java.util.ArrayList;

public class CommandDoWhile extends AbstractCommand{
	private String condition;
	private ArrayList<AbstractCommand> lista;
	
	public CommandDoWhile(String condition, ArrayList<AbstractCommand> lista) {
		this.condition = condition;
		this.lista = lista;
	}
	
	@Override
	public String generateJavaCode() {
		
		StringBuilder str = new StringBuilder();
		str.append("\n do {\n");
		for (AbstractCommand cmd: lista) {
			str.append(cmd.generateJavaCode()+"\n");
		}
		str.append("} while(" +condition+"); \n" ) ;
		return str.toString();
	}
	
	@Override
	public String toString() {
		return "CommandDoWhile [condition=" + condition + ", lista=" + lista + "]";
	}

}
