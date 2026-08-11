package rb.storytellertools.tools;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

class DiceRoller {
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_RESET = "\u001B[0m";

	private String helpMsg = "Takes in an argument of #d# where the first \'#\'\n" +
		" represents the total number of dice to roll and the second\n" +
		"# represents the number of sides of the dice to roll.\n\n" +
		"List of flags for the roll function.\n" + 
		"-p === Display previous rolls and their results.\n" +
		"-i === Roll each dice, record each result, display each result, \n\t" + 
		"do not add up their totals. Accepts argument #d# as normal.\n" +
		"-h === Display list of flags and uses for the roll function.";

	Random r = new Random();
	ArrayList<Integer> resHistory = new ArrayList<Integer>();
	ArrayList<String> rolHistory = new ArrayList<String>();
	

	public DiceRoller(){}
	
	public void passArg(ArrayList<String> argList){
		int result = 0;
		String[] dice;
		

		if(argList.size() > 3) {
			System.out.println(ANSI_RED + "Invalid Format." + ANSI_RESET);
			return;
		}

		if(argList.size() < 2) {
			System.out.println(ANSI_RED + "Invalid format for \'roll\'.\n" + ANSI_RESET + helpMsg);
			return;
		}	

		if(argList.get(1).equals("-h")){
			System.out.println(helpMsg);
			return;
		}
		
		if(argList.get(1).equals("-p")) {
			printHistory();
			return;
		}

		if(argList.get(1).equals("-i")) {
			try{
				dice = argList.get(2).split("d");
			} catch (Exception e) {
				System.out.println("Invalid format. Argument must be \'#d#\'. Was " + argList.get(2));
				return;
			}

			rollIndividual(dice);
			return;
		}
		
		try {
			dice = argList.get(1).split("d");
		} catch(Exception e) {
			System.out.println("Invalid Format. must be \'#d#\'. Was " + argList.get(1));
			return;
		}

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

	private void rollIndividual(String[] dice){
		for(int i = 0; i < Integer.parseInt(dice[0]); i++){
			int result = r.nextInt(Integer.parseInt(dice[1])) + 1;
			System.out.println(result);
			resHistory.add(result);
			rolHistory.add("1d" + String.valueOf(dice[1]));
		}
	}

	private void printHistory(){
		int i = 0;
		for(String roll: rolHistory){
			System.out.println(roll + " --- " + resHistory.get(i));
			i++;
		}
	}

}
