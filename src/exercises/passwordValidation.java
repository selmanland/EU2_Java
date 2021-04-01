package exercises;

public class passwordValidation {

	public static void main(String[] args) {

//		Write a program that takes in a string as input and evaluates it as a valid password. 
//		The password is valid if it has at a minimum 2 numbers, 2 of the following special characters 
//		('!', '@', '#', '$', '%', '&', '*'), and a length of at least 7 characters.
//		If the password passes the check, output 'Strong', else output 'Weak'.

		passwordCheck("!!!Hello@$$!!World123");
	}

	public static void passwordCheck(String str) {

		int countChars = 0;
		int countNums = 0;

		if (str.length() < 7) {
			System.out.println("Invalid password. Your password should be at least 7 characters");

		} else {
			for (int i = 0; i < str.length(); i++) {

				if (Character.isDigit(str.charAt(i))) {
					countNums++;
				}
			}
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == '!' || str.charAt(i) == '@' || str.charAt(i) == '#' || str.charAt(i) == '$'
						|| str.charAt(i) == '%' || str.charAt(i) == '&' || str.charAt(i) == '*') {
					countChars++;
				}
			}
			if (countChars >= 2 && countNums >= 2) {
				System.out.println("Strong");
			} else {
				System.out.println("Weak");
			}
			System.out.println(countNums);
			System.out.println(countChars);
		}

	}
}