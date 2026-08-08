package rb.storytellertools.tools;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

class CmdParser{
	private Scanner sc = new Scanner(System.in);
	private String cwd = System.getProperty("user.home") + File.separator + "Desktop";
	private TurnOrder trnOrd = new TurnOrder();


	public CmdParser(){
	
	}

	public CmdParser(String homeDir){
		cwd = cwd + File.separator + homeDir;
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
			default:
				System.out.println("\nNot a command\n");
		}
	}

	public void setCurWorkingDir(){
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

	public String getCWD(){ return cwd; }

}
