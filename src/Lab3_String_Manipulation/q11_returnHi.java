package Lab3_String_Manipulation;

public class q11_returnHi {

	public static void main(String[] args) {
		// q11 return number of times Hi anywhere in the given String

		String countHi = "abc hi hi hi ho hi";

		int counter = 0;

		for (int i = 0; i < countHi.length() - 1; i++) {

			if (countHi.substring(i, i + 2).equals("hi")) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}