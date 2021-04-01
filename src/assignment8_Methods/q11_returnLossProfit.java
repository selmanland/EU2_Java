package assignment8_Methods;

import java.util.Scanner;

public class q11_returnLossProfit {

	public static void main(String[] args) {
		// q11 return Profit or Loss

		System.out.println(result());

	}

	public static String result() {

		Scanner user_input1 = new Scanner(System.in);
		System.out.print("Enter buy price: ");
		int buyPrice = user_input1.nextInt();
		Scanner user_input2 = new Scanner(System.in);
		System.out.print("Enter sell price: ");
		int sellPrice = user_input2.nextInt();

		if (buyPrice < sellPrice) {
			return "profit";
		} else if (buyPrice > sellPrice) {
			return "loss";
		} else {
			return "no loss";
		}
		
		
		
	}

}
