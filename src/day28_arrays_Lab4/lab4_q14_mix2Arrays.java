package day28_arrays_Lab4;

import java.util.Arrays;

public class lab4_q14_mix2Arrays {

	public static void main(String[] args) {
		// q14 Write a method that accepts 2 arrays and prints a new array containing all their elements

		int[] x = { 1, 2, 3 };
		int[] y = { 4, 5, 6, 7, 8, 9 };
		int[] z = new int[x.length + y.length];

		for (int i = 0; i < x.length; i++) {

			z[i] = x[i];
		}
		int counter = 0;
		
		for (int j = x.length; j < z.length; j++) {

			z[j] = y[counter];
			counter++;
		}
		System.out.println(Arrays.toString(z));
	}
}
