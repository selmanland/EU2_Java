package assignment8_Methods;

import java.util.Scanner;

public class q9_returnMin {

	public static void main(String[] args) {
		// q9 return MIN number against Max

		Scanner user_input = new Scanner(System.in);
		System.out.print("enter num1: ");
		int x = user_input.nextInt();
		System.out.print("enter num2: ");
		int y = user_input.nextInt();

		int value = max(x, y);
		System.out.println("smallest value is: " + value);

	}

	public static int max(int x, int y) {

		if (x < y) {
			return x;
		} else {
			return y;
		}

	}

}
