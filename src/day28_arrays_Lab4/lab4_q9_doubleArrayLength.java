package day28_arrays_Lab4;

import java.util.Arrays;

public class lab4_q9_doubleArrayLength {

	public static void main(String[] args) {
		// q9 Write a method that accepts an array and prints a new array with double the length
		// where its last element is the same as the original array

		int[] x = { 1, 2, 3, 6, 7 };

		System.out.println(Arrays.toString(doubleLenght(x)));

	}

	public static int[] doubleLenght(int[] arr) {

		int[] newArray = new int[2 * arr.length];

		newArray[newArray.length - 1] = arr[arr.length - 1];

		return newArray;

	}

}
