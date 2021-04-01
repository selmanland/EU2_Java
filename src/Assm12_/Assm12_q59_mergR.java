package Assm12_;

import java.util.Arrays;

public class Assm12_q59_mergR {

	public static void main(String[] args) {
//		mergR merges two arrays into one. it gets two int arrays and returns an int array

		int[][] arr = { { 1, 2 }, { 6, 8 } };

		int[] mergR = new int[arr[0].length + arr[1].length];

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[0].length; k++) {
				if (i == 0) {
					mergR[k] = arr[i][k];

				} else {
					mergR[arr[0].length + k] = arr[i][k];
				}
			}

		}
		System.out.println(Arrays.toString(mergR));

	}

}
