package day15_methodPart3;

public class task67_lastDigit {

	public static void main(String[] args) {

		if (lastDigit(25, 7)) {
			System.out.println("They have the SAME last digit");
		} else {
			System.out.println("They do NOT have the same last digit");
		}

	}

	public static boolean lastDigit(int num1, int num2) {

		if ((num1 % 10) == (num2 % 10)) {
			return true;
		} else {
			return false;
		}

	}
}