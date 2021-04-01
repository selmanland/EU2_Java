package exercises;

import java.util.Scanner;

public class neew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double premium = 0;
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter Your Name");
		String name = scn.nextLine();
		System.out.println("Do you have a US driver license? 1 = yes or 2 = no");
		int license = scn.nextInt();
			if(license == 2) {
				System.out.println("Invalid data!" );
				System.exit(0);
			}else {
				System.out.println("Enter a zip code" );
			}
		int zipCode = scn.nextInt();
			if(zipCode == 20910 || zipCode == 20740) {
				premium = premium + 60;
			}else if (zipCode == 22102 || zipCode == 22103) {
				premium = premium + 30;
			}else {
				premium = premium + 50;
		}
		System.out.println("Is this vehicle Owned, Financed, or Leased?");			
		String ownerShip = scn.nextLine();
			if(ownerShip == "Owned") {
				premium = premium + 10;
			}else {
				premium = premium + 20;
					System.out.println();
		}
		System.out.println("How is this vehicle primarily used? Business, Pleasure or Commute");
		String primarily = scn.nextLine();
			if(primarily == "Business") {
				premium = premium + 50;
			}else if (primarily == "pleasure") {
				premium = premium + 30;
			}else {
				premium = premium + 20;
		}
		System.out.println("Days Driven To Work And/Or School");
		int days = scn.nextInt();
			premium = premium + days*5;		
		System.out.println("Miles Driven To Work And/Or School");
		int miles = scn.nextInt();
			premium = premium + miles*1;		
		System.out.println("How old are you?");
		int age = scn.nextInt();
			if(age < 16 ) {
				System.out.println("Invalid data!" );
				System.exit(0);	
			}else if (age >= 16 && age < 18) {
			premium = premium + 20;
			}else if (age >= 18 && age < 21) {
				premium = premium + 6;
			}else if (age >= 21 && age < 25) {
				premium = premium + 2;
			}
		System.out.println("driving experience (year)");
		int experience = scn.nextInt();
			if(experience > 0 && age >= 16) {
				premium = premium - experience*5;
			}else {
				System.out.println("Invalid data!" );
				System.exit(0);	
			}
		System.out.println("Have you had any accidents in the last 5 years?");
			String accidents = scn.nextLine();			
			if(accidents == "Yes") {
				System.out.println("How many?");	
				int manyaccidents = scn.nextInt();
				premium = premium + manyaccidents * 0.20;
			}else {
				System.out.println();
			}
		System.out.println("Have you had continuous insurance for the past 12 months?");
			String insurance = scn.nextLine();			
			if(insurance == "NO") {
				premium = premium + premium * 2;
			}	
		System.out.println("What is the highest level of education you have completed?");
			String education = scn.nextLine();		
			if(education == "Ph.D."){
				premium = premium - premium * 0.05;
			}else if(education == "Bachelors"){
				premium = premium - premium * 0.05;
			}else if(education == "Masters"){
				premium = premium - premium * 0.05;
			}else if(education == "Doctors"){
				premium = premium - premium * 0.10;
			}else if(education == "Less than High School"){
				premium = premium + premium * 0.05;
			}	
			System.out.println(name + "here's your quote!");
			System.out.println("Start Your Policy Today For: " + premium);
			System.out.println("Reference number: DA25ID20910PHD");
		
	}

}
