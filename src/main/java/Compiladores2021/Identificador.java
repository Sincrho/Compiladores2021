package Compiladores2021;

enum TipoDato {
   DEFAULT,
   INT,
   DOUBLE,
   FLOAT,
   VOID
}


 public class Identificador {
   public Identificador(String token, TipoDato tipoDato, boolean usado, boolean inicializado){ 
      this.token = token;
      this.tipoDato = tipoDato;
      this.usado = usado;
      this.inicializado = inicializado;
   }

   public Identificador(){ 
      this.token = "";
      this.tipoDato = TipoDato.DEFAULT;
      this.usado= false;
      this.inicializado = false;
   }

   public String token;
   public TipoDato tipoDato;
   public boolean usado;
   public boolean inicializado;
}

