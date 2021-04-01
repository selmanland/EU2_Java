package day29_arrays_Lab4;

public class lab4_q20_next2Array {

	public static void main(String[] args) {
		// q20 Write a method that accepts an array and prints true if the array contains a 2 next to a 2 somewhere
		
		int[] x = {1,2,2,3};
		
		boolean flag = false;		
		
		for(int i=0;i<x.length-1;i++) {
			
			if(x[i]==2 && x[i+1]==2) {
				flag = true;
				break;
			}
		}		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
