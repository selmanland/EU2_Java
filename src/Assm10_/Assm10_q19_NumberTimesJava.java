package Assm10_;

public class Assm10_q19_NumberTimesJava {

	public static void main(String[] args) {
		// Return the number of times that the string "java" appears anywhere in the given string word.
		
		String str = "javaxjavammjavilkjavabcjavaopt";
		String check = "java";
		String dummy = "";
		
		int count = 0;
		
		for(int i=0; i<=str.length()-check.length(); i++) {
			if(str.substring(i,i+check.length()).contentEquals(check)) {
				dummy += str.substring(i, i+check.length());
				count++;
			}
		}
		System.out.println(count);
		System.out.println(dummy);

	}

}
