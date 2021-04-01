package exercises;

import java.util.Scanner;

public class method_exerc {

	public static void main(String[] args) {

//		Write a guessing game where the user has to guess a secret number
//		between 1-20. After every guess, the program tells the user whether
//		their number was too large or too small. The program will keep asking
//		the user to enter the number until he finds the correct number.
//		When the correct answer is found, the program will display "Congrat,you got it"

		int numToFind = 9;
		int loop = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number please ");

		do {
			int numGuess = sc.nextInt();

			if (numGuess == numToFind) {
				System.out.println("CONGRAT YOU GOT IT !!!");
				System.out.println("You Got It at " + (loop+1)+ "th guess !!!");
				break;
			} else if (numGuess < numToFind) {
				System.out.println("Your Guess is TOO Small");
				System.out.println("Enter a number please ");
			} else {
				System.out.println("Your Guess is TOO Large");
				System.out.println("Enter a number please ");
			}
			loop++;
			
		} while (true);

	}

}
