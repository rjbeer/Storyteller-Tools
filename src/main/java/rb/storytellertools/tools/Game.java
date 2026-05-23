package rb.storytellertools.tools;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

class Game{
	String cwd = System.getProperty("user.home") + File.separator + "Desktop";
	
	public Game(){
	
	}

	public Game(String homeDir){
		cwd = cwd + File.separator + homeDir;
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
