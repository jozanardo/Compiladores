// Generated from .\IsiLanguage.g4 by ANTLR 4.13.0

    import datastructures.IsiSymbol;
    import datastructures.IsiVariable;
    import datastructures.IsiSymbolTable;
    import exceptions.IsiSemanticException;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLanguageParser}.
 */
public interface IsiLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(IsiLanguageParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(IsiLanguageParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(IsiLanguageParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(IsiLanguageParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(IsiLanguageParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(IsiLanguageParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(IsiLanguageParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(IsiLanguageParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsiLanguageParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsiLanguageParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(IsiLanguageParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(IsiLanguageParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(IsiLanguageParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(IsiLanguageParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(IsiLanguageParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(IsiLanguageParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(IsiLanguageParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(IsiLanguageParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(IsiLanguageParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(IsiLanguageParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdDoWhile(IsiLanguageParser.CmdDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdDoWhile(IsiLanguageParser.CmdDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmdExpr(IsiLanguageParser.CmdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmdExpr(IsiLanguageParser.CmdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IsiLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IsiLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(IsiLanguageParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(IsiLanguageParser.ExprlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(IsiLanguageParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(IsiLanguageParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#termol}.
	 * @param ctx the parse tree
	 */
	void enterTermol(IsiLanguageParser.TermolContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#termol}.
	 * @param ctx the parse tree
	 */
	void exitTermol(IsiLanguageParser.TermolContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(IsiLanguageParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(IsiLanguageParser.FatorContext ctx);
}