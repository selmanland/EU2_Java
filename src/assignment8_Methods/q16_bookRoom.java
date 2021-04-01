package assignment8_Methods;

import java.util.Scanner;

public class q16_bookRoom {

	public static void main(String[] args) {
		// q16 Book Room

		boolean b = simpleRoomBook(false);
		System.out.println(b);
	}

	public static boolean simpleRoomBook(boolean flag) {

		Scanner user_input = new Scanner(System.in);

		System.out.println("Enter true or false for reservation: ");
		flag = user_input.nextBoolean();

		System.out.println("Enter reservation Date as MONTH: ");
		int resMonth = user_input.nextInt();

		System.out.println("Enter reservation as DAY: ");
		int resDay = user_input.nextInt();

		if (flag == false) {
			return false;
		} else if (flag == true && resMonth == 7 && resDay >=1 && resDay <= 8) {
			return false;
		} else {
			return true;
		}

	}

}
