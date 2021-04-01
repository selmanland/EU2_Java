package day29_arrays_Lab4;

public class lab4_q21_sum2Is8Array {

	public static void main(String[] args) {
		// q21 Write a method that accepts an array and prints true 
		// if the sum of all 2's in the array is exactly 8
		
		int[] x = { 2, 3, 2, 2, 2, 4 };		// we have 4 times 2's and sum is 8

		System.out.println(sum28(x));		// call and print method
	}

	public static boolean sum28(int[] arr) {

		int sum = 0;						// first dummy to get sum

		for (int i = 0; i < arr.length; i++) {	// loop to check each value

			if (arr[i] == 2) {				// looking for 2 to sum

				sum = sum + arr[i];
			}
		}
		if (sum == 8) {
			return true;
		}
		return false;
	}
}
