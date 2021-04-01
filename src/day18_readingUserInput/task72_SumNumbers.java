package day18_readingUserInput;

import java.util.Scanner;

public class task72_SumNumbers {

	public static void main(String[] args) {
		// write a program that ask user to enter 3 numbers and shows the total of numbers
		
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter 3 numbers to get your sum: ");
		int num1=user_input.nextInt();
		int num2=user_input.nextInt();
		int num3=user_input.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("Sum of numbers: " + sum);

	}
	
}
