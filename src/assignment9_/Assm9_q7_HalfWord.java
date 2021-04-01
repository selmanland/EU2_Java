package assignment9_;

public class Assm9_q7_HalfWord {

	public static void main(String[] args) {
		// Write a program that will print out the first half of the word twice.

		String str = "Cybertek";
		String strNew = "";

		for (int r = 1; r <= 2; r++) {

			for (int i = 0; i < str.length() / 2; i++) {
				strNew += str.charAt(i);
			}
		}

		System.out.println(strNew);
	}

}
