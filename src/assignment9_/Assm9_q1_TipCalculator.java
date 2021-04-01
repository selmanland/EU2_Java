package assignment9_;

import java.util.Scanner;

public class Assm9_q1_TipCalculator {

	public static void main(String[] args) {
		// Create a method called tipCalculator which accepts parameters: boolean
		// isSplit, int numberPeople, double checkAmount, String serviceQuality
		// Ask the user to enter each value.

		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		System.out.println("Split or No Split ? Y = Yes , N = No");
		String answer = scn.nextLine();

		System.out.println("Number of people ? ");
		int numberPeople = scn.nextInt();

		System.out.println("Check amount ? ");
		double checkAmount = scn.nextDouble();

		System.out.println("Service Quality ? (1=Poor=5%, 2=Fair=10%, 3=Good=15%, 4=Great=20%, 5=Excellent=25%) ");
		int serviceQuality = scn.nextInt();

		double totalTip = checkAmount * tip(serviceQuality);
		double total = checkAmount + totalTip;

		if (answer.equalsIgnoreCase("y")) {
			System.out.println("Number of people entered: " + numberPeople);
			System.out.println("Total to pay: " + total);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total perPerson: " + total / numberPeople);
			System.out.println("Tip per person: " + totalTip / numberPeople);

		} else if (answer.equalsIgnoreCase("n")) {
			System.out.println("Total to pay: " + total);
			System.out.println("Total tip: " + totalTip);
		}
	}

	public static double tip(int serviceQuality) {

		if (serviceQuality == 1) {
			return 0.05;
		} else if (serviceQuality == 2) {
			return 0.1;
		} else if (serviceQuality == 3) {
			return 0.15;
		} else if (serviceQuality == 4) {
			return 0.20;
		} else if (serviceQuality == 5) {
			return 0.25;
		} else {
			return 0.25;
		}
	}
}