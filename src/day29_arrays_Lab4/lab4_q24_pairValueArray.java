package day29_arrays_Lab4;

public class lab4_q24_pairValueArray {

	public static void main(String[] args) {
		// q24 A value is "everywhere" in an array if for every pair of adjacent elements in the array, at
		// least one of the pair is that value.
		// Write a method that accepts an array and a number, and prints true if the given number
		// is everywhere in the array.
		
		int[] x = {1,2,1,3};
		int a = 2;
		
		System.out.println(isEverywhere(x, a));

	}
	
	public static boolean isEverywhere(int[] arr,int number) {
		
		for(int i=0;i<arr.length-2;i++) {
			
			if(arr[i]==number && (arr[i+1]==number || arr[i+2]==number)) {	// condition: check i+1 and i+2 next two place
				return true;
			}
		}
		
		return false;

	}

}
