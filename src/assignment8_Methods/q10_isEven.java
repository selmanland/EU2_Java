package assignment8_Methods;

import java.util.Scanner;

public class q10_isEven {

	public static void main(String[] args) {
		// q10 isEven

		System.out.println(isEven());

	}

	public static boolean isEven() {

		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = user_input.nextInt();

		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
