// Generated from /home/Tecnicas de compilacion/Compiladores2021/src/main/java/Compiladores2021/id.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link idParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface idVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link idParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(idParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(idParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(idParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declarado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarado(idParser.DeclaradoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(idParser.OperandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#asignado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignado(idParser.AsignadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#relacionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionales(idParser.RelacionalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#aritmeticos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmeticos(idParser.AritmeticosContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#unariosder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnariosder(idParser.UnariosderContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#unariosizq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnariosizq(idParser.UnariosizqContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#logicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicos(idParser.LogicosContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(idParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(idParser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(idParser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#definicionfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionfuncion(idParser.DefinicionfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#llamadafuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadafuncion(idParser.LlamadafuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionfuncion(idParser.DeclaracionfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(idParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#parametros1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros1(idParser.Parametros1Context ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#parametros2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros2(idParser.Parametros2Context ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(idParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operacionaritlogi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionaritlogi(idParser.OperacionaritlogiContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operadorbinario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorbinario(idParser.OperadorbinarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(idParser.SContext ctx);
}