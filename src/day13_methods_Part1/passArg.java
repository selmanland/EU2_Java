package day13_methods_Part1;

public class passArg {

	public static void main(String[] args) {
		
		int x=20;
		displayValue(10);
		displayValue(x);
		displayValue(x*5);

	}
	public static void displayValue(int num) {
		System.out.println("The value is " + num);
		
	}

}
