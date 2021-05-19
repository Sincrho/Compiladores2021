grammar id;

@header {
package Compiladores2021;
}

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

PUNTOCOMA: ';';
COMA: ',';


//Operadores binarios
SUMA: '+';
RESTA: '-';
DIVISION: '/';
MULTIPLICACION: '*';
MODULO:'%';


//Operadores unarios
INCREMENTAR: '++';
DECREMENTAR: '--';

//Operadores asignacion
IGUAL: '=';

//Operadores relacionales
IGUALDAD: '==';
DIFERENCIA: '!=';
MAYOR: '>';
MENOR: '<';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';

//Operadores logicos
AND: '&&';
OR: '||';
NOT: '!';

PARENIZQ : '(';
PARENDER : ')';

LLAVEIZQ : '{';
LLAVEDER : '}';

//Tipos de variable
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
VOID: 'void';

//Palabra reservada
IRETURN: 'return';

//Estructuras de control
IIF: 'if';
IFOR: 'for';
IWHILE: 'while';


NOMBRE: [a-z]+;   
ENTERO: DIGITO+;

WS : [ \n\t\r]+ -> skip; 
OTRO : . ;

id: NOMBRE;
entero: ENTERO;

tipo: INT
    | FLOAT
    | DOUBLE
    ;

instrucciones: instruccion instrucciones
             | declaracionfuncion instrucciones
             | definicionfuncion instrucciones
             |
             ;

instruccion:declaracion
        |asignacion
        |iwhile
        |ifor
        |iif
        |operacionaritlogi PUNTOCOMA
        |llamadafuncion PUNTOCOMA
        |bloque
        ;

declaracion: tipo declarado
           ;

declarado: id PUNTOCOMA 
         | asignado PUNTOCOMA
         | id COMA declarado
         | id COMA asignado
         | asignado COMA declarado
         ;

operando: entero
        | id
        | llamadafuncion
        ;


asignado: id IGUAL operando
        | id IGUAL operacionaritlogi
        ;

asignacion: asignado PUNTOCOMA
          ;    

relacionales: IGUALDAD
            | DIFERENCIA
            | MAYOR
            | MAYORIGUAL
            | MENOR
            | MAYORIGUAL
            ;

aritmeticos: SUMA
          | RESTA
          | MULTIPLICACION
          | DIVISION
          ;

unariosder: INCREMENTAR
          | DECREMENTAR
          ;
unariosizq: INCREMENTAR
          | DECREMENTAR
          | NOT
          | RESTA
          |
          ;

logicos: AND
       | OR
       ;

iwhile : IWHILE  PARENIZQ operacionaritlogi  PARENDER bloque;

ifor : IFOR  PARENIZQ declaracion operacionaritlogi PUNTOCOMA operacionaritlogi PARENDER bloque;

iif : IFOR  PARENIZQ asignacion PUNTOCOMA operacionaritlogi PUNTOCOMA operacionaritlogi PARENDER bloque
    | IFOR  PARENIZQ asignacion PUNTOCOMA operacionaritlogi PUNTOCOMA operacionaritlogi PARENDER instruccion
    ;

definicionfuncion : tipo id PARENIZQ parametros1 PARENDER LLAVEIZQ instrucciones retorno LLAVEDER
                  | VOID id PARENIZQ parametros1 PARENDER LLAVEIZQ instrucciones LLAVEDER
                  | tipo id PARENIZQ PARENDER LLAVEIZQ instrucciones retorno LLAVEDER
                  | VOID id PARENIZQ PARENDER LLAVEIZQ instrucciones LLAVEDER
                  ;

llamadafuncion : id PARENIZQ parametros2 PARENDER
               | id PARENIZQ PARENDER
               ;

declaracionfuncion : tipo id PARENIZQ parametros1 PARENDER PUNTOCOMA
                   | VOID id PARENIZQ parametros1 PARENDER PUNTOCOMA
                   | tipo id PARENIZQ PARENDER PUNTOCOMA
                   | VOID id PARENIZQ PARENDER PUNTOCOMA
                   ;



retorno : IRETURN operando PUNTOCOMA
        ;

parametros1 : tipo id COMA parametros1
            | tipo id
            ;

parametros2 : operando COMA parametros2
            | operando
            ;

bloque :LLAVEIZQ  instrucciones LLAVEDER;

operacionaritlogi : operando operadorbinario operacionaritlogi
                  | unariosizq operando
                  | unariosizq operando operadorbinario operacionaritlogi
                  | operando unariosder
                  | operando unariosder operadorbinario operacionaritlogi
                  ;

operadorbinario: relacionales
               | aritmeticos
               | logicos
               ;


s : {System.out.println("\nEmpiezo lectura \n"); } instrucciones {System.out.println("Fin lectura \n"); }
  |
  ;
