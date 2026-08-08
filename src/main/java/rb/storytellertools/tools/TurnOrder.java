package rb.storytellertools.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TurnOrder {
	private Scanner sc = new Scanner(System.in);
	private String name = new String();
	private int initiative = -1;
	private ArrayList<PlayerC> pChar = new ArrayList<>();


	public TurnOrder() {

	}

	public void passArg(ArrayList<String> argList){
		if (argList.size() > 1) {
			System.out.println("TODO: allow for multiple flags in TurnOrder");
			return;
		} else {
			System.out.print("\nInitiative (Y/N)?\n");
			String in = sc.nextLine();
			System.out.print("Character name: ");
			name = sc.nextLine();
			if(in.toUpperCase().equals("Y")){
				System.out.print("\nInitiative: ");
				initiative = Integer.parseInt(sc.nextLine());
				addName(name, initiative);
			} else {
				addName(name);
			}
		}

		displayOrder();
	}
	
	public void addName(String name){
		pChar.add(new PlayerC(name));
	}

	private void addName(String name, int num){
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
