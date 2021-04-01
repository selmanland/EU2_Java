package day25_arrays_part2;

import java.util.Scanner;

public class task_RainFallArray_alternativeSolution {

	public static void main(String[] args) {
		// Write a RainFall class that stores the total rainfall for each of 12 months
				// into an array of
				// doubles. The program should have methods that return the following:
//				- total rainfall for the year
//				- the average monthly rainfall
//				- the month with the most rain
//				- the month with the least rain
				
	
		Scanner scan = new Scanner(System.in);
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		double[] monthRain = new double[12];

		System.out.println("Please Enter Following Rainfall for the Months Ahead: ");
		System.out.printf("%-11s %-15s\n", "Month", "Rainfall(in inches)");

		for (int i = 0; i < months.length; i++) {
			System.out.printf("%-9s : ", months[i]);
			monthRain[i] = scan.nextDouble();
			
			while (monthRain[i] < 0.) {
				System.out.println("Invalid value! Value must be positive!!");
				System.out.printf("%-9s : ", months[i]);
				monthRain[i] = scan.nextDouble();
			}
		}

		System.out.println("------------------------------------------");
		System.out.printf("The sum of the rain         : %5.2f inches \n", sumRain(monthRain));
		System.out.printf("The Avarage of the rainfall : %5.2f inches \n", averageRain(monthRain));
		System.out.printf("The Max of the rain value   : %5.2f inches \n", maxRain(monthRain));
		System.out.printf("The Min of the rain value   : %5.2f inches \n", minRain(monthRain));

	}

	public static double sumRain(double[] value) {
		double sum = 0.;
		for (double index : value) {
			sum += index;
		}
		return sum;
	}

	public static double averageRain(double[] value) {
		return (sumRain(value)) / value.length;
	}

	public static double maxRain(double[] value) {
		double max = 0.;
		for (double index : value) {
			if (index > max) {
				max = index;
			}
		}
		return max;
	}

	public static double minRain(double[] value) {
		double min = value[0];
		for (double index : value) {
			if (index < min) {
				min = index;
			}
		}
		return min;

	}

}
