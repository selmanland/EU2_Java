package assignment9_;

public class Assm9_q8_Alejandro {

	public static void main(String[] args) {

//		Alejandro have started learning java, he knows what you know about ifs and strings. 
//		He has a large number of text emails, going through all of them will take a lot of time. 
//		To save time he will only read the emails that refer to him by name. 
//		He wants to write a program that gets a string (the email) and determines 
//		if his name "Alejandro" appears in that string. if so it will output "read this mail" 
//		else it will output "don't read".

		String str = "dear friend AlEjandro a lot of text";

		readOrNot(str);

	}

	public static void readOrNot(String sentence) {

		boolean flag = false;

		String[] arr = sentence.split(" ");

		for (String word : arr) {
			if (word.equalsIgnoreCase("alejandro")) {
				flag = true;
				break;
			} else {
				flag = false;
			}

		}
		if (flag == true) {
			System.out.println("READ this email");
		} else {
			System.out.println("Don't read this email");
		}
	}
}
