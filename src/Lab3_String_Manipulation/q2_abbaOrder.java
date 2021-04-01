package Lab3_String_Manipulation;

import java.util.Scanner;

public class q2_abbaOrder {

	public static void main(String[] args) {
		// q2 order abba return

		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));

	}

	private static String makeAbba(String emj1, String emj2) {

		// Scanner user_input = new Scanner(System.in);
		// System.out.println("Enter a word please : ");
		// String emj1 = user_input.nextLine();
		// System.out.println("Enter second word please : ");
		// String emj2 = user_input.nextLine();

		return emj1 + emj2 + emj2 + emj1;
	}

}
