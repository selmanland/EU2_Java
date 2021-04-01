package Assm11_;

import java.util.Arrays;

public class Assm11_q37_FirstLastArray {

	public static void main(String[] args) {
//		Given a String array words, iterate through each word and print first and last letter 
//		of each element in the format below.

		String[] arr = { "hello", "why", "by", "apple", "note" };

		firstLast(arr);

	}

	public static void firstLast(String[] arr) {
		String[] word = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			word[i] = arr[i].substring(0, 1) + arr[i].substring(arr[i].length() - 1);

		}

		System.out.print(Arrays.toString(word));
	}

}
