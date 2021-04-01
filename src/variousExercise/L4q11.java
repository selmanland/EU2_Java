package variousExercise;

import java.util.Arrays;

public class L4q11 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {2,3,5};
		int[] z = {1,2,1};
		
		System.out.println(Arrays.toString(createArr(x)));
		System.out.println(Arrays.toString(createArr(y)));
		System.out.println(Arrays.toString(createArr(z)));

	}
	public static int[] createArr(int[] arr) {
		
		int[] arrNew = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
			arrNew = arr;
		}
		return arrNew;
	}

}
