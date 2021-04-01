package assignment8_Methods;

import java.util.Scanner;

public class q13_waterBill {

	public static void main(String[] args) {
		// q13 water bill

		double totalBill = calculateBill(0);
		System.out.println("Your water bill is : " + totalBill);

	}

	public static double calculateBill(double bill) {

		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter usage value: ");
		double units = user_input.nextDouble();

		if (units > 0 && units <= 50) {
			bill = units * 0.60;
		} else if (units > 50 && units <= 100) {
			bill = units * 0.90;
		} else if (units > 100 && units <= 150) {
			bill = units * 0.90 + 50;
		} else if (units > 150) {
			bill = units * 0.90 + 100;
		} else {
			System.out.println("Invalid entry");
		}
		return bill;
	}

}
