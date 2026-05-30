package rb.storytellertools.tools;

import java.util.Scanner;
import java.util.ArrayList;

public class StTools{
    
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Game game = new Game();
	String prompt = "stt: ";
	String userIn = "";
	String curCmd = "";
	Tokenizer t = new Tokenizer();
	ArrayList<String> arguments = new ArrayList<>();

	while(!(curCmd.equals("quit"))){
		System.out.print(prompt);
		userIn = sc.nextLine();
		arguments = t.parseArgs(userIn.trim());
		
		if(arguments.isEmpty()){
			continue;
		}

		curCmd = arguments.get(0);

		//for(int i = 0; i < arguments.size(); i++){
		//	System.out.println(arguments.get(i));
		//}

		switch(curCmd){
			case "new":
				System.out.print("\n\n\nGame Name: ");
				userIn = sc.nextLine();
				game.makeDir(userIn);
				break;
			case "set":
				System.out.print("\n\n\nDirectory Name: ");
				userIn = sc.nextLine();
				game.setCurWorkingDir(userIn);
				break;
			case "cwd":
				System.out.print("\n\n\n" + game.getCWD() + "\n");
				break;
			case "quit":
				break;
			default:
				System.out.print(curCmd + " not a command.\n\n");
		}
	}
    }
}
