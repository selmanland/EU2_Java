package Assm12_;

import java.util.ArrayList;
import java.util.Arrays;

public class Assm12_q60_combineRs {

	public static void main(String[] args) {
		// combine two String arrays into one arraylist and return it as a string

		String[][] arr = { { "1", "2", "3" }, { "4" } };

		ArrayList<String> word = new ArrayList<String>();

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				word.add(arr[i][k]);

			}
		}
		String sentence = "";

		for (String each : word) {
			sentence += each;
		}

		System.out.println(Arrays.toString(word.toArray()));
		System.out.println(sentence);

	}

}
