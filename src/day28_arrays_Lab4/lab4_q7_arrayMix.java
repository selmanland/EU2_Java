package day28_arrays_Lab4;

import java.util.Arrays;

public class lab4_q7_arrayMix {

	public static void main(String[] args) {
		// Write a method that accepts 2 arrays and prints the second array 
		// containing the first and last elements from the first array.

		int[] x = { 1, 2, 3, 14, 5, 60, 9 };
		int[] y = {};

		System.out.println(Arrays.toString(firstLast(x, y)));

	}

	public static int[] firstLast(int[] arr1, int[] arr2) {

		arr2 = new int[2];

		arr2[0] = arr1[0];

		arr2[1] = arr1[arr1.length - 1];

		return arr2;

	}

}
