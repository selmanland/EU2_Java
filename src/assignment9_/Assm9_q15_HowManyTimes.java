package assignment9_;

public class Assm9_q15_HowManyTimes {

	public static void main(String[] args) {
		// Print true if the string "cat" and "dog" appear the same number of times in
		// the given string word.

		String str = "cat-cheetah-dog cat";

		boolean flag;

		int countCat = 0;
		int countDog = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
				countCat++;
			}
			if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
				countDog++;
			}
		}

		if (countCat == countDog) {
			flag = true;
		} else {
			flag = false;
		}

		System.out.println(flag);
		System.out.println("Cat number " + countCat);
		System.out.println("Dog number " + countDog);

	}

}
