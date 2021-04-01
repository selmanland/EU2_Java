package exercises;

import java.util.ArrayList;

public class arrayList_exercise {

	public static void main(String[] args) {

		ArrayList<String> langs = new ArrayList<>();

		langs.add("English");
		langs.add("Cool Turkish");
		langs.add("Arabic");
		langs.add("Danish");

		maxLength(langs);
		System.out.println("Max length of the array item is " + maxLength(langs));
		maxLengthItem(langs);
		System.out.println(maxLengthItem(langs));
	}

	public static String maxLengthItem(ArrayList<String> array) {

		String max = "";

		for (String each : array) {
			if (each.length() > max.length()) {
				max = each;
			}
		}
		return max;

	}

	public static int maxLength(ArrayList<String> arr) {

		String max = "";

		for (String each : arr) {
			if (each.length() > max.length()) {
				max = each;
			}
		}
		return max.length();
	}

}
