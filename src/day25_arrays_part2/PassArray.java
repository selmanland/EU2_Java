package day25_arrays_part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {

		int[] numbers = new int[4]; // create an array

		getValues(numbers); // pass the array to the getValues method

		System.out.println("Here are the numbers you entered:");

		showArray(numbers); // pass the array to showArray method

	}

	public static void showArray(int[] anyArrayName) {
		for (int value : anyArrayName) {
			System.out.print(value + " ");
		}

	}

	public static void getValues(int[] arrayNumber) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a series of " + arrayNumber.length + " numbers please...");

		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.println("Enter number " + (i + 1) + " :");
			arrayNumber[i] = sc.nextInt();

		}

	}

}
