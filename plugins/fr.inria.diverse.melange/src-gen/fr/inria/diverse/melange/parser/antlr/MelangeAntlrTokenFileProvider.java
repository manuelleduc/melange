/*
* generated by Xtext
*/
package fr.inria.diverse.melange.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MelangeAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/inria/diverse/melange/parser/antlr/internal/InternalMelange.tokens");
	}
}
