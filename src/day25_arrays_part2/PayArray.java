package day25_arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		// this program stores in an array the hours worked for by 5 employees who all make
		//the same hourly wage and display their gross pay
		
		Scanner sc = new Scanner(System.in); //Create scanner object for input
		
		double payRate;			// payRate per hour
		double grossPay;		// gross pay amount
		int employees = 5;		// employee number
		
		int [] hoursWork = new int [employees];		// create array for employees work hours
		
		System.out.println("Enter work hours of employees one by one please : "); //get hours worked for each employee
		
		for(int i=0; i<employees; i++) {		//getting work hours by loop
			hoursWork[i]= sc.nextInt();
		}
		System.out.println("enter the hourly rate for work please: ");	//get the hourly pay rate
		payRate = sc.nextDouble();
		
		for(int i=0; i<employees; i++) {		// display each employees gross pay
			grossPay = hoursWork[i]*payRate;
			
			System.out.println("employee #" + (i+1) + " : $ " + grossPay);
		}

	}

}
