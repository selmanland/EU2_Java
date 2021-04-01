package Lab3_String_Manipulation;

public class q4_returnStringFirstTwoChars {

	public static void main(String[] args) {
		// q4 return string first two chars

		String given = "HALIM";

		System.out.println(firstTwo(given));

	}

	private static String firstTwo(String str) {

		if (str.length() < 2) {
			return str;
		} else if (str.isEmpty()) {
			return "";
		} else {
			return str.substring(0, 2);
		}

	}

}
