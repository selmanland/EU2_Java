package variousExercise;

public class exercise2 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
		}
		System.out.println();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.print("0");
		}
	}
}