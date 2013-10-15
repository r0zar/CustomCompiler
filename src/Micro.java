//Hello, I'm a java class

//Import
import org.antlr.v4.runtime.*;
import java.io.*;
import java.util.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})

public class Micro{

	public static void main(String[] args) throws Exception{


		if(args.length != 1) {
			throw new Exception("Needs one argument");
		}

		ANTLRFileStream input = new ANTLRFileStream(args[0]);
		MicroGrammarLexer L1 = new MicroGrammarLexer(input);
		CommonTokenStream T1 = new CommonTokenStream(L1);
		MicroGrammarParser P1 = new MicroGrammarParser(T1);

		try {
			P1.program();

			if (P1.getNumberOfSyntaxErrors() > 0) {
				System.out.println("Not Accepted");
			}
			else {
				System.out.println("Accepted");
			}
		}

		catch (Exception e) {
			System.out.println("An Unexpected Error Occurred");
		}
	}
}