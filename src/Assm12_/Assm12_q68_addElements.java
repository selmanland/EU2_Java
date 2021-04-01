package Assm12_;

import java.util.Arrays;

public class Assm12_q68_addElements {

	public static void main(String[] args) {
//		Method addElements accepts 2 int arrays and adds each element value of two arrays 
//		and returns a new array. You can assume that each array has 5 elements

		int[] arr1 = {10, 40, 50, 3, 1};		
		int[] arr2 = {11, 0, 500, 44, 1101};
		
		System.out.println(Arrays.toString(addElements(arr1, arr2)));
		
	}
	public static int[] addElements(int[] newArr1, int[] newArr2) {
		
		int[] lastArray = new int[newArr1.length];
		
		for(int i=0; i<newArr1.length; i++) {
			lastArray[i] = newArr1[i] + newArr2[i];
		}
		
		
		return lastArray;
	}

}
