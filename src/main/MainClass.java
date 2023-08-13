import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import exceptions.IsiSemanticException;

public class MainClass {
    public static void main(String[] args) {
        try {
            IsiLanguageLexer lexer;
            IsiLanguageParser parser;

            lexer = new IsiLanguageLexer(CharStreams.fromFileName("input.isi"));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            parser = new IsiLanguageParser(tokenStream);
            parser.programa();

            System.out.println("Compilation Successful");
        } catch (IsiSemanticException ex) {
            System.err.println("Sematic error - "+ex.getMessage());
        } catch (Exception ex) {
            System.err.println("ERROR "+ex.getMessage());
        }
    }
}
