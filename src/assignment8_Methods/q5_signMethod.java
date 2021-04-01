package assignment8_Methods;

import java.util.Scanner;

public class q5_signMethod {

	public static void main(String[] args) {
		// q5 sign method to tell whether a number is negative or positive

		sign(0);

	}

	public static int sign(int num) {

		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = user_input.nextInt();
		if (num < 0) {
			System.out.print(-1);
		} else if (num > 0) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}

		return num;
	}

}
