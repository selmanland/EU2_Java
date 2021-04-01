package day19_stringManipulation_part1;

public class String_CharAt {

	public static void main(String[] args) {


		String word = "Computer";
		System.out.println(word.length());
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8)); compiler gives error
		
		String word2 = "Apple";// check if first character is 'A'
		System.out.println(word.charAt(0));
		if(word2.charAt(0)=='A') {
			System.out.println("A is the first character");
		}else {
			System.out.println(word2.charAt(0) + " is the first character");
		}
		
		String word3 = "iltas";
		if(word3.charAt(0) == word3.charAt(4)) {
			System.out.print(true);
			System.out.println(" The first and the last characters are " + word3.charAt(0) + " and " + word3.charAt(4));
		}else {
			System.out.print(false);
			System.out.println(" The first and the last characters are " + word3.charAt(0) + " and " + word3.charAt(4));
		}
		// last index not hard coded
		String word4 = "halim";
		if(word4.charAt(0) == word4.charAt(word4.length()-1)) {
			System.out.print(true);
			System.out.println(" The first and the last characters are " + word4.charAt(0) + " and " + word4.charAt(word4.length()-1));
		}else {
			System.out.print(false);
			System.out.println(" The first and the last characters of " + word4 + " is " + word4.charAt(0) + " and " + word4.charAt(word4.length()-1));
		}

	}

}
