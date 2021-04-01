package Assm11_;

import java.util.Arrays;

public class Assm11_q42_fewValues {

	public static void main(String[] args) {

//		Given a String array arr with the following elements ["zero", "one", "two","three","four"]
//
//				Create another array fewValues and copy words that have letter "e" in them. 
//				You need to know how many element contain "e" and create array accordingly
//
//				Values in fewValues array need to be["zero", "one","three"]

		String[] arr = { "zero", "one", "two", "three", "four" };
		int count = 0;

		for (String each : arr) {
			if (each.contains("e")) {
				count++;
			}
		}
//		System.out.println(count);

		String[] fewValues = new String[count];
		int place = 0;

		for (String each : arr) {
			if (each.contains("e")) {
				fewValues[place] = String.valueOf(each);
				place++;
				
			}
		}
		System.out.println(Arrays.toString(fewValues));
	}

}
