package Lab3_String_Manipulation;

import java.util.Scanner;

public class q8_rotatedLeft2 {

	public static void main(String[] args) {
		// q8 rotated left 2 chars

		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter a String : ");
		String str = user_input.nextLine();

		System.out.println(left2(str));

	}

	private static String left2(String word) {

		word = word.substring(2, word.length()).concat(word.substring(0, 2));

		return word;

	}

}
