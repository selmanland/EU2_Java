package assignment8_Methods;

import java.util.Scanner;

public class q2_cubedNumber {

	public static void main(String[] args) {
		// q2 cubed number
		
		cube();

	}

	public static void cube() {
		
		Scanner user_input = new Scanner (System.in);
		System.out.print("input:");
		int num = user_input.nextInt();
		num = num*num*num;
		System.out.println("output: " + num);
		
		return;
		
	}

}
