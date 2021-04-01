package variousExercise;

public class print_reverse {

	public static void main(String[] args) {

		printReverse("hello there!");

	}

	public static void printReverse(String string) {

		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));

		}

	}

}
