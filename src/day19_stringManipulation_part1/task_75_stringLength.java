package day19_stringManipulation_part1;

import java.util.Scanner;

public class task_75_stringLength {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter your first and last name: ");
		String name = user_input.nextLine();
		
		System.out.println(name.length());
		System.out.println("Total characters in your first and last name is: " + name.length());

	}

}
