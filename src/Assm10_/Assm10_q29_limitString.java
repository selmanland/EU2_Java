package Assm10_;

public class Assm10_q29_limitString {

	public static void main(String[] args) {
//		This method gets a string and an int, it returns a string. What it does is 
//		to limit the inputted string to a creating number of characters.

		String method = limit("bla bla", 3);
		System.out.println(method);
		
	}
	public static String limit(String str, int num) {
		
		String newStr = str.substring(0, num);
		
		return newStr;
	}

}
