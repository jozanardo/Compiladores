// Generated from IsiLang.g4 by ANTLR 4.7.1

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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLangParser}.
 */
public interface IsiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(IsiLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(IsiLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(IsiLangParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(IsiLangParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(IsiLangParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(IsiLangParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(IsiLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(IsiLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(IsiLangParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(IsiLangParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(IsiLangParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(IsiLangParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(IsiLangParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(IsiLangParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(IsiLangParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(IsiLangParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdDoWhile(IsiLangParser.CmdDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdDoWhile(IsiLangParser.CmdDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void enterCmdFor(IsiLangParser.CmdForContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void exitCmdFor(IsiLangParser.CmdForContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(IsiLangParser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(IsiLangParser.ForExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(IsiLangParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(IsiLangParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmdExpr(IsiLangParser.CmdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmdExpr(IsiLangParser.CmdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(IsiLangParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(IsiLangParser.ExprlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(IsiLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(IsiLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#termol}.
	 * @param ctx the parse tree
	 */
	void enterTermol(IsiLangParser.TermolContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#termol}.
	 * @param ctx the parse tree
	 */
	void exitTermol(IsiLangParser.TermolContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(IsiLangParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(IsiLangParser.FatorContext ctx);
}