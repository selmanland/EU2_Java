package assignment8_Methods;

import java.util.Scanner;

public class q6_next3Numbers {

	public static void main(String[] args) {
		// q6 print next 3 numbers method
		
		next3(0);

	}

	public static int next3(int num) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("enter number: ");
		num = user_input.nextInt();
		System.out.println("next 3 are: ");
		System.out.print((num+1) + " " + (num+2) + " " + (num+3));
		
		return num;		
	}

}
