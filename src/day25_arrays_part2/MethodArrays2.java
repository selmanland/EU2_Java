package day25_arrays_part2;

import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {
		//
		System.out.println(findCar(3, "Honda")); // true

	}
	// createArray method - will accept one parameter which is arraySize
	// user will enter some cars

	public static String[] createArray(int arraySize) {

		Scanner sc = new Scanner(System.in);
		String[] carArray = new String[arraySize];

		for (int i = 0; i < carArray.length; i++) {

			System.out.println("Enter your car #" + (i + 1));
			carArray[i] = sc.next();
		}

		return carArray;
	}

	// findCar method - will accept 2 parameters which 1- int value, toFindCar
	// if car is found - return true
	// if not return false

	public static boolean findCar(int value, String toFindCar) {

		for (String car : createArray(value)) {

			if (car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
		}
		return false;
	}

}
