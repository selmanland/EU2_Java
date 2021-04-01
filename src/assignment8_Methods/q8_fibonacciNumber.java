package assignment8_Methods;

import java.util.Scanner;

public class q8_fibonacciNumber {

	public static void main(String[] args) {
		// q8 fibonacci number

		int x = fib(0);
		System.out.print("output :" + x);

	}

	public static int fib(int sum) {

		Scanner user_input = new Scanner(System.in);
		System.out.print("Input: ");
		int num = user_input.nextInt();
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i <= num - 2; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;

		}
		return sum;

	}

}
