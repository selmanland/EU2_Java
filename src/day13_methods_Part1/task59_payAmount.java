package day13_methods_Part1;

public class task59_payAmount {

	public static void main(String[] args) {

		payTotal(10, 20);
		payTotal(20, 20);
		payTotal(30, 20);

	}

	private static void payTotal(int numHour, int payHour) {
		int payAmount = numHour * payHour;
		System.out.println("Number of hours worked is " + numHour);
		System.out.println("Total pay amount is $" + payAmount);

	}

}
