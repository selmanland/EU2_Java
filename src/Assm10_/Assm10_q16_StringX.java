package Assm10_;

public class Assm10_q16_StringX {

	public static void main(String[] args) {
		// Given a string word, print true if "java" appears starting at index 0 or 1 in
		// the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
		// The string should be 4 and more characters.
		
		String str = "cjavac";
		String dummy = "java";
		
		if(str.length()>=4) {
			if(str.substring(0, 4).equalsIgnoreCase(dummy) || str.substring(1, 5).equalsIgnoreCase(dummy)) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}else {
			System.out.println("Invalid word");
		}
	}

}
