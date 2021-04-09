package assignment3_arithmeticOperators;

public class assignment3_Q4_withMethod {

	public static void main(String[] args) {
		
/*
Declare 2 variables (Num1, Num2)

Swap values between Num1 and Num2

Display new values of Num1 and Num2
*/
				
		swapTwoNumbers(10,20);
				

	}
	public static void swapTwoNumbers(int numFirst, int numSecond) {
		
		int numTemp; // create a temp variable and use it to swap numbers
		int num1 = numFirst;
		int num2 = numSecond;		
		
		System.out.println("Before SWAP num1 = " + numFirst);
		System.out.println("Before SWAP num2 = " + numSecond);
		
		numTemp = num1;
		num1 = num2;
		num2 = numTemp;
		
		System.out.println("---------------------");
		System.out.println("After SWAP num1 = " + num1);
		System.out.println("After SWAP num2 = " + num2);
		
		
	}

}
