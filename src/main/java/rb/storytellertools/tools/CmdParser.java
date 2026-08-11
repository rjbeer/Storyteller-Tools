package rb.storytellertools.tools;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class CmdParser{
	private Scanner sc = new Scanner(System.in);
	private String cwd = System.getProperty("user.home") + File.separator + "Desktop";
	private TurnOrder trnOrd = new TurnOrder();
	private DiceRoller dr = new DiceRoller();


	public CmdParser(){
	
	}
	
	public void parseCmd(ArrayList<String> argList){
		String command = argList.get(0);

		switch(command){
			case "new":
				FileSetup fs = new FileSetup();
				cwd = fs.passArg(argList);
				break;
			case "set":
				setCurWorkingDir();
				break;
			case "cwd":
				System.out.println(cwd);
				break;
			case "trn":
				trnOrd.passArg(argList);
				break;
			case "rst":
				trnOrd.passArg(argList);
				break;
			case "roll":
				dr.passArg(argList);
				break;
			case "rnd":
				Random r = new Random();
				System.out.print("\nNum: ");
				String in = sc.nextLine();
				int rNum = r.nextInt(Integer.parseInt(in)) + 1;
				System.out.println("\n" + rNum);
				break;
			default:
				System.out.println("\nNot a command\n");
		}
	}

	private void setCurWorkingDir(){
		System.out.print("\nDirectory name: ");
		String dirName = sc.nextLine();
		System.out.println("");

		if(cwd.substring(cwd.length() - dirName.length(), cwd.length()).equals(dirName)){
			return;
		}
		Path path = Paths.get(System.getProperty("user.home")+ File.separator + "Desktop" 
				      + File.separator + dirName);

		if(Files.exists(path) && Files.isDirectory(path)){
			cwd = path.toString();
		} else {
			System.out.println("\n\n\nDirectory does not exist please try another.");
		}
	}

	private String getCWD(){ return cwd; }

}
