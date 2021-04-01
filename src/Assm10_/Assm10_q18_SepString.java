package Assm10_;

public class Assm10_q18_SepString {

	public static void main(String[] args) {
		// Given two strings, word and a separator sep, return a big string made of
		// count occurrences of the word, separated by the separator string.

		String str = "Word";
		String sep = "+";
		int count = 3;
		
		for(int i=1; i<=count; i++) {
			if(i!=count) {
				System.out.print(str+sep);
			}else {
				System.out.print(str);
			}
		}

	}

}
