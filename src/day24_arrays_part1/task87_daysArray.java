package day24_arrays_part1;

import java.util.Scanner;

public class task87_daysArray {

	public static void main(String[] args) {		
		
		String days [] = new String [7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a day index from 1 to 7: ");
		int user = sc.nextInt();
		
		System.out.println("Today is " + days[user-1]);

	}

}
