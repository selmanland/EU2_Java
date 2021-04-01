package day28_arrays_Lab4;

import java.util.Arrays;

public class lab4_q5_printArrayRotatedLeft {

	public static void main(String[] args) {
		// q5 print array rotated left
		
		int [] x = {17,12,10,8};
		
		System.out.println(Arrays.toString(rotLeft(x)));
		System.out.println(Arrays.toString(rotLeft(x)));

	}
	public static int [] rotLeft(int [] array) {		
		
		int x = array[0]; // first pick the first element
		
		for(int i=0; i<array.length-1; i++ ) {
			array[i]=array[i+1];
		}
		
		array [array.length-1] = x; // now assign the picked value to last element
		
		return array;
		
	}

}
