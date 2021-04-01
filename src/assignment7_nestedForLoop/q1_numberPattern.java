package assignment7_nestedForLoop;

public class q1_numberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 7;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}