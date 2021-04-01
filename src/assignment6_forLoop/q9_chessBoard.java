package assignment6_forLoop;

public class q9_chessBoard {

	public static void main(String[] args) {
		// q9 chess board

		int rows = 8;

		char w = 'W';
		char b = 'B';

		for (int i = 1; i <= rows; i++) {

			if (i % 2 == 0) {
				for (int j = 1; j <= rows / 2; j++) {
					System.out.print(b + " " + w + " ");
				}
			} else {
				for (int j = 1; j <= rows / 2; j++) {
					System.out.print(w + " " + b + " ");
				}

			}
			System.out.println();
		}

	}

}
