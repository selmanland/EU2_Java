package Assm10_;

public class Assm10_q21_prefixString {

	public static void main(String[] args) {
		// Given a string, consider the prefix string made of the first n chars of the string.
		// Does that prefix string appear somewhere else in the string?
		// Assume that the string is not empty and that n is in the range from 1 till str.length().

		String str = "abXYabc";
		int howMany = 2;
		int count = 0;
		
		for(int i=0; i<str.length()-howMany+1; i++) {
			if(str.substring(i, i+howMany).equals(str.substring(0, howMany))) {
				count++;
			}
		}
		if(count == howMany) {
			System.out.println(true);
			System.out.println(str.substring(0, howMany) + " appears " + count);
		}else {
			System.out.println(false);
			System.out.println(str.substring(0, howMany) + " appears " + count);
		}
		
		
	}

}
