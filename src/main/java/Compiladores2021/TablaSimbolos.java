package Compiladores2021;

import java.util.*;

public class TablaSimbolos {
  private static TablaSimbolos instance = null;
  private List<HashMap<String,Identificador>> contextos = null;
  private int nroContextos;
  private int nroToken;
  // private String info = "Sanity check #1";

    
  // public String getInfo() {
  //   return info;
  // }

  // public void setInfo(String info) {
  //   this.info = info;
  // }

  public HashMap<String, Identificador> getContexto(int i) {
    return contextos.get(i);
  }

  public void nuevoContexto (){
    contextos.add(new HashMap<String,Identificador>());
    nroContextos = contextos.size();
    nroToken = 0;
  };

  public void borrarUltimoContexto (){
    contextos.remove(contextos.size()-1);
    nroContextos = contextos.size();
    nroToken = contextos.get(contextos.size()-1).size();
  };
  
  public boolean buscarId ( String token ){    
    for(int i = 0; i < contextos.size() ; i++ ){
      HashMap<String, Identificador> contextoTemporal = contextos.get(i);
      for(Map.Entry<String, Identificador> entry : contextoTemporal.entrySet()) {
        if (entry.getValue().token.equals(token)){
          return true;
        }
      }    
    }
    return false;
  }

  public boolean buscarIdLocal ( String token ) {
    HashMap<String,Identificador> contextoLocal = contextos.get(contextos.size() - 1);
    for(Map.Entry<String, Identificador> entry : contextoLocal.entrySet()) {
      if (entry.getValue().token.equals(token)){
        return true;
      }
    }    
    return false;
  };

  public Identificador obtenerIdPorToken (String token) {
    Identificador temp = null;
    for(int i = 0; i < contextos.size() ; i++ ){
      HashMap<String, Identificador> contextoTemporal = contextos.get(i);
      for(Map.Entry<String, Identificador> entry : contextoTemporal.entrySet()) {
        if (entry.getValue().token.equals(token)){
          return temp = entry.getValue();
        }
      }    
    }
    return temp;
  }

  public void addId (String token, String tipo) {
    if (buscarId(token)){
      System.out.println("Id ya presente en este contexto");
    } 
    else {
      String tokenKey = "CTX" + Integer.toString(nroContextos) + "T" + Integer.toString(nroToken);
      HashMap<String,Identificador> contextoLocal = contextos.get(contextos.size() - 1);
      Identificador tempId = new Identificador(token, TipoDato.valueOf(tipo), false, false);
      contextoLocal.put(tokenKey, tempId);
      nroToken+=1;
    }  
  }

  private TablaSimbolos(){
    contextos = new ArrayList<HashMap<String,Identificador>>();
    nroContextos = 1;
    nroToken = 0;
  }

  public static TablaSimbolos getInstance(){
    if (instance == null){
      instance = new TablaSimbolos(); 
    }
    return instance;
  }
}