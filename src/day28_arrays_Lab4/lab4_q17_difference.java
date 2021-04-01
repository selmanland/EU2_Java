package day28_arrays_Lab4;

public class lab4_q17_difference {

	public static void main(String[] args) {
		// Write a method that accepts an array and print the difference between the largest and
		// smallest values in the array.

		int[] x = {12,23,54,22,15,88,99};
		int[] y = { 1, 3, 5 };

		System.out.println(difference(x));
		System.out.println(difference(y));

	}

	public static int difference(int[] arr) {

		int smallest = arr[0];
		int largest = 0;

		for (int each : arr) {
			if (each > largest) {
				largest = each;
			}
		}
		for (int each : arr) {
			if (each < smallest) {
				smallest = each;
			}
		}
		int differ = largest - smallest;

		return differ;
	}

}
