package variousExercise;

import java.util.Arrays;

public class L4q9 {

	public static void main(String[] args) {
		
		int[] x = {4,5,6};
		
		System.out.println(Arrays.toString(doubleArray(x)));

	}
	public static int[] doubleArray(int[] arr) {
		
		int[] arr2 = new int[arr.length*2];
		
		arr2[arr2.length-1] = arr[arr.length-1];
		
		return arr2;		
	}

}
