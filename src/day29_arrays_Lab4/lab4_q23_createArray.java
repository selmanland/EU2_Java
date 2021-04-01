package day29_arrays_Lab4;

import java.util.Arrays;

public class lab4_q23_createArray {

	public static void main(String[] args) {
		// q23 Write a method that accepts a number and create and prints a new array of length number, 
		// containing the numbers 0,1,2,...number-1.
		
		System.out.println(Arrays.toString(lengthArray(6)));
	}

	public static int[] lengthArray(int x) {		// need to create and return array of given x int number length

		int[] array = new int[x];					// created new array by default values

		for (int i = 0; i < array.length; i++) {	// now assigned each i values as array elements
			array[i] = i;
		}

		return array;
	}

}
