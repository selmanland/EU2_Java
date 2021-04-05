package assignment7_nestedForLoop;

public class q4_number101Pattern {

	public static void main(String[] args) {
/*
1
10
101
1010
10101
101010
1010101

 */

		int rows = 7;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 != 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
