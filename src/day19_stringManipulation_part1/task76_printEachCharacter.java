package day19_stringManipulation_part1;

public class task76_printEachCharacter {

	public static void main(String[] args) {

		String str = "Cybertek School in the US";

		int length = str.length();

		for (int x = 0; x <= length - 1; x++) {
			System.out.print(str.charAt(x));
			System.out.print(" ");
		}

	}

}
