package assignment5_ifAndSwitchStatements;

public class q4_numberOddEven {

	public static void main(String[] args) {
		
		/**
		 * Enter a positive number and print out if the number is ODD or EVEN...
		 * (Please cover all other possibilities such as negatives)
		 */
		
		int num=-1;
		System.out.println("number = " + num);
		
		if(num > 0 && num % 2 != 0) {
			System.out.println(num + " is odd");
		}else if(num > 0 && num % 2 == 0){
			System.out.println(num + " is even");
		}else {
			System.out.println("please enter a valid positive number");
		}
	}
}
