package day18_readingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a sentence and I will repeat it: ");

		// String str = sc.next(); only repeats first word until space not other words
		// on the line

		String str2 = sc.nextLine();

		System.out.println(str2);

	}

}
