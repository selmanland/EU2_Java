package day13_methods_Part1;

public class task60_calculatorDesign {

	public static void main(String[] args) {

		calculator(10, 5, "*");
		calculator(12, 2, "-");
		calculator(100, 25, "/");
		calculator(26, 14, "+");

	}

	public static void calculator(int num1, int num2, String operator) {
		
		switch (operator) {
		case ("-"):
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;

		case ("+"):
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;

		case ("*"):
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;

		case ("/"):
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;

		default:
			System.out.println("invalid entry");
		}
	}

}
