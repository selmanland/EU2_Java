package Assm13_;

import java.util.ArrayList;

public class exc {

	public static void main(String[] args) {

		ArrayList<Integer> delivery = new ArrayList<Integer>();
		delivery.add(9);
		delivery.add(1);

		int tank = 3;

		System.out.println(refuel_times(delivery, tank));

	}

	public static int refuel_times(ArrayList<Integer> delivery, int tank) {
		double sum = 0;
		double fuelfill = 0;

		for (int i = 0; i < delivery.size(); i++) {
			sum += delivery.get(i);
		}
		fuelfill = sum / tank;

		if (sum % tank > 0) {
			return (int) (fuelfill + 1);
		} else {
			return (int) fuelfill;
		}

	}

}
