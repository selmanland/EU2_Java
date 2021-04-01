package day29_arrays_Lab4;

import java.util.Arrays;

public class lab4_q29_tenRunArray {

	public static void main(String[] args) {
		// Write a function that accepts and array. For each multiple of 10 in the given array, 
		// change all the values following it to be that multiple of 10, until encountering another multiple of 10
		
		int[] x = {2,10,3,3,3,20,4,100,1,1,1}; 		
		
		System.out.println(Arrays.toString(tenRun(x)));
	}
	
	public static int[] tenRun(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%10==0) {										// 
				
				for(int j=i+1;j<arr.length && arr[j]%10 !=0;j++) {	// loop goes up to end and/or until find %10
					
					arr[j]= arr[i];					
				}				
			}
		}		
		return arr;
	}

}
