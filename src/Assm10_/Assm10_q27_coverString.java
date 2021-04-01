package Assm10_;

public class Assm10_q27_coverString {

	public static void main(String[] args) {
		// coverString method will take 2 string parameters from the caller.

		String words = coverString("java javascript", "va");
		System.out.println(words);

	}

	public static String coverString(String str1, String str2) {

		String dummy = "";

		for (int i = 0; i < str1.length() - str2.length() + 1; i++) {

			if (str1.substring(i, i + str2.length()).equals(str2)) {

				dummy += str1.replace(str1.substring(i, i + str2.length()), "[" + str2 + "]");
				break;
			}

		}
		return dummy;
	}

}
