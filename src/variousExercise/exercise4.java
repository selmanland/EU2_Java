package variousExercise;

public class exercise4 {

	public static void main(String[] args) {
		
		numbers(5,9);

	}

	private static void numbers(int num1, int num2) {
		
		for (int i = num1; i <= num2; i++) {
			for (int j = i; j <= num2; j++) {
				System.out.print(j);
			}
			for (int k = num1; k < i; k++) {
				System.out.print(k);

			}
			System.out.println();
	}

}
		
	}
