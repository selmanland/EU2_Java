package variousExercise;

import java.util.Arrays;

public class L4q13 {

	public static void main(String[] args) {
		
		int[] x = {1,3};
		int[] y = {3,4};
		
		sumArray(x, y);

	}
	public static void sumArray(int[] arr1, int[] arr2) {
		
		int sum1 = 0;
		int sum2 = 0;	
		
		for(int i=0; i<arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			sum2 = sum2 + arr2[i];		
	}
		
		if(sum1<sum2) {
			System.out.println(Arrays.toString(arr2));
		}else if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}else {
			System.out.println("Equal");
		}
	}
}