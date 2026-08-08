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
			case "trn":
				boolean ordered = false;
				System.out.print("\nInitiative (Y/N)?: ");
				userIn = sc.nextLine();
				if(userIn.toUpperCase().equals("Y")){
					ordered = true;
				}
				if(arguments.size() == 1 && (!ordered)){
					System.out.print("Name of character/Player: ");
					userIn = sc.nextLine();
					parser.addToTurnOrder(userIn, 0);
				} else {
					System.out.print("\nName of character/Player: ");
					userIn = sc.nextLine();
					System.out.print("\nInitaitive: ");
					int userInitiative = Integer.parseInt(sc.nextLine());
					parser.addToTurnOrder(userIn, userInitiative);
				}
				break;
			case "rst":
				parser.resetOrder();
				break;
			case "order":
				parser.showOrder();
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
	}
    }


}
