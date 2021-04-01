package Lab2;

import java.util.Scanner;

public class q1_LoopForSmallestAndLargestNumber {

	public static void main(String[] args) {

		displayNumbers();

	}

	public static void displayNumbers() {
		int smallest = 0;
		int largest = 0;
		int num;
		int loop = 0;

		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		num = user_input.nextInt();
		smallest = num;

		do {
			Scanner user_input2 = new Scanner(System.in);
			System.out.print("Enter your next number: ");
			num = user_input2.nextInt();
			Scanner user_input3 = new Scanner(System.in);
			System.out.println("Do you want to enter another number:  0-No, 1-Yes  : ");
			int choice = user_input3.nextInt();
			if (num > largest) {
				largest = num;
			} else {
				smallest = num;
			}

			if (choice == 0) {
				break;

			} else {

				loop++;
			}
		} while (true);

		System.out.println("The largest is: " + largest);
		System.out.println("The smallest is: " + smallest);
	}

}
