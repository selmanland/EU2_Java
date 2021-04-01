package day26_arrays_part3;

import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {
		// createArray method - will accept one parameter which is carSize
		// user will enter some cars
		// findCar method - will accept 2 parameters which is 1-int value, to FindCar
		// if car is found -return true if not return false

		System.out.println(findCar(4, "Honda"));

	}

	public static boolean findCar(int value, String toFindCar) {

		for (String car : createArray(value)) {		// to check array to see if the car we are looking for is there
			if (car.equalsIgnoreCase(toFindCar)) {	// to check each array element
				return true;

			}
		}
		return false;
	}

	public static String[] createArray(int carSize) {

		Scanner sc = new Scanner(System.in);

		String[] carMake = new String[carSize]; // declare and instantiate array

		for (int i = 0; i < carMake.length; i++) {
			System.out.print("please enter car #" + (i+1) + " : "); // ask user array elements (car makes)
			carMake[i] = sc.next(); // assign car names to array carMake

		}
		return carMake;
	}
}
