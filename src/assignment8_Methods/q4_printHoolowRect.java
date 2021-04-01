package assignment8_Methods;

public class q4_printHoolowRect {

	public static void main(String[] args) {
		// q4 printHollowRect

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			if (i == 1 || i == rows) {
				for (int j = 1; j <= 5; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 5; j++) {
					if (j == 1 || j == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
