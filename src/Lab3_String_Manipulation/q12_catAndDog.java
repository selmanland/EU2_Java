package Lab3_String_Manipulation;

public class q12_catAndDog {

	public static void main(String[] args) {
		// q12 cat and dog

		String catDog = "CaTdogdOgCat";
		int countCat = 0;
		int countDog = 0;

		for (int i = 0; i < catDog.length() - 2; i++) {

			if (catDog.substring(i, i + 3).equalsIgnoreCase("cat")) {
				countCat++;
			} else if (catDog.substring(i, i + 3).equalsIgnoreCase("dog")) {
				countDog++;
			}
		}
		if (countCat == countDog) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
