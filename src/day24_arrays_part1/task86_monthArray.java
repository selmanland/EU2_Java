package day24_arrays_part1;

import java.util.Scanner;

public class task86_monthArray {

	public static void main(String[] args) {
				
		String month [] = new String [12];
		month[0]="January";
		month[1]="February";
		month[2]="March";
		month[3]="April";
		month[4]="May";
		month[5]="June";
		month[6]="July";
		month[7]="August";
		month[8]="September";
		month[9]="October";
		month[10]="November";
		month[11]="December";
				
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number to get month name between 1 to 12 : ");
		int user = scn.nextInt();
		
		System.out.println("The month is " + month[user-1]);
	}

}
