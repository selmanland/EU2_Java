package Lab3_String_Manipulation;

public class q15_ifBadStarts {

	public static void main(String[] args) {
		// given a string, return true if bad starts with index no 0 or 1

		String str = "xbad";

		if (str.length() < 3) {
			System.out.println(false);			
		} else if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
