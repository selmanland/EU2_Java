package variousExercise;

public class forLoopExercise {

	public static void main(String[] args) {

		int num = 12;

		int rows = 10;

		if (num <= 0) {
			System.out.println("Please Enter a Positive Number");
		} else {
			for (int i = 1; i <= rows; i++) {
				System.out.println("12 X " + i + " = " + (i * num));
			}
		}

	}

}
