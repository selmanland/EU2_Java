package assignment9_;

public class Assm9_q10_printUpperCase {

	public static void main(String[] args) {
		// Write a program that will print out information about the user based on
		// email.
		// Print first and last name from the upper case.

		String email = "h_iltas@yahoo.com";

		userInfo(email);

	}

	public static void userInfo(String str) {

		String first = str.substring(0, str.indexOf("_"));
		first = first.substring(0, 1).toUpperCase() + first.substring(1);
		// System.out.println(first);

		String last = str.substring(str.indexOf("_") + 1, str.indexOf("@"));
		last = last.substring(0, 1).toUpperCase() + last.substring(1);
		// System.out.println(last);

		String domain = str.substring(str.indexOf("@") + 1, str.indexOf("."));
		// System.out.println(domain);

		String topDomain = str.substring(str.indexOf(".") + 1, str.length());
		// System.out.println(topDomain);

		System.out.println("First name: " + first);
		System.out.println("Last name: " + last);
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topDomain);

	}

}
