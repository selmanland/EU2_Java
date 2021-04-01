package Lab3_String_Manipulation;

import java.util.Scanner;

public class q10_returnTrueIf {

	public static void main(String[] args) {
		// q10 return true if first two chars are the same with the end of the string

		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter a word to check if first two chars are the same with the end:");
		String word = user_input.nextLine();

		System.out.println(frontAgain(word));

	}

	public static boolean frontAgain(String str) {
		
		boolean flag;

		if (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2, str.length()))) {
			flag = true;

		} else {
			flag = false;
		}
		return flag;

	}

}
