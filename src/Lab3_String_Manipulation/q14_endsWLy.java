package Lab3_String_Manipulation;

public class q14_endsWLy {

	public static void main(String[] args) {
		// q14 return true if it ends in "ly"

		String str = "Odsly";

		if (str.length() < 2) {
			System.out.println(false);
			return;
		} else if (str.substring(str.length() - 2).equals("ly")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
