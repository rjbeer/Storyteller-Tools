package rb.storytellertools.tools;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

class Game{
	
	
	public Game(){
	
	}
	
	public void makeDir(String gameName){
		FileSetup fs = new FileSetup();
		fs.setupDir(gameName);	
	}

}
