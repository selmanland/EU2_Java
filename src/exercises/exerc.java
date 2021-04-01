package exercises;

import java.util.Arrays;

public class exerc {

	public static void main(String[] args) {
		// q14 Write a method that accepts 2 arrays and prints a new array containing all their elements

		int[] x = { 1, 2, 3 };
		int[] y = { 4, 5, 6, 7, 8, 9 };
		int[] z = new int [x.length + y.length];
		
		for(int i=0;i<x.length; i++) {
			z[i] = x[i];
		}
		int loop = 0;
		
		for(int i=x.length; i<z.length; i++) {
			z[i] = y[loop];
			loop++;
		}
		System.out.println(Arrays.toString(z));
		
	}

}
