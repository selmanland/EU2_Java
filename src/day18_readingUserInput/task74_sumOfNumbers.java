package day18_readingUserInput;

import java.util.Scanner;

public class task74_sumOfNumbers {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
		int loop = 0;

		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);

		do {
			System.out.print("Enter a number to calculate sum: ");
			num = user_input.nextInt();

			if (num < 0) {
				break;
			} else {
				sum = sum + num;
				System.out.println("sum of your numbers is : " + sum);

			}
			loop++;
		} while (true);

		System.out.println("sum of your numbers is : " + sum);
		System.out.println("You got " + (loop+1) + " try up to now...");
		System.out.println("Try is over !!!");

	}

}
