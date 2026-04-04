package rb.storytellertools.tools;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

class FileSetup{
	String desktopDir;
	String[] defaultDirs = {"Notes", "Maps", "Characters"};

	public FileSetup(){
		desktopDir = System.getProperty("user.home");
		desktopDir = desktopDir + File.separator + "Desktop";
	}

	public void setupDir(String gameName){
		Path gamePath = Paths.get(desktopDir, gameName);
		try{
			Files.createDirectories(gamePath);
			for(int i = 0; i < defaultDirs.length; i++){
				Path temp = Paths.get(gamePath.toString(), defaultDirs[i]);
				Files.createDirectories(temp);
			}
			//desktopDir = gamePath.toString();
			System.out.println("\n\n\nGame Directory for " 
					+ gameName + " successfully created");
		}catch(IOException e){
			System.err.println("Could not create " + gameName +
					" " + e.getMessage());
		}
		
	}

	public void setupDir(String gameName, String[] customDir){
		Path gamePath = Paths.get(desktopDir, gameName);
		try{
			Files.createDirectories(gamePath);
			for(int i = 0; i < customDir.length; i++){
				Path temp = Paths.get(gamePath.toString(), customDir[i]);
				Files.createDirectories(temp);
			}
			System.out.println("\n\n\nGame Directory for "
					+ gameName + " successfully created!");
		}catch(IOException e){
			System.err.println("Could not create " + gameName +
					" " + e.getMessage());
		}
	}

	

}
