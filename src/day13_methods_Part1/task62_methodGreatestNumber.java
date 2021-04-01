package day13_methods_Part1;

public class task62_methodGreatestNumber {

	public static void main(String[] args) {

		displayGreatestNumber(30, 40, 25);

	}
	public static void displayGreatestNumber(int num1, int num2, int num3) {
		if(num1>num2 && num1>num3) {
			System.out.println("num1 " + num1 + " is the greatest of all");
		}else if(num2>num1 && num2>num3) {
			System.out.println("num2 " + num2 + " is the greatest of all");
		}else if(num3>num2 && num3>num1) {
			System.out.println("num3 " + num3 + " is the greatest of all");
		}else {
			System.out.println("invalid entry");
		}
		
		
	}

}
