package day29_arrays_Lab4;

public class lab4_q17_printDifferenceOfTwoArrays {

	public static void main(String[] args) {
		// q17 Write a method that accepts an array and print the difference
		// between the largest and smallest values in the array.

		int[] x = { 7, 2, 10, 9 };

		System.out.println(difference(x));
		
	}
	public static int difference(int[] arr) {

		// finding the biggest so we can start from "0" (zero) or arr[0]
		int max = 0;									// reference may be 0 or arr[0]
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			}
		}
		// finding the smallest so start from MAX
		int min = max;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {

				min = arr[i];
				}
		}
		return max - min;
	}
}
