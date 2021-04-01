package day14_methods_Part2;

public class Lab2_boolean6Display {

	public static void main(String[] args) {

		displayBoolean(6, 4);
		displayBoolean(4, 5);
		displayBoolean(1, 5);
		displayBoolean(12, 6);

	}

	public static void displayBoolean(int num1, int num2) {
		
		if(num1==6 || num2==6 || num1 + num2 == 6 || num1 - num2 == 6 || num2 - num1 == 6) {
		/*if ((num1 + num2) % 6 == 0) {
			System.out.println("True");
		} else if ((num1 - num2) % 6 == 0) {
			System.out.println("True");
		} else if ((num1 + num2) % 6 == 0) {*/
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
