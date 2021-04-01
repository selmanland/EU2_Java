package Assm11_;

import java.util.Arrays;

public class assm11_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 3, 6, 0, 4, 3, 2, 7, 1 };

		int day = 0;
		System.out.println("Day " + day + " " + Arrays.toString(arr));

		for (Integer value : arr) {
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
