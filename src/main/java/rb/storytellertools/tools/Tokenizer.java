package rb.storytellertools.tools;

import java.util.ArrayList;

public class Tokenizer {
	

	public ArrayList<String> parseArgs(String cmd){
		ArrayList<String> parsedArgs = new ArrayList<>();
		StringBuilder argument = new StringBuilder();
		char[] pieces = cmd.toCharArray();
		boolean doubleQuote = false;

		for(int i = 0; i < pieces.length; i++){
			if(pieces[i] == '\"'){
				doubleQuote = !doubleQuote;
				continue;
			}
			if(pieces[i] == ' ' && !doubleQuote){
				parsedArgs.add(argument.toString());
				argument = new StringBuilder();
			} else {
				argument.append(pieces[i]);
			}
		}
		
		if(argument.length() > 0){
			parsedArgs.add(argument.toString());
		}

		return parsedArgs;
	}
}
