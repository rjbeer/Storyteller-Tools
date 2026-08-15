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
	CmdParser parser = new CmdParser();
	String prompt = "stt: ";
	String userIn = "";
	String curCmd = "";
	Tokenizer t = new Tokenizer();
	ArrayList<String> arguments = new ArrayList<>();

	while(!(curCmd.equals("quit"))){
		System.out.print(prompt);
		userIn = sc.nextLine();
		arguments = t.parseArgs(userIn.trim());
		
		if(userIn.toUpperCase().equals("QUIT")){
			curCmd = userIn;
			continue;
		}

		if(arguments.isEmpty()){
			System.out.println("No command given please enter a command\n");
			continue;
		}

		if(arguments.get(0).toLowerCase().equals("help")){
			printHelp();
			continue;
		}

		curCmd = arguments.get(0);

		parser.parseCmd(arguments);
		//for(int i = 0; i < arguments.size(); i++){
		//	System.out.println(arguments.get(i));
		//}
	}
    }

    private static void printHelp(){
	String[] commands = {"new", "set", "cwd", "trn", "rst", "roll", "rnd"};
	String[] descriptions = {"creates a new directory structure for a new game",
		"Sets the current working directory", "prints the current working directory",
		"creates a turn order instance and allows the ordered placement of characters via initiative priority",
		"reset the turn order and clear all characters from the instance",
		"takes an argument in the format of \'#d#\' and generates numbers within the presented range " + 
		"and sums, if needed, any multiple numbers needed to generate a dice roll", 
		"generates a random number"};
	int len = 10;
	int descLen = 50;

	for(int i = 0; i < commands.length; i++){
		printCmds(commands[i], descriptions[i], len, descLen);
	}

    }

    private static void printCmds(String cmd, String desc, int cmdLen, int descLen){
	String formattedLine = "%-" + cmdLen + "s ";
	int descriptionIndex = 0;

	System.out.printf(formattedLine, cmd);
	
	while(descriptionIndex < desc.length()){
		int endLineIndex = Math.min(descriptionIndex + descLen, desc.length());

		if(descriptionIndex > 0) {
			System.out.printf(formattedLine, "");
		}

		System.out.println(desc.substring(descriptionIndex, endLineIndex));
		descriptionIndex = endLineIndex;
	}
    }


}
