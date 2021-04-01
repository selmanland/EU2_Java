package assignment9_;

public class Assm9_q4_wordJob {

	public static void main(String[] args) {
		// You have a word, do the following:

		// if the word has odd number of characters and has 5 or more characters,
		// print the middle three characters of the word. Otherwise, print "invalid".

		String word = "apple";

		if (word.length() % 2 != 0 && word.length() >= 5) {
			System.out.println(word.substring((word.length() / 2) - 1, (word.length() / 2) + 2));
		} else {
			System.out.println("invalid");
		}

	}

}
