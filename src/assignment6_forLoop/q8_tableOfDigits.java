package assignment6_forLoop;

public class q8_tableOfDigits {

	public static void main(String[] args) {
		// q8_tableOfDigits

		for (int num = 1; num <= 10; num++) {
			for (int num2 = 1; num2 <= 10; num2++) {
				System.out.print(num * num2);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
