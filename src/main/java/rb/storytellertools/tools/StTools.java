package rb.storytellertools.tools;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Files;


public class StTools{
    
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String cwd = System.getProperty("user.home") + File.separator + "desktop";
	CmdParser parser = new CmdParser();
	TurnOrder to = new TurnOrder();
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
			System.out.println("No command given please enter a command\n");
			continue;
		}

		curCmd = arguments.get(0);

		if(arguments.get(0).toUpperCase().equals("QUIT")){
			continue;
		}

		parser.parseCmd(arguments);
		continue;

		//for(int i = 0; i < arguments.size(); i++){
		//	System.out.println(arguments.get(i));
		//}
		


/*
		switch(curCmd){
			case "new":
				System.out.print("\n\n\nGame Name: ");
				userIn = sc.nextLine();
				FileSetup fs = new FileSetup();
				cwd = fs.setupDir(userIn);
				break;
			case "set":
				System.out.print("\n\n\nDirectory Name: ");
				userIn = sc.nextLine();
				parser.setCurWorkingDir(userIn);
				break;
			case "cwd":
				System.out.print("\n\n\n" + parser.getCWD() + "\n");
				break;
			case "rnd":
				Random r = new Random();
				System.out.print("num: ");
				userIn = sc.nextLine();
				int rnum = r.nextInt(Integer.parseInt(userIn)) + 1;
				System.out.println("\n" + rnum);
				break;
			case "quit":
				break;
			default:
				System.out.print(curCmd + " not a command.\n\n");
		}
*/



	}
    }


}
