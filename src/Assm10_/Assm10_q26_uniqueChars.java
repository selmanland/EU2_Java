package Assm10_;

public class Assm10_q26_uniqueChars {

	public static void main(String[] args) {
//		uniqueChars is a method that you will code now, should be able to accept any string in the word 
//		and return unique characters from the parameter.

		String word = "spoon";

		uniqueChars(word);
		System.out.println(uniqueChars(word));

	}

	public static String uniqueChars(String str) {

		String dummy = "";
		char current;

		for (int i = 0; i < str.length(); i++) {
			current = str.charAt(i);
			if (dummy.indexOf(current) < 0) {
				dummy += current;
			}
		}

		return dummy;

	}

}
