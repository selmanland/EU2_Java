package assignment9_;

public class Assm9_q9_SwapFirstLastName {

	public static void main(String[] args) {
//		in this task, you need to swap the first name with the last name in the email. 
//		if the email doesn't contain underscore - do not anything.

		String email = "h_iltas@yahoo.com";

		reverseLastFirst(email);

	}

	public static void reverseLastFirst(String email) {
		String underScoreCheck = email.substring(0, email.indexOf("@"));
		if (!underScoreCheck.contains("_")) {
			System.out.println(email);
		} else {

			String emailLast = email.substring(email.indexOf("@"), email.length());
																// System.out.println(emailLast);

			String first = email.substring(0, email.indexOf("_"));
																// System.out.println(first);
			String last = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
																// System.out.println(last);

			String newEmail = last + "_" + first + emailLast;
			System.out.println(newEmail);
		}
	}
}