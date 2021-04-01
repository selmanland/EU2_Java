package Lab3_String_Manipulation;

import java.util.Scanner;

public class q9_rotatedRight2 {

	public static void main(String[] args) {
		// q9 rotated right 2 chars
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a String word please");
		String word = user_input.nextLine();
		
		System.out.println(right2(word));

	}

	public static String right2(String str) {
											// Ask how to insert scanner part 		*X*X*X*X*X ? ? ? ? ?
		if (str.length() < 2) {		
			str = "Please enter a valid String with at least two characters";
								
		} else {
			 str = str.substring(str.length()-2).concat(str.substring(0, str.length()-2));
		}
		return str;
	}
}