package day29_arrays_Lab4;

public class lab4_q16_arrayEvenNumbers {

	public static void main(String[] args) {
		// q16 Write a method that accepts an array and prints the number of even
		// numbers in the array.

		int[] x = { 2, 1, 2, 3, 7, 8 };

		System.out.println(countEvens(x));
	}

	public static int countEvens(int[] arr) {

		int counter = 0;		// asking HOW MANY so use counter

		for (int value : arr) {	// we use for each loop bc check each value no need index numbers

			if (value % 2 == 0) {

				counter++;
			}
		}

		return counter;
	}

}
