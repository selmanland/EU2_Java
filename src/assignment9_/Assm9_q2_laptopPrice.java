package assignment9_;

import java.util.Scanner;

public class Assm9_q2_laptopPrice {

	public static void main(String[] args) {
		// Write a program that will calculate laptop price based on the components.
		
		int screenSize;
		int cpu;
		double price = 0;
		int RAM;
		int storType;
		int storSize;
		int resolution;
		
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter screen size please: 1=13.3 or 2=15.0 or 3=17.3");
		screenSize = scn.nextInt();
		
		if(screenSize == 1) {
			price += 200;
		}else if(screenSize == 2) {
			price += 300;
		}else if(screenSize == 3) {
			price += 400;
		}else {
			System.out.println("invalid entry");
		}
		
		System.out.println("Enter for CPU type please: 1=i3 or 2=i5 or 3=i7");
		cpu = scn.nextInt();
		
		if(cpu == 1) {
			price += 150;
		}else if(cpu == 2) {
			price += 250;
		}else if(cpu == 3) {
			price += 350;
		}else {
			System.out.println("invalid entry");
		}
		
		System.out.println("Enter RAM size please: 4 or 8 or 12 or 16");
		RAM = scn.nextInt();
		
		if(RAM == 4) {
			price += 50;
		}else if(RAM == 8) {
			price +=100;
		}else if(RAM == 12) {
			price +=150;
		}else if(RAM == 16) {
			price +=200;
		}
		
		System.out.println("Enter storage type please: 1=SSD or 2=HDD");
		storType = scn.nextInt();
		
		if(storType == 1) {
			System.out.println("Enter memory size please : 500 or 1000 or 1500 or 2000");
			storSize = scn.nextInt();
			
			if(storSize == 500) {
				price += 100;
			}if(storSize == 1000) {
				price += 200;
			}if(storSize == 1500) {
				price += 300;
			}if(storSize == 2000) {
				price += 400;
			}
		}
		if(storType == 2) {
			System.out.println("Enter memory size please : 500 or 1000 or 1500 or 2000");
			storSize = scn.nextInt();
			
			if(storSize == 500) {
				price += 50;
			}if(storSize == 1000) {
				price += 100;
			}if(storSize == 1500) {
				price += 150;
			}if(storSize == 2000) {
				price += 200;
			}
		}
		
		System.out.println("Enter Screen Resolution please: 1=FULLHD or 2=4K");
		resolution = scn.nextInt();
		
		if(resolution == 1) {
			price += 100;
		}else if(resolution == 2) {
			price += 200;
		}
		System.out.println("Laptop price is $" + price);
		
	}

}
