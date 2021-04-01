package assignment5_ifAndSwitchStatements;

public class q9_numbersDigits {

	public static void main(String[] args) {
		
		int number=79524;
		
		System.out.println("Display promt: " + number/10000);
		System.out.println("Display promt: " + number/1000%10);
		System.out.println("Display promt: " + number/100%10);
		System.out.println("Display promt: " + number%100/10);
		System.out.println("Display promt: " + number%10);
	}

}
