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
			case "test dir":
				Game g = new Game();
				g.makeDir("abadaba");
				break;
			case "quit":
				break;
			default:
				System.out.print("\n" + prompt);
		}
	}
    }
}
