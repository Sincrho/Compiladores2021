grammar id;

@header {
package Compiladores2021;
}

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

INT : 'int';
WHILE : 'while';

ENTRE : ('1'[2-9])|('2'[0-3]);
CON5 : DIGITO '5';
CON2Y3 : DIGITO ('2'|'3');
//CON2Y3 : DIGITO [23];

ENTERO: DIGITO+;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
WS : [ \n\t\r]+ -> skip; 

OTRO : . ;

s : INT{ System.out.println("Int"); }s
  | WHILE{ System.out.println("While"); }s
  | ID{ System.out.println("ID ->" + $ID.getText()); }s
  | WS{ System.out.println("WS ->" + $WS.getText()); }s
  | ENTRE{ System.out.println("ENTRE ->" + $ENTRE.getText()); }s
  | CON5{ System.out.println("CON5 ->" + $CON5.getText()); }s
  | CON2Y3{ System.out.println("CON2Y3 ->" + $CON2Y3.getText()); }s
  | ENTERO{ System.out.println("ENTERO ->" + $ENTERO.getText()); }s
  | OTRO{ System.out.println("OTRO->" + $OTRO.getText()); }s
  ;