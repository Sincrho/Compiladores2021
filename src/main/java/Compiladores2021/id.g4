grammar id;

@header {
package Compiladores2021;
}

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
ENTERO : DIGITO+;
OTRO : . ;

s : ID{ System.out.println("ID ->" + $ID.getText()); }s
  | ENTERO{ System.out.println("Entero->" + $ENTERO.getText()); }s
  | OTRO{ System.out.println("Otro->" + $OTRO.getText()); }s
  |
  ;