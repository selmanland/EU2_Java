package Assm11_;

public class Assm11_q40_LargestWord {

	public static void main(String[] args) {
//		Given the array words, it will print the word with the largest length. 
//		Assume that there are no 2 words with longest length

		String[] words = { "aa", "bb", "whatsapp", "long", "java" };

		longest(words);

	}

	public static void longest(String[] words) {

		String largest = "";

		for (String each : words) {
			if (each.length() > largest.length()) {
				largest = each;
			}
		}
		System.out.println(largest);
	}

}
