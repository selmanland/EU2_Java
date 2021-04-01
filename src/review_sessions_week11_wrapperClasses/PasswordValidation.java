package review_sessions_week11_wrapperClasses;

public class PasswordValidation {

	public static void main(String[] args) {

		/*
		 * Task : Write a return method that can verify if a password is valid or not.
		 * Requirements: 1.Password MUST be at least have 6 characters and should not
		 * contain space 2.Password should at least contain one upper case letter
		 * 3.Password should at least contain one lower case letter 4.Password should at
		 * least contain one special character 5.Password should at least contain one
		 * digit
		 * 
		 * if all requirements above are met, the method returns true, otherwise returns
		 * false
		 */

		String word = "Apple123#$";
		System.out.println(validatePassword(word));

	}

	public static String validatePassword(String str) {

		boolean length = false;
		boolean space = true;
		boolean lower = false;
		boolean upper = false;
		boolean digit = false;
		boolean special = false;

		if (str.length() >= 6) {
			length = true;
		}

		for (int i = 0; i < str.length(); i++) {
			if (Character.isSpaceChar(str.charAt(i))) {
				space = false;
				break;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				upper = true;
				break;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				lower = true;
				break;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digit = true;
				break;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isSpaceChar(str.charAt(i))) {
				special = true;
				break;
			}
		}

		if (length && space && upper && lower && digit && special) {
			return "valid";
		} else {
			return "not valid";

		}

	}
}