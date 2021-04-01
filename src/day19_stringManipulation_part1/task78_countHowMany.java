package day19_stringManipulation_part1;

public class task78_countHowMany {

	public static void main(String[] args) {

		String word = "abcabqcabc"; // Output should be "Number of a in this string is : 3

		int loop = 0;
		char myChar = 'a';

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == myChar) {
				loop += 1;

			}
		}
		System.out.println("Number of \"" + myChar + "\" in this string is : " + loop);
	}

}
