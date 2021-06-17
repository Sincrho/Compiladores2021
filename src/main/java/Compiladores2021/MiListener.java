package Compiladores2021;

import org.antlr.v4.runtime.tree.ErrorNode;
import Compiladores2021.idParser.*;
//import java.util.*;

public class MiListener extends idBaseListener{
    public class EstadoContexto{
        public String tipoVarDeclarar = "";
        //public String tipoVariableParametros = "";
        public String nombreFuncion = "";
        public String tipoFuncionDeclarar = "";
        public boolean enAmbitoDeclaracion = false;
        public boolean enAmbitoDeclaracionFuncion = false;
        public boolean enAmbitoFor = false;
        public boolean enAmbitoAsignacion = false;
        public boolean enAmbitoOperacionAritLogi = false;
        public boolean enAmbitoFuncion = false;
        public boolean error = false;
    }
    EstadoContexto estados = new EstadoContexto();

    @Override
    public void enterId(IdContext ctx) {
        String idToken = ctx.getStart().getText();
        System.out.println(idToken);
        System.out.println(TablaSimbolos.getInstance().getInfo());
 

        if(estados.enAmbitoDeclaracion){
            if(TablaSimbolos.getInstance().buscarId(idToken)){
                System.out.println("Identificador '" + idToken + " ' ya fue declarado");
            }else{
                TablaSimbolos.getInstance().addId(idToken, estados.tipoVarDeclarar);
                System.out.println("AGREGADADO ?" +TablaSimbolos.getInstance().buscarId(idToken));
                TablaSimbolos.getInstance().setInfo("Esto se refleja abajo");
            }  
        }
        if(estados.enAmbitoOperacionAritLogi){
            System.out.println(TablaSimbolos.getInstance().buscarId(idToken));
            if(TablaSimbolos.getInstance().buscarId(idToken)){
                Identificador reference = TablaSimbolos.getInstance().obtenerIdPorToken(idToken);
                if(reference.inicializado == false){
                    System.out.println("Identificador '" + idToken + "' no esta inicializado");
                }
            }else{
                System.out.println("Identificador '" + idToken + "' no esta declarado");
            }
        }
        System.out.println("-----------------");
    }
    
    @Override
    public void exitId(IdContext ctx) {
        // TODO Auto-generated method stub
        super.exitId(ctx);
    }
    //Estas son las operaciones que afectan los estados internos    
    @Override
    public void enterAsignacion(AsignacionContext ctx) {
        // TODO Auto-generated method stub
        estados.enAmbitoAsignacion = true;
        String tokenAsignacion = ctx.getStart().getText();

        Boolean declarado = TablaSimbolos.getInstance().buscarId(tokenAsignacion);
        if(declarado){
            Identificador reference = TablaSimbolos.getInstance().obtenerIdPorToken(tokenAsignacion);
            reference.inicializado = true;
        }else{
            System.out.println("Identificador " + tokenAsignacion + "no esta declarado");
        }
    }
    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        // TODO Auto-generated method stub
        estados.enAmbitoAsignacion = false;
    }
    @Override
    public void enterDeclaracion(DeclaracionContext ctx) {
        // TODO Auto-generated method stub
        estados.enAmbitoDeclaracion = true;
        estados.tipoVarDeclarar = ctx.getStart().getText().toUpperCase();
    }
    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        // TODO Auto-generated method stub
        estados.enAmbitoDeclaracion = false;
        estados.tipoVarDeclarar = "";
    }
    @Override
    public void enterDeclaracionfuncion(DeclaracionfuncionContext ctx) {
        // TODO Auto-generated method stub
        estados.enAmbitoDeclaracionFuncion = true;
        estados.tipoFuncionDeclarar = ctx.getStart().getText().toUpperCase();
    }
    @Override
    public void exitDeclaracionfuncion(DeclaracionfuncionContext ctx) {
        // TODO Auto-generated method stub
        estados.enAmbitoDeclaracionFuncion = false;
        estados.tipoFuncionDeclarar = "";
    }
    @Override
    public void enterOperacionaritlogi(OperacionaritlogiContext ctx) {
        // TODO Auto-generated method stub
        estados.enAmbitoOperacionAritLogi = true;
    }
    @Override
    public void exitOperacionaritlogi(OperacionaritlogiContext ctx) {
        // TODO Auto-generated method stub
        estados.enAmbitoOperacionAritLogi = false;
    }
    @Override
    public void enterIwhile(IwhileContext ctx) {
        // TODO Auto-generated method stub
        super.enterIwhile(ctx);
    }
    @Override
    public void exitIwhile(IwhileContext ctx) {
        // TODO Auto-generated method stub
        super.exitIwhile(ctx);
    }
    @Override
    public void enterIfor(IforContext ctx) {
        // TODO Auto-generated method stub
        super.enterIfor(ctx);
    }
    @Override
    public void exitIfor(IforContext ctx) {
        // TODO Auto-generated method stub
        super.exitIfor(ctx);
    }  
    @Override
    public void enterIif(IifContext ctx) {
        // TODO Auto-generated method stub
        super.enterIif(ctx);
    }

    @Override
    public void exitIif(IifContext ctx) {
        // TODO Auto-generated method stub
        super.exitIif(ctx);
    }

    //Estas son las operaciones que generan nuevos contextos
    @Override
    public void enterDefinicionfuncion(DefinicionfuncionContext ctx) {
        // TODO Auto-generated method stub
        TablaSimbolos.getInstance().nuevoContexto();
    }
    @Override
    public void exitDefinicionfuncion(DefinicionfuncionContext ctx) {
        // TODO Auto-generated method stub
        TablaSimbolos.getInstance().borrarUltimoContexto();
    }
    @Override
    public void enterBloque(BloqueContext ctx) {
        // TODO Auto-generated method stub
        TablaSimbolos.getInstance().nuevoContexto();
    }
    @Override
    public void exitBloque(BloqueContext ctx) {
        // TODO Auto-generated method stub
        TablaSimbolos.getInstance().borrarUltimoContexto();
    }
    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub
        System.out.println("Se encuentra error sintactico");
    }
    @Override
    public void enterIniciotexto(IniciotextoContext ctx) {
        // TODO Auto-generated method stub
        TablaSimbolos.getInstance().nuevoContexto();
    }
    @Override
    public void exitIniciotexto(IniciotextoContext ctx) {
        // TODO Auto-generated method stub
        //TablaSimbolos.getInstance().borrarUltimoContexto();
    }
    
   
}
