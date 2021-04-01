package Assm10_;

public class Assm10_q31_Palindrome {

	public static void main(String[] args) {

		
		System.out.println(isPalindrome("Race cAr"));

	}

	public static boolean isPalindrome(String str) {
		
		String dummy = "";
		str = str.replace(" ", "");
				
		for(int i=str.length()-1; i>=0; i--) {
			dummy += str.charAt(i);
			
		}
		
		if(dummy.equalsIgnoreCase(str)) {
			System.out.println(dummy);
			return true;
		}else {
			System.out.println(dummy);
			return false;
		}
	}

}
