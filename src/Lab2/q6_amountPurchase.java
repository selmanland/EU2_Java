package Lab2;

import java.util.Scanner;

public class q6_amountPurchase {

	public static void main(String[] args) {
		// q6 Amount of Purchase

		amountPurchase();

	}

	public static void amountPurchase() {

		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter amount of purchase : ");
		double amount = user_input.nextDouble();

		double stateTax = amount * 4 / 100;
		double countyTax = amount * 2 / 100;

		System.out.println("Amount of purchase is : $ " + amount);
		System.out.println("State sales tax is : $ " + stateTax);
		System.out.println("County sales tax is : $ " + countyTax);
		System.out.println("Total sales tax is : $ " + (stateTax + countyTax));
		System.out.println("Total amount of purchase is : $ " + (amount + stateTax + countyTax));

	}

}
