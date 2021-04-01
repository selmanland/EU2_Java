package assignment9_;

public class Assm9_q6_reverseStr {

	public static void main(String[] args) {
//		Write a program that will reverse a string. Your program should reverse a string 
//		only 5 characters long. if the word is shorter, display message: "Too short!". 
//		if the word is longer, display the message: "Too long!". 
//		Otherwise, reverse this word and print out the result into the console.

		String str = "apple";

		if (str.length() > 5) {
			System.out.println("Too Long");
		} else if (str.length() < 5) {
			System.out.println("Too Short");
		} else {
			String strRev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				strRev = strRev + str.charAt(i);
			}
			System.out.println(strRev);
		}
	}
}
