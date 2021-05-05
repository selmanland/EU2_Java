package Assm10_;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(false, 2, 1, 2018));

	}

	public static boolean simpleRoomBook(boolean availbility, int month, int day, int year) {

		if (year == 2018) {

			if (availbility == true) {

				if (month == 7 && (day >= 1 && day <= 8)) {
					return false;
				} else {
					return true;
				}

			} else {
				return false;
			}

		} else {
			return false;
		}


	}

}
