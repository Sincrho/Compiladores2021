// Generated from /home/Tecnicas de compilacion/Compiladores2021/src/main/java/Compiladores2021/id.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link idParser}.
 */
public interface idListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link idParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(idParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(idParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(idParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(idParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(idParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(idParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declarado}.
	 * @param ctx the parse tree
	 */
	void enterDeclarado(idParser.DeclaradoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declarado}.
	 * @param ctx the parse tree
	 */
	void exitDeclarado(idParser.DeclaradoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(idParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(idParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#asignado}.
	 * @param ctx the parse tree
	 */
	void enterAsignado(idParser.AsignadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#asignado}.
	 * @param ctx the parse tree
	 */
	void exitAsignado(idParser.AsignadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#relacionales}.
	 * @param ctx the parse tree
	 */
	void enterRelacionales(idParser.RelacionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#relacionales}.
	 * @param ctx the parse tree
	 */
	void exitRelacionales(idParser.RelacionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#aritmeticos}.
	 * @param ctx the parse tree
	 */
	void enterAritmeticos(idParser.AritmeticosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#aritmeticos}.
	 * @param ctx the parse tree
	 */
	void exitAritmeticos(idParser.AritmeticosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#unariosder}.
	 * @param ctx the parse tree
	 */
	void enterUnariosder(idParser.UnariosderContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#unariosder}.
	 * @param ctx the parse tree
	 */
	void exitUnariosder(idParser.UnariosderContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#unariosizq}.
	 * @param ctx the parse tree
	 */
	void enterUnariosizq(idParser.UnariosizqContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#unariosizq}.
	 * @param ctx the parse tree
	 */
	void exitUnariosizq(idParser.UnariosizqContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#logicos}.
	 * @param ctx the parse tree
	 */
	void enterLogicos(idParser.LogicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#logicos}.
	 * @param ctx the parse tree
	 */
	void exitLogicos(idParser.LogicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(idParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(idParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(idParser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(idParser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(idParser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(idParser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#definicionfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionfuncion(idParser.DefinicionfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#definicionfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionfuncion(idParser.DefinicionfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadafuncion(idParser.LlamadafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadafuncion(idParser.LlamadafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionfuncion(idParser.DeclaracionfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionfuncion(idParser.DeclaracionfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(idParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(idParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#parametros1}.
	 * @param ctx the parse tree
	 */
	void enterParametros1(idParser.Parametros1Context ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#parametros1}.
	 * @param ctx the parse tree
	 */
	void exitParametros1(idParser.Parametros1Context ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#parametros2}.
	 * @param ctx the parse tree
	 */
	void enterParametros2(idParser.Parametros2Context ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#parametros2}.
	 * @param ctx the parse tree
	 */
	void exitParametros2(idParser.Parametros2Context ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(idParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(idParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operacionaritlogi}.
	 * @param ctx the parse tree
	 */
	void enterOperacionaritlogi(idParser.OperacionaritlogiContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operacionaritlogi}.
	 * @param ctx the parse tree
	 */
	void exitOperacionaritlogi(idParser.OperacionaritlogiContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operadorbinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorbinario(idParser.OperadorbinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operadorbinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorbinario(idParser.OperadorbinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(idParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(idParser.SContext ctx);
}