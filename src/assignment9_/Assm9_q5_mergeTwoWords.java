package assignment9_;

public class Assm9_q5_mergeTwoWords {

	public static void main(String[] args) {
//		You have 2 words, both of them have 3 characters. if either of them does not 
//		have exactly 3 characters, print "cannot merge" Merge their characters one by one and print together

		String str1 = "aok";
		String str2 = "lol";

		if (str1.length() != 3 || str2.length() != 3) {
			System.out.println("cannot merge");
		} else {
			String strNew = "";
			for (int i = 0; i < 3; i++) {
				strNew = strNew + str1.charAt(i) + str2.charAt(i);								
			}
			System.out.println(strNew);
		}

	}

}
