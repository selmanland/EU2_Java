package day23_stringManipulation;

import java.util.Random;

public class task85_diceGameWithPc {

	public static void main(String[] args) {

		Random sc = new Random();
		int diceComp;
		int diceUser;
		int countCompWins = 0;
		int countUserWins = 0;

		for (int i = 1; i <= 10; i++) { 		//loop for getting 10 random numbers
			diceComp = sc.nextInt(5) + 1;
			diceUser = sc.nextInt(5) + 1;

			if (diceComp < diceUser) {			//condition to compare the 2 numbers and count each
				System.out.println("Dice values are : " + diceComp + " " + diceUser);				
				countUserWins++;
			} else if (diceComp > diceUser) {
				System.out.println("Dice values are : " + diceComp + " " + diceUser);		
				countCompWins++;
			} else {
				System.out.println("There is no winner. It's a TIE :)");
			}

		}
		System.out.println("Comp wins : " + countCompWins + " times and User wins : " + countUserWins + " times");
		
		if(countCompWins<countUserWins) {		//condition to announce the winner
			System.out.println("USER WINS the DICE GAME");
		}else if(countCompWins>countUserWins) {
			System.out.println("COMP WINS the DICE GANE");
		}else {
			System.out.println("No winner. Its a TIE");
		}
	}

}
