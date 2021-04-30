package Assm10_;

import java.util.Scanner;

public class Assm10_q24_StringJavaPython {

	public static void main(String[] args) {
//		Given a string, print out true if the number of appearances of "java" anywhere in the string is 
//		equal to the number of appearances of "python" anywhere in the string (case sensitive).

		String sample = "We study java not python. Java! Java";

		System.out.println(numberOfString(sample));

	}

	private static boolean numberOfString(String sentence) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first input=");

		String input1 = sc.next();
		System.out.println();

		System.out.println("Enter a second input=");

		String input2 = sc.next();

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i <= sentence.length() - input1.length(); i++) {

			if (sentence.substring(i, i + input1.length()).equals(input1)) {

				count1++;
			}
		}

		for (int i = 0; i <= sentence.length() - input2.length(); i++) {

			if (sentence.substring(i, i + input2.length()).equals(input2)) {

				count2++;
			}
		}
		
		System.out.println("count1 " + count1);
		System.out.println("count2 " + count2);

		if (count1 == count2) {

			return true;

		} else {
			return false;
		}
		
	}
	
}
