package assignment5_ifAndSwitchStatements;

public class q3_ifNegOrPositiveNumber {

	public static void main(String[] args) {
		
		int number=1;
		
		if(number>0) {
			System.out.println("number = " + number);
			System.out.println(number + " is positive");
		}else if(number<0) {
			System.out.println("number = " + number);
			System.out.println(number + " is negative");
		}else {
			System.out.println("number = 0");
			System.out.println("It is zero");
		}

	}

}
