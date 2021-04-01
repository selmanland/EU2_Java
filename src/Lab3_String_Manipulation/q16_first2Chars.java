package Lab3_String_Manipulation;

public class q16_first2Chars {

	public static void main(String[] args) {
		// given a string make a new string w/ first 2 chars

		String str = "h";
		String c = "@";

		if (str.length() < 2) {
			if (str.length() < 1) {
				System.out.println(c + c);
			} else {
				System.out.println(str + c);
			}

		}else {
			System.out.println(str.substring(0, 2));
		}

	}
}