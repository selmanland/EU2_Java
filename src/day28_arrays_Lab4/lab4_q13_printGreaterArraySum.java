package day28_arrays_Lab4;

import java.util.Arrays;

public class lab4_q13_printGreaterArraySum {

	public static void main(String[] args) {
		// q 13 Write a method that accepts 2 arrays and consider the sum of the values in each array.
		// Print the array which has the largest sum. In event of a tie, print "equal"

		int[] x = {2,8};
		int[] y = {3,7};
		
		largerSum(x, y);
	}
	
	public static void largerSum(int[] arr1,int[] arr2) {
		
		int sum1=0;
		int sum2=0;
		
		for(int value : arr1) {
			sum1=sum1+value;
		}
		for(int value : arr2) {
			sum2=sum2+value;
		}
		
		if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}else if(sum2>sum1) {
			System.out.println(Arrays.toString(arr2));
		}else{
			System.out.println("Equal");			
		}
	}

}
