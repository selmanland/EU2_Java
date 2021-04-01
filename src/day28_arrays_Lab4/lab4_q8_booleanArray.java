package day28_arrays_Lab4;

public class lab4_q8_booleanArray {

	public static void main(String[] args) {
		// q8 Write a method that accepts an array and prints true if it contains a 2 or a 3
		
		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5};
		
		System.out.println(has2_Or_3(x));
		System.out.println(has2_Or_3(y));
		System.out.println(has2_Or_3(z));
	}
	
	public static boolean has2_Or_3(int[] arr) {
		
		for(int value : arr) {
			
			if(value==2 || value==3) {
				
				return true;
			}			
		}		
		return false;
	}
}
