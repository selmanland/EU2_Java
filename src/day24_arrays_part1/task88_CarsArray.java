package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class task88_CarsArray {

	public static void main(String[] args) {

		String cars[] = new String[7];
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrari";

		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.print("please enter a number (from 1 to 7) to choose your dream car : ");
		int user = scn.nextInt();
		int price = 0;

		if (user == 1 || user == 2 || user == 3) {
			price = rnd.nextInt((40000 - 20000) + 1) + 20000;
			System.out.println("The price for your dream car is " + price);
		} else if (user == 4 || user == 5) {
			price = rnd.nextInt((80000 - 50000) + 1) + 50000;
			System.out.println("The price for your dream car is " + price);
		} else if (user == 6 || user == 7) {
			price = rnd.nextInt((150000 - 100000) + 1) + 100000;
			System.out.println("The price for your dream car is " + price);
		} else {
			System.out.println("Please try again");
		}

	}

}
