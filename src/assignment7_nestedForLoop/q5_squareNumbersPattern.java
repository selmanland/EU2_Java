package assignment7_nestedForLoop;

public class q5_squareNumbersPattern {

	public static void main(String[] args) {
/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
 */

		int rows = 7;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= -1 * i + 7; j++) {
				System.out.print(1);
			}
			for (int k = 1; k <= 1 * i + 0; k++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}
