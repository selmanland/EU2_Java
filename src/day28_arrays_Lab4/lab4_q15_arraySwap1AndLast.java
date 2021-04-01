package day28_arrays_Lab4;

import java.util.Arrays;

public class lab4_q15_arraySwap1AndLast {

	public static void main(String[] args) {
		// Write a method that accepts an array and swap the first and last element in
		// the array.
		// Print the modified array

		int[] x = { 5, 6, 7, 8, 9 };

		System.out.println(Arrays.toString(swapEnds(x)));
	}

	public static int[] swapEnds(int[] arr) {

		int temp = 0;
		
		temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		return arr;
	}

}
