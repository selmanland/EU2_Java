package review_sessions_Week7_Loops;

public class methodOverloading {

	public static void main(String[] args) {
		
		
		sum(10, 5.4);
		sum(3, 1, 4);
		sum("hello", "10");
	}

	public static void sum(int num1, int num2) {
		System.out.println("sum(int num1, int num2)");
		System.out.println("Result: " + (num1 + num2));
	}

	
	public static void sum(int num1, int num2, int num3) {
		System.out.println("sum(int num1, int num2,int num3)");
		System.out.println("Result: " + (num1 + num2 + num3));
	}

	
	public static void sum(String str1, String str2) {
		System.out.println("sum(String str1, String str2)");
		System.out.println("Result: " + str1 + str2);
	}

	
	public static void sum(double num1, double num2) {
		System.out.println("sum(double num1, double num2)");
		System.out.println("Result: " + (num1 + num2));
	}

	public static double sum(double num1, double num2, String str) {
		System.out.println("sum(double num1, double num2)");
		System.out.println("Result: " + (num1 + num2));
		return num1 + num2;
	}

	public static double sum(double num1, String str, double num2) {
		System.out.println("sum(double num1, double num2)");
		System.out.println("Result: " + (num1 + num2));
		return num1 + num2;
	}

	public static void printMessage(String str, int num) {
		System.out.println(str + num);
	}

	public static void printMessage(int num, String str) {
		System.out.println(num + str);

	}

}
