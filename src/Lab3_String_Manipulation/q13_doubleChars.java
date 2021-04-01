package Lab3_String_Manipulation;

public class q13_doubleChars {

	public static void main(String[] args) {

		String str = "Cybertek";
		// String newS = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(str.charAt(i));
			}
			// for(int j=0; j<str.length(); j++) {
			// newS = newS + str.substring(j, j+1).concat(str.substring(j, j+1));

			// }
			// System.out.print(newS);
		}

	}
}