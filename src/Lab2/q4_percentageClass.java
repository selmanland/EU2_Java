package Lab2;

import java.util.Scanner;

public class q4_percentageClass {

	public static void main(String[] args) {
		// q4 percentage class males and females

		percentageClass();

	}

	public static void percentageClass() {

		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter number of males in your class");
		double perMales = user_input.nextDouble();

		System.out.println("Enter number of females in your class");
		double perFemales = user_input.nextDouble();

		System.out
				.println("Percentage of males in your class is : " + (perMales / (perMales + perFemales)) * 100 + "%");
		System.out.println(
				"Percentage of females in your class is : " + (perFemales / (perMales + perFemales)) * 100 + "%");
	}

}
