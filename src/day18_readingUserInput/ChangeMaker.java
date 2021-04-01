package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {

		// enter a whole number from 1-99 and I will find a combination of coins that
		// equals that amount of change
		// quarter 25 cents dimes 10 cents nickels 5 cents pennies 1 cent
		
		// TRY various CODING ways...

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a valid integer number from 1 to 99 please:");

		int attempt = 0;

		do {
			int user_value = keyboard.nextInt();

			if (user_value > 1 && user_value < 100) {
				changeFinder(user_value);
				break;
			} else {
				attempt++;

				if (attempt == 3) {
					System.out.println("Sorry, no more attempt");
					break;
				} else {
					System.out.print("Try again: ");
				}
			}

		} while (true);
	}

	public static void changeFinder(int value) {

		int quarters = value / 25;
		value = value % 25;
		int dimes = value / 10;
		value = value % 10;
		int nickles = value / 5;
		value = value % 5;
		int pennies = value;

		System.out.println("Your change is: " + quarters + " quarters, " + dimes + " dimes, " + nickles
				+ " nickles and " + pennies + " pennies");
	

	}
}