package assignment6_forLoop;

public class q7_numberPatternNestedForLoops {

	public static void main(String[] args) {
		// q7 number pattern using nested for loops

		int rows = 4;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= +1*i+0; j++) {
				System.out.print(" ");
			}
			for (int k = -1 * i + 5; k >= 1; k--) { // use formula but change direction to start from big to small
													// number
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
}
