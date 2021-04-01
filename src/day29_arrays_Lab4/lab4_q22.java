package day29_arrays_Lab4;

public class lab4_q22 {

	public static void main(String[] args) {
		// Write a method that accepts an array and prints true if the number 1's is greater than the number 4's
		
		int[] x = { 1, 1, 4, 4, 4 };
		
		System.out.println(more14(x));		// call and print method
	}

	public static boolean more14(int[] arr) {

		int counter1 = 0;					// first count for 1 and 4 using counter
		int counter4 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {				// if find 1 count++
				counter1++;
			} else if (arr[i] == 4) {		// if find 4 count++
				counter4++;
			}
		}
		if (counter1 > counter4) {			// check condition if 1's is bigger than 4's
			return true;
		}
		return false;
	}
}
