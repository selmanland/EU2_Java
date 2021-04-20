package day23_stringManipulation;

import java.util.Random;
import java.util.Scanner;

public class task83_rollDice {

	public static void main(String[] args) {
		// Random roll dice game. The program should randomly generate two numbers in the range of 1 through 6 and display them.

		Random rn = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dice1;
		int dice2;

		String c = "y";

		while (c.equalsIgnoreCase("y")) {
			System.out.println("rolling the dice...");
			dice1 = rn.nextInt(6) + 1;
			dice2 = rn.nextInt(6) + 1;

			System.out.println("Dice is : " + dice1 + " " + dice2);
			System.out.print("Roll them again: y=yes  n=no    ");
			c = sc.next();

		}
		System.out.println("Have a nice day :)");
		
		sc.close();
	}

}
