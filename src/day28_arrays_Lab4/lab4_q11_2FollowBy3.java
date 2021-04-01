package day28_arrays_Lab4;

import java.util.Arrays;

public class lab4_q11_2FollowBy3 {

	public static void main(String[] args) {
		// Write a method that accepts an array, and if there is a 2 in the array immediately
		// followed by a 3, set the 3 element to 0. 
		// Print the changed Array

		int[] x = {1,2,3};
		int[] y = {2,3,5};
		int[] z = {1,2,1};
		int[] w = {11,2,13,3,2};
		
		System.out.println(Arrays.toString(follow23(x)));
		System.out.println(Arrays.toString(follow23(y)));
		System.out.println(Arrays.toString(follow23(z)));
		System.out.println(Arrays.toString(follow23(w)));
	}
	
	public static int[] follow23(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2  && arr[i+1]==3) {
				
				arr[i+1]=0;				
			}
		}		
		return arr;
	}
}
