package Lab3_String_Manipulation;

import java.util.Scanner;

public class q6_StringFirstLast {

	public static void main(String[] args) {
		// String return w/o first and last char
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter a String word : ");
		String str = user_input.nextLine();
		
		System.out.println(withoutEnd(str));

	}

	public static String withoutEnd(String firstLast) {

		firstLast = firstLast.substring(1, firstLast.length() - 1);

		return firstLast;
	}

}
