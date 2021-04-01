package day28_arrays_Lab4;

import java.util.Arrays;

public class lab4_q6_arrayGreatestElement {

	public static void main(String[] args) {
		// q6 Write a method that accepts an array and figure out which is greatest element in the array, 
		// and set all the other elements to be that value. Print the changed array

		int[] x = { 1, 20, 18, 0,  50, 12 };

		System.out.println(Arrays.toString(maxValue(x)));
	}

	public static int[] maxValue(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i + 1] > max) {

				max = arr[i + 1];
			}
		}
		for (int i = 0; i < arr.length; i++) {

			arr[i] = max;
		}
		return arr;
	}
}
