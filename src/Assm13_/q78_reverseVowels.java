package Assm13_;

public class q78_reverseVowels {

	public static void main(String[] args) {
//		Reverse a vowels of string without affecting any other characters. Write a method 
//		reverseVowels() that will return a string with reversed vowels.

		String word = "Hello World";

		System.out.println(reverseVowels(word));
	}

	public static String reverseVowels(String str) {

		int count = 0;
		char[] ch = str.toCharArray(); // to store vowels separately
		String vowels = "";

		for (int i = 0; i < str.length(); i++) {

			if (isVowel(ch[i])) {
				count++;
				vowels += ch[i];

			}
		}

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (isVowel(ch[i])) {
				ch[i] = vowels.charAt(--count);
				newStr += ch[i];
			} else {
				newStr += ch[i];
			}
		}
		return newStr;

	}

	public static boolean isVowel(char c) {
		return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
				|| c == 'U');
	}

}
