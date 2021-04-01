package Assm11_;

public class Assm11_q39_email {

	public static void main(String[] args) {
//		Given a String variable email, write code using split method 
//		to print email id and domain in separate lines

		String email = "info@cybertekschool.com";

		emailSplit(email);
	}

	public static void emailSplit(String str) {

		String[] arr = new String[str.length()];
		String id = "";
		String domain = "";
		int countOf = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '@') {
				countOf++;
			}
		}
		if (countOf == 1) {
			arr = str.split("@");
			id = arr[0];
			domain = arr[1];
			System.out.println("Email id : " + id);
			System.out.println("Email domain : " + domain);

		} else {
			System.out.println("invalid email");
		}
	}
}
