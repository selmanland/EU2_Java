package Assm11_;

public class Assm11_q34_reverseString {

	public static void main(String[] args) {
//		Given a String variable sentence, write code to type each word in separate lines in reverse order.

		String word = "Java is fun";
		
		reverse(word);		
		
	}
	public static void reverse(String str) {
		
		String[] arr = str.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		
	}

}
