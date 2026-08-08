package rb.storytellertools.tools;

import java.util.Random;
import java.util.ArrayList;
class DiceRoller {
	Random r = new Random();
	ArrayList<Integer> resHistory = new ArrayList<Integer>();
	ArrayList<String> rolHistory = new ArrayList<String>();
	

	public DiceRoller(){}
	
	public void passArg(ArrayList<String> argList){
		int result = 0;

		if(argList.size() > 2) {
			System.out.println("TODO: implement flag passing");
			return;
		}

		if(argList.size() < 2) {
			System.out.println("invalid format. must be \"roll #d#\".");
			return;
		}

		if(argList.get(1).equals("-h")) {
			printHistory();
			return;
		}
		
		String[] dice = argList.get(1).toLowerCase().split("d");
		
		result = roll(dice);

		resHistory.add(result);
		rolHistory.add(argList.get(1));
		
	}

	private int roll(String[] dice){
		int sum = 0;

		for(int i = 0; i < Integer.parseInt(dice[0]); i++){
			sum += r.nextInt(Integer.parseInt(dice[1])) + 1;
		}

		System.out.println(sum);

		return sum;
	}

	private void printHistory(){
		int i = 0;
		for(String roll: rolHistory){
			System.out.println(roll + "---" + resHistory.get(i));
			i++;
		}
	}

}
