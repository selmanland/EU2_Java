package day20_stringManipulation_part2;

import java.util.Scanner;

public class task82_loginFuncLogic {

	public static void main(String[] args) {

		String UserName = "hiltas73";
		String Password = "12345";

		Scanner user_input = new Scanner(System.in);
		System.out.print("Username : ");
		String name = user_input.nextLine();
		System.out.print("Password : ");
		String key = user_input.nextLine();

		if (name.equals("") && key.equals("")) {
			System.out.println("UserName and Password Fields cannot be empty");

		} else if (name.equals("") && !key.equals("")) {
			System.out.println("UserName cannot be empty");

		} else if (!name.equals("") && key.equals("")) {
			System.out.println("Password cannot be empty");

		} else if (!name.equals(UserName) || !key.equals(Password)) {
			System.out.println("UserName or password is NOT valid. Please verify");

		} else if (name.equals(UserName) && key.equals(Password)) {
			System.out.println("User Logged in successfully");
		}

	}

}
