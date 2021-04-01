package day14_methods_Part2;

public class Lab3_multiple11Number {

	public static void main(String[] args) {

		displayMessage(23);
		displayMessage(23);
		displayMessage(24);
		displayMessage(33);
		displayMessage(1);

	}

	public static void displayMessage(int num) {

		if (num % 11 == 0 || num % 11 == 1) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

}
