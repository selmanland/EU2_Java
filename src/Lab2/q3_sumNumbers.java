package Lab2;

import java.util.Scanner;

public class q3_sumNumbers {

	public static void main(String[] args) {
		// q3 Sum Of Integer Numbers

		sumNumbers();

	}

	public static void sumNumbers() {

		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a positive integer number : ");
		int num = user_input.nextInt();
		//can use if statement to check the num is + or -

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = i + sum;

		}
		System.out.println("Sum up to " + num + " is :" + sum);
}
}