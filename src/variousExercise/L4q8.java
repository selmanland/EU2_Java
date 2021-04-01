package variousExercise;

import java.util.Arrays;

public class L4q8 {

	public static void main(String[] args) {
		
		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5};
		
		System.out.println(contains(x));
		System.out.println(contains(y));
		System.out.println(contains(z));

	}
	public static boolean contains(int[] arr) {
		
		boolean b = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==2 || arr[i]==3) {
				b=true;
			}
		}
		return b;
	}

}
