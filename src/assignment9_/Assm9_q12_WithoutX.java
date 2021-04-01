package assignment9_;

public class Assm9_q12_WithoutX {

	public static void main(String[] args) {
//		Given a string word, if the first or last chars are 'x' or 'X', print the string without 
//		those 'x' or 'X' chars, otherwise print the string unchanged.

		String word = "xJavaX";

		System.out.println(withoutX(word));

	}

	public static String withoutX(String str) {

		if (str.charAt(0) == 'x' || str.charAt(0) == 'X') {

			str = str.substring(1, str.length());
		}
		if (str.charAt(str.length() - 1) == 'x' || str.charAt(str.length() - 1) == 'X') {

			str = str.substring(0, str.length() - 1);
		}
		return str;

	}
}
