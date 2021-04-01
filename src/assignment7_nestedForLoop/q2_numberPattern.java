package assignment7_nestedForLoop;

public class q2_numberPattern {

	public static void main(String[] args) {
		// q2

		int rows = 7;

		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
