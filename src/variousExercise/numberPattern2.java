package variousExercise;

public class numberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j);
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k);

			}
			System.out.println();
		}

	}
}