package Assm11_;

public class Assm11_q35_StringReversed {

	public static void main(String[] args) {
//		Given a String variable sentence, write code to get each word 
//		and assign it to String reversed in reverse order.

		String sentence = "Java is fun";
		
		reversed(sentence);
		
	}
	public static void reversed(String str) {
		
		String[] arr = str.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
