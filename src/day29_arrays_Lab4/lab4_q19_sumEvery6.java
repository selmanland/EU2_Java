package day29_arrays_Lab4;

public class lab4_q19_sumEvery6 {

	public static void main(String[] args) {
		// q19 Write a method that accepts an array and prints the total of the numbers
		// in the array, except ignore sections of numbers starting with a 6 and extending to
		// the next 7 (every 6 will be followed by at least one 7)

		int[] x = { 1, 2, 2, 6, 99, 99, 7, 3};

		int sum = 0;		// we use sum to add all values as dummy
		
		boolean boolCheckSix = false;	// we use a flag dummy boolean here

		for (int i = 0; i < x.length; i++) {

			if (boolCheckSix) {

				if (x[i] == 7) {

					boolCheckSix = false;
				}

			} else if (x[i] == 6) {

				boolCheckSix = true;

			} else {

				sum = sum + x[i];
			}
		}
		System.out.println(sum);
	}
}
