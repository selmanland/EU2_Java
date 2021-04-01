package Assm11_;

public class Assm11_q32_first3Arr {

	public static void main(String[] args) {
//		The code provided in your main method will take in five Strings and save them into an array called arr. 
//		Print out the first three letters of each element of arr, one per line. 
//		You can assume that every element of arr is at least 3 letters long.

		String str1 = "apple";
		String str2 = "banana";

		newArrW3(str1, str2);

	}

	public static void newArrW3(String str1, String str2) {

		String[] arr = { str1.substring(0, 3), str2.substring(0, 3) };

		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}

}
