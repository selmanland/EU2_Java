package day4_arithmeticOperators;

public class wages {

	public static void main(String[] args) {
		// This program calculates hourly wages plus overtime
		
		double regularWage; //The calculated regular wage
		double basePay=25.75; //The base pay
		double regularHours=40; //The hours worked less overtime
		double overtimeWages; //Overtime wages
		double overTimePay=37.5; //Overtime Pay rate
		double overTimeHours=15;
		double totalWage; //Total Wage
		
		regularWage= basePay * regularHours;
		overtimeWages= overTimePay * overTimeHours;
		
		totalWage= regularWage + overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
		int a = 9, b = 0, c = a/b;
		System.out.println(c*b);
	}

}
