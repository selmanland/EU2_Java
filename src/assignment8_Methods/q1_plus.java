package assignment8_Methods;

import java.util.Scanner;

public class q1_plus {

	public static void main(String[] args) {
		// q1 method called "plus"

		plus();

	}

	public static void plus() {

		Scanner user_input = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = user_input.nextInt();
		System.out.println("enter second number:");
		int num2 = user_input.nextInt();

		int sum = num1 + num2;

		System.out.println("result : " + sum);

		return;
	}

}
