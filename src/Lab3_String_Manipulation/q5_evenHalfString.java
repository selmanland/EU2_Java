package Lab3_String_Manipulation;

import java.util.Scanner;

public class q5_evenHalfString {

	public static void main(String[] args) {
		// q5_return first half of even String
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please Enter an EVEN String : ");
		String str = user_input.nextLine();		

		firstHalf(str);
		
		user_input.close();

	}

	public static String firstHalf(String first) {

		int rows = first.length() / 2;

		for (int i = 0; i < rows; i++) {
			System.out.print(first.charAt(i));
		}

		return first;
	}

}
