package assignment8_Methods;

import java.util.Scanner;

public class q14_threeLocksBoolean {

	public static void main(String[] args) {
		// q14 threeLocks boolean

		boolean result = truthTable(false);
		System.out.print("your result is : " + result);

	}

	public static boolean truthTable(boolean b) {

		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter true or false for 3 times to get your result: ");
		boolean input1 = user_input.nextBoolean();
		boolean input2 = user_input.nextBoolean();
		boolean input3 = user_input.nextBoolean();

		if (input1 == true && input2 == true && input3 == true) {
			return true;
		} else {
			return false;
		}

	}

}
