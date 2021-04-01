package assignment9_;

public class Assm9_q3_word {

	public static void main(String[] args) {
		// You have a word, do the following:

		String word = "java";

		decode(word);

	}

	public static void decode(String word) {

		if (word.length() % 2 != 0) {
			if (word.length() >= 3) {
				System.out.println(word.charAt(word.length() / 2));
			} else if (word.length() == 1) {
				System.out.println(word + word + word);
			}
		} else {
			if (word.length() >= 4) {
				System.out.println(word.substring(((word.length() / 2) - 1), ((word.length() / 2) + 1)));
			} else if (word.length() == 2) {
				System.out.println(word + word);
			}
		}

	}

}
