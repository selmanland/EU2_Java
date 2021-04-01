
public class coolStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 4;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= (-1 * i + 4); j++) {
				System.out.print(" ");
			}
			System.out.print("-");

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.print("-");

			System.out.println();
		}

	}

}
