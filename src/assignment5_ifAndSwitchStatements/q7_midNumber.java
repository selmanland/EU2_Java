package assignment5_ifAndSwitchStatements;

public class q7_midNumber {

	public static void main(String[] args) {

		int num1 = 90;
		int num2 = 60;
		int num3 = 70;

		if (num1 > num2 && num1 < num3) {
			System.out.println("Medium value is: " + num1);
		} else if (num1 < num2 && num1 > num3) {
			System.out.println("Medium value is: " + num1);
		} else if (num2 > num1 && num2 < num3) {
			System.out.println("Medium value is: " + num2);
		} else if (num2 < num1 && num2 > num3) {
			System.out.println("Medium value is: " + num2);
		} else if (num3 > num1 && num3 < num2) {
			System.out.println("Medium value is: " + num3);
		} else if (num3 < num1 && num3 > num2) {
			System.out.println("Medium value is: " + num3);
		}
	}
}
