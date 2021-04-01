package day13_methods_Part1;

public class task58_greaterNumber {

	public static void main(String[] args) {

		greaterNumber();
	}

	public static void greaterNumber() {
		int num1 = 60;
		int num2 = 50;
		if (num1 > num2) {
			System.out.println("num1 " + num1 + " is greater than num2 " + num2);
		} else if (num2 > num1) {
			System.out.println("num2 " + num2 + " is greater than num1 " + num1);
		} else {
			System.out.println("num1 and num2 are equal");
		}
	}
}
