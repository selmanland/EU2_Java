package Assm11_;

import java.util.Arrays;

public class Assm11_q47_inhabitants {

	public static void main(String[] args) {

//		keep continue to divide until all values ZERO. if one value larger than ZERO keep doing it

		int[] arr = { 3, 6, 0, 4, 3, 2, 7, 1 };

		int day = 0;
		System.out.println("Day " + day + " " + Arrays.toString(arr));

		for (int value : arr) {
			while (arr[value] != 0) {
				day++;
				for (int i = 0; i < arr.length; i++) {
					arr[i] /= 2;
				}
				System.out.println("Day " + day + " " + Arrays.toString(arr));
			}
		}
		System.out.println("---- EXTINCT ----");

	}

}
