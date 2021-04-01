package assignment8_Methods;

import java.util.Scanner;

public class q12_hamletQuote {

	public static void main(String[] args) {
		// q12 Hamlet Quote

		boolean b = hamletQuote();
		System.out.println("your result now is : " + b);

	}

	public static boolean hamletQuote() {

		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter true or false 2 times: ");
		boolean b1 = user_input.nextBoolean();
		boolean b2 = user_input.nextBoolean();

		if (b1 == false && b2 == false) {
			return false;
		} else {
			return true;
		}
	}

}
