package day18_readingUserInput;

import java.util.Scanner;

public class task73_guessNumberGame {

	public static void main(String[] args) {
		// Write a guessing game where the user has to guess a secret number between 1-20. 
		// After every guess, the program tells the user whether their number was too large or too small. 
		// The program will keep asking the user to enter the number until he finds the correct number.
		// When the correct answer is found, the program will display "Congrat,you got it"
		
		int numToFind=10;
		int loop=0;
		
		@SuppressWarnings("resource")
		Scanner user_value = new Scanner(System.in);
		System.out.print("Enter a number please: ");
		
		do {
		int numGuess=user_value.nextInt();
		
			if(numGuess==numToFind) {
				System.out.println("Congrat, you got it !!!");
				System.out.println("You Got It at " + (loop+1)+ "th guess !!!");
				break;
			}else {
				if(numGuess<numToFind) {
					System.out.println("Your number is too SMALL");
					System.out.print("Enter a number please: ");
				}else {
					System.out.println("Your number is too LARGE");
					System.out.print("Enter a number please: ");
				}
			}
		loop++;
		
		}while (true);
		
		

	}

}
