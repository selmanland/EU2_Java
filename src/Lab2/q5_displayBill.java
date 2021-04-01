package Lab2;

import java.util.Scanner;

public class q5_displayBill {

	public static void main(String[] args) {
		// q5 display bill tip charge tax all

		displayBill();

	}

	public static void displayBill() {

		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter your meal charge amount: ");
		double chargeMeal = user_input.nextDouble();

		double tax = chargeMeal * 6.75 / 100;
		double tip = ((chargeMeal + tax) * 20) / 100;
		double total = chargeMeal + tax + tip;

		System.out.println("Meal Charge is : $ " + chargeMeal);
		System.out.println("Tax is : " + tax);
		System.out.println("Tip amount is : $ " + tip);
		System.out.println("Total Bill is : $ " + total);

	}

}
