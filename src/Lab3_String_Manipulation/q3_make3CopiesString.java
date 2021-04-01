package Lab3_String_Manipulation;

public class q3_make3CopiesString {

	public static void main(String[] args) {
		// make 3 copies of a string

		String str = "HALIM";

		System.out.println(extraEnd(str));

	}

	private static String extraEnd(String lastTwo) {

		if (lastTwo.length() < 2) {

			return "Invalid String";
			
		} else {
			lastTwo = lastTwo.substring(lastTwo.length() - 2);

			int copies = 5;

			for (int i = 1; i <= copies; i++) {

				System.out.print(lastTwo);
			}

			return lastTwo;
		}

	}
}