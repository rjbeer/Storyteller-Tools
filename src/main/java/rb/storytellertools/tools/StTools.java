package rb.storytellertools.tools;

import java.util.Scanner;

public class StTools{
    
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Game game = new Game();
	String prompt = "stt: ";
	String userIn = "";
	
	while(!(userIn.equals("quit"))){
		System.out.print(prompt);
		userIn = sc.nextLine();

		switch(userIn){
			case "new":
				System.out.print("\n\n\nGame Name: ");
				userIn = sc.nextLine();
				game.makeDir(userIn);
				break;
			case "set":
				System.out.print("\n\n\nDirectory Name: ");
				userIn = sc.nextLine();
				game.setCurWorkingDir(userIn);
				String cwd = game.getCWD();
				System.out.println("CWD: " + cwd);
				break;
			case "cwd":
				System.out.print("\n\n\n" + game.getCWD() + "\n");
				break;
			case "quit":
				break;
			default:
				System.out.print("not a command.\n\n");
		}
	}
    }
}
