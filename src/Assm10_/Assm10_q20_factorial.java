package Assm10_;

public class Assm10_q20_factorial {

	public static void main(String[] args) {
		// In mathematics, the factorial of a positive integer n, denoted by n!, is the
		// product of all positive integers less than or equal to n. 
		// Calculate factorial and output result to the console.

		int num = 5;
		int factorial = 1;
		
		for(int i=1; i<=num; i++) {
			factorial = factorial * i;
			
		}
		System.out.println("Factorial of " + num + " is " + factorial);
		
	}

}
