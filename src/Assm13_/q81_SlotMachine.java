package Assm13_;

import java.util.Random;
import java.util.Scanner;

public class q81_SlotMachine {

	public static void main(String[] args) {

		Random rn = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double TotalBalance = 10;
//		double postBetTotal = 0;
		double reward = 0;
		double amountPlay = 0;

		System.out.println("Want to play SLOTGAME ?   Y or N ");
		String play = sc.nextLine();

		do {

			if (play.equalsIgnoreCase("y")) {

				System.out.println("You have $ 10 bonus to play");
				System.out.println("Please enter the amount to play : Enter -0- to walk away...");
				amountPlay = sc.nextDouble();
//				TotalBalance -= amountPlay;
//				enterAmountTotal += enterAmountTotal;

				if (TotalBalance != 0 && amountPlay != 0) {

					int count0 = 0;
					int count1 = 0;
					int count2 = 0;
					int count3 = 0;
					int count4 = 0;
					int count5 = 0;

					for (int i = 1; i <= 3; i++) {
						int number = rn.nextInt(6);

						if (number == 0) {
							System.out.println("CHERRIES");
							count0++;
						} else if (number == 1) {
							System.out.println("ORANGES");
							count1++;
						} else if (number == 2) {
							System.out.println("PLUMS");
							count2++;
						} else if (number == 3) {
							System.out.println("BELLS");
							count3++;
						} else if (number == 4) {
							System.out.println("MELONS");
							count4++;
						} else if (number == 5) {
							System.out.println("BARS");
							count5++;
						}
					}

					if (count0 == 2 || count1 == 2 || count2 == 2 || count3 == 2 || count4 == 2 || count5 == 2) {
						reward = amountPlay * 2;
						TotalBalance += reward;
						System.out.println("You won TWO times you entered. Your balance : $" + TotalBalance);
					} else if (count0 == 3 || count1 == 3 || count2 == 3 || count3 == 3 || count4 == 3 || count5 == 3) {
						reward = amountPlay * 3;
						TotalBalance += reward;
						System.out.println("You won THREE times you entered. Your balance : $" + TotalBalance);
					} else {
						System.out.println("You won NOTHING");
						TotalBalance -= amountPlay;
						System.out.println("Your balance is $" + TotalBalance);
					}
				}
			}

		} while (amountPlay != 0 && TotalBalance > 0);

		System.out.println("Your total reward is $" + reward);
		System.out.println("Your balance is $" + TotalBalance);
		System.out.println("HAVE A NICE DAY");
	}
}