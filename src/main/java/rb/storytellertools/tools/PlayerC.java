package rb.storytellertools.tools;

public class PlayerC {
	private int initiative = 0;
	private String playerName;

	public PlayerC(String name){
		playerName = name;
	}

	public PlayerC(String name, int roll){
		playerName = name;
		initiative = roll;
	}
	
	public int getInitiative(){return initiative;}

	public String getPlayerName(){return playerName;}

}
