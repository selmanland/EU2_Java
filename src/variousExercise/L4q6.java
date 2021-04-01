package variousExercise;

import java.util.Arrays;

public class L4q6 {

	public static void main(String[] args) {

		int[] a = { 12, 15, 2, 9, 10, 20 };

		System.out.println(Arrays.toString(greatArray(a)));

	}

	public static int[] greatArray(int[] arr) {

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = max;
		}
		return arr;
	}

}
