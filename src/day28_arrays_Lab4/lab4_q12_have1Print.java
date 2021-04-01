package day28_arrays_Lab4;

public class lab4_q12_have1Print {

	public static void main(String[] args) {
		// q12 Write a method that accepts two arrays and prints how many of the arrays have 1 as their first element

		int[] x = {1,2,3};
		int[] y = {1,3};
		
		System.out.println(start1(x,y));		

	}	
	public static int start1(int[] arr1,int[] arr2) {
		
		int counter = 0;
		
		if(arr1[0] == 1) {
			counter++;
		}
		if(arr2[0] == 1) {
			counter++;
		}		
		return counter;
	}
}
