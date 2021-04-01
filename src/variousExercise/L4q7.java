package variousExercise;

import java.util.Arrays;

public class L4q7 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,8};
		int[] y = {};
		
		System.out.println(Arrays.toString(firstLast(x, y)));

	}
	public static int[] firstLast(int[] arr1, int[] arr2) {
		
		int[] arr = new int[2];
		
		arr[0] = arr1[0];
		
		arr[1] = arr1[arr1.length-1];
		
		return arr;	
		
	}

}
