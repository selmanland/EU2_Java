package Lab3_String_Manipulation;

public class q7_StringShortLongShort {

	public static void main(String[] args) {

		String str1 = "Java"; 			// What is the best option of R E T U R N here???
		String str2 = "Course"; 		// How to change R E T U R N based on this structure?

		System.out.println(comboString(str1, str2));
	}

	public static String comboString(String word1, String word2) {

		String str;

		if (word1.length() < word2.length()) {
			str = word1 + word2 + word1;

		} else if (word1.length() > word2.length()) {
			str = word2 + word1 + word2;

		} else {
			str = "Two words length are equal";
		}
		return str;

	}

}
