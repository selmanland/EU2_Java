package assignment6_forLoop;

public class q10_drawPattern {

	public static void main(String[] args) {
		//q10

		int rows = 7;

		for (int i = 1; i <= rows; i++) {
			System.out.print("#");

			for (int k = 1; k <= 1 * i - 1; k++) {
				System.out.print(" ");
			}
			System.out.print("#");

			System.out.println();
		}

	}

}
