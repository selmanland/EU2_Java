package assignment9_;

import java.util.Scanner;

public class Assm9_q14_CarInsurancePremium {

	public static void main(String[] args) {

		double quote = 0;

		System.out.println("Welcome to the CountyFarm car insurance!");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name :");
		String name = sc.nextLine();

		System.out.println("Do you have a US driver license? Y = Yes   N = No");
		String license = sc.nextLine();
		if (license.equalsIgnoreCase("n")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		System.out.println("Enter your zip code");
		String zip = sc.nextLine();
		if (zip.equals("22102") || zip.equals("22103")) {
			quote += 30;
		} else {
			quote += 50;

		}

		System.out.println("Is this vehicle Owned, Financed, or Leased?  O = Owned   F = Financed   L = Leased");
		String carOwnership = sc.nextLine();
		if (carOwnership.equalsIgnoreCase("o")) {
			quote += 10;
		} else {
			quote += 20;
		}

		System.out.println("How is this vehicle primarily used? B=Business   P=Pleasure   C=Commute");
		String carUse = sc.nextLine();
		if (carUse.equalsIgnoreCase("b")) {
			quote += 50;
		} else if (carUse.equalsIgnoreCase("p")) {
			quote += 10;
		} else {
			quote += 20;
		}

		System.out.println("Days Driven to Work and/or School:");
		int daysUse = sc.nextInt();
		if (daysUse > 0) {
			quote = quote + (daysUse * 5);
		}

		System.out.println("Miles Driven to Work and/or School?");
		int milesDriven = sc.nextInt();
		if (milesDriven > 0) {
			quote = quote + (milesDriven * 1);
		}

		System.out.println("How old are you?");
		int age = sc.nextInt();
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (age >= 16 && age < 18) {
			quote *= 20;
		} else if (age >= 18 && age < 21) {
			quote *= 6;
		} else if (age >= 21 && age < 25) {
			quote *= 2;
		}

		System.out.println("How many years you've been driving?");
		int yearsDrive = sc.nextInt();
		sc.nextLine();
		if (yearsDrive > 0 && age - yearsDrive >= 16) {
			quote = quote - (yearsDrive * 5);
		} else {
			System.out.println("Invalid data!");
			System.exit(0);
		}

		System.out.println("Have you had any accidents in the last 5 years?  Y=Yes  N=No");
		String accident = sc.nextLine();
		
		if (accident.equalsIgnoreCase("y")) {
			System.out.println("How many? ");
			int many = sc.nextInt();
			sc.nextLine();
			quote = quote + (many * 0.20);
		}

		System.out.println("Have you had continuous insurance for the last 12 months?  Y=Yes  N=No");
		String insurance = sc.nextLine();

		if (insurance.equalsIgnoreCase("n")) {
			quote = quote + (quote * 2);
		}

		System.out.println("What is the highest level of education you have completed?");
		System.out.println(
				"\t for PhD, Bachelors or Masters press \"1\"   for Doctors press \"2\"   for High School or Less press \"3\"");
		String education = sc.nextLine();

		if (education.equals("1")) {
			quote = quote - (quote * 0.05);
		} else if (education.equals("2")) {
			quote = quote - (quote * 0.1);
		} else if (education.equals("3")) {
			quote = quote + (quote * 0.05);
		}

		System.out.println("Dear " + name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + quote);
	}

}
