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

		curCmd = arguments.get(0);

		parser.parseCmd(arguments);
		//for(int i = 0; i < arguments.size(); i++){
		//	System.out.println(arguments.get(i));
		//}
	}
    }


}
