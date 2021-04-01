package Assm13_;

import java.util.Arrays;

public class q71_populateArray {

	public static void main(String[] args) {
//		Create a method called populate that accepts an empty int array and populates it with numbers counting up.

		int[] array = new int[10];
		
		populate(array);
		
	}
	public static void populate(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
