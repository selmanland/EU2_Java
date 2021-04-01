package day18_readingUserInput;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		
		System.out.print("Enter second number:");
		int num2=sc.nextInt();
		
		sc.nextLine();// above int below "string line", before "string line" must add this line
					  // if use only next w/o line its OK but if using Line must add this...
		
		System.out.print("Enter a string:");
		String str=sc.nextLine();
		
		System.out.println("Output:" + num1 + ":" + num2 + ":" + str);

	}

}
