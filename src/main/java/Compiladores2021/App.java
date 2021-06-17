package Compiladores2021;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("src/TextoPruebaCTP2.txt");

        // create a lexer that feeds off of input CharStream
        idLexer lexer = new idLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        idParser parser = new idParser(tokens);
                
        // create Listener
        MiListener listener = new MiListener();

        // Conecto el objeto con Listeners al parser
        parser.addParseListener(listener);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        parser.iniciotexto();
    }
}
