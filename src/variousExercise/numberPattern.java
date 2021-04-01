package variousExercise;

public class numberPattern {

	public static void main(String[] args) {

		int rows = 7;

		for (int i = 1; i <= rows; i++) {
			for (int j = -1 * i + 7; j >= 1; j--) {
				System.out.print(1);
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);

			}
			System.out.println();
		}

	}
}