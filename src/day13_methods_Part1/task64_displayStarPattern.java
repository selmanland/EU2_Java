package day13_methods_Part1;

public class task64_displayStarPattern {

	public static void main(String[] args) {

		displayStarPattern(4);

	}

	public static void displayStarPattern(int rowNumber) {
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}