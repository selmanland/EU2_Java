package assignment8_Methods;

import java.util.Scanner;

public class q7_isPalindrome {

	public static void main(String[] args) {
		// q7 isPalindrome number

		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a number : ");
		int number = sc.nextInt();
		sc.close();
		
		boolean b = isPalindrome(number);
		System.out.println(b);
	}

	public static boolean isPalindrome(int number) { 
		int num = number;  // changing original number to a reversed version 
		int isNum = 0;
		while (num != 0) {
			int remainder = num % 10;
			isNum = isNum * 10 + remainder;
			num = num / 10;
		}
		if (isNum == number) { // checking if original number is equal to reversed number
			return true;
		} else {
			return false;
		}

	}

}
