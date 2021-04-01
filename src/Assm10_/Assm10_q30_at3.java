package Assm10_;

public class Assm10_q30_at3 {

	public static void main(String[] args) {
//		at3 method gets two strings and returns a string. The first string is the one that will be manipulated. 
//		At the 3rd char position of the target you will insert the word argument.

		String method = at3("blabla", "a");
		System.out.println(method);
		
	}

	public static String at3(String str1, String str2) {

		String dummy = "";
		
		dummy += str1.substring(0, 3) + str2 + str1.substring(3);
		
		
		return dummy;
	}

}
