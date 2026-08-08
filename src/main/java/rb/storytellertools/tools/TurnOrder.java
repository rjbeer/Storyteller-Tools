package rb.storytellertools.tools;

import java.util.ArrayList;
import java.util.HashMap;

public class TurnOrder {
	private ArrayList<PlayerC> pChar = new ArrayList<>();


	public TurnOrder() {

	}
	
	public void addName(String name){
		pChar.add(new PlayerC(name));
	}

	public void addName(String name, int num){
		if(pChar.isEmpty()){
			pChar.add(new PlayerC(name, num));
			return;
		}

		for(int i = 0; i < pChar.size(); i++){
			if( pChar.get(i).getInitiative() <= num ){
				pChar.add(i, new PlayerC(name, num));
				break;
			} else if( i == pChar.size() - 1 ){
				pChar.add(new PlayerC(name, num));
				break;
			}
		}
	}

	public ArrayList<PlayerC> getList(){ return pChar; }

	public void displayOrder(){
		for(PlayerC p : pChar){
			System.out.println(p.getPlayerName() + " ============ " + p.getInitiative());
		}
	}

	public void resetEntries(){
		pChar.clear();
	}
	

}
