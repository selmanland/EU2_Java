package Assm12_;

import java.util.Arrays;

public class Assm12_q56_leftShifted {

	public static void main(String[] args) {
//		Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. 
//		You may modify and print the given array, or print a new array.

		int[] arr = { 6, 2, 5, 3 };

		int[] arrTemp = new int[arr.length];

		for (int i = 0; i < arr.length - 1; i++) {
			arrTemp[arr.length - 1] = arr[0];
			arrTemp[i] = arr[i + 1];

		}
		System.out.println(Arrays.toString(arrTemp));
	}

}
