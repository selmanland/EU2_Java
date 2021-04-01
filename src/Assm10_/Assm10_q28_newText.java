package Assm10_;

public class Assm10_q28_newText {

	public static void main(String[] args) {
//		This method gets two strings (text and badWord) and returns a string. 
//		Basically what it does is take out all the occurrences of badWord in text.

		String text = "he said bla bla bla";
		String badWord = "bla";
		
		System.out.println(newString(text, badWord));

	}

	public static String newString(String text, String badWord) {

		String dummy = "";

		String[] arr1 = text.split(" ");		

		for (String each : arr1) {
			if (!each.equals(badWord)) {
				dummy += each +" ";
			}
		}
		
		return dummy;
	}

}
