package variousExercise;

import java.util.Arrays;

public class L4q14 {

	public static void main(String[] args) {
		
		// Write a method that accepts 2 arrays and prints a new array containing all their elements
		
		int[] x = {1,2};
		int[] y = {3,4};
		
		combineArray(x, y);

	}
	public static void combineArray(int[] arr1, int[] arr2) {
		
		int[] combinedArr = new int[arr1.length+arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			combinedArr[i] = arr1[i];
		}
		for(int i=arr1.length; i<combinedArr.length; i++) {
			combinedArr[i] = arr2[i-arr1.length];
			
		}
		System.out.println(Arrays.toString(combinedArr));
	}

}
