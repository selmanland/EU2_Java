package Assm11_;

public class Assm11_q33_PrintFirstLast {

	public static void main(String[] args) {
//		Given a String array words, iterate through each word and print 
//		the first and the last letter of each element in separate lines.

		String[] word = {"hello", "why", "by", "apple", "note"};
		
		printFirstLast(word);
		
		
	}
	public static void printFirstLast(String[] str) {
		
		String strNew = "";
		
		for(int i=0; i<str.length; i++) {			
			strNew = str[i].substring(0, 1).concat(str[i].substring(str[i].length()-1, str[i].length()));
			System.out.println(strNew);
		}
		
	}

}
