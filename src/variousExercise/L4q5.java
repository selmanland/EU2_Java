package variousExercise;

import java.util.Arrays;

public class L4q5 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {17,12,10,8};
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(rotLeft(x)));
		System.out.println("-----------------------");
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(rotLeft(y)));

	}
	public static int[] rotLeft(int[] arr) {
		
		int x = arr[0];
		
		for(int i=0;i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = x;
		
		
		return arr;
		
	}

}
