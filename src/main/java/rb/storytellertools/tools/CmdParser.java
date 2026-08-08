package rb.storytellertools.tools;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

class CmdParser{
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
			case "trn":
				trnOrd.passArg(argList);
				break;
			default:
				System.out.println("\nNot a command\n");
		}
	}

	public void makeDir(String gameName){
		FileSetup fs = new FileSetup();
		cwd = fs.setupDir(gameName);
	}

	public void setCurWorkingDir(String dirName){
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
