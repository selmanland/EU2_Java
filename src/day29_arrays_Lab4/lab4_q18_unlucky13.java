package day29_arrays_Lab4;

public class lab4_q18_unlucky13 {

	public static void main(String[] args) {
		// q18 Write a function that accepts an array and prints the sum of the numbers in the array. 
		// Except the number 13 is very unlucky, so it does not count and numbers
		// that come immediately after a 13 also do not count

		int[] x = { 1, 2, 2, 1, 13, 3, 2 };

		int sum = 0;

		for (int i = 0; i < x.length; i++) {

			if (x[i] != 13) {
				sum = sum + x[i];
			} else {
				break;
			}
		}
		System.out.println(sum);
	}
}
