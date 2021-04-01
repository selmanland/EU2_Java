package day30_wrapperClass;

public class varArgs {

	public static void main(String[] args) {
		
		sum(2,4);
		sum(2,3,5,6);
		sum(5,10,50);
		
		concat("Apple", "Orange", "123", "Result");

	}
	public static void sum(int... numbers) { // ... three dots here is called vararg (variable argument) 
											// A vararg parameter can take a variable number of arguments
			// instead of method overloading with 2-3-4 parameters whatever you put above and call method,
			// convert to array format and numbers is now array and work with array inside method

		int sum = 0;
		
		for(int value : numbers) {
			sum = sum + value;
		}
		System.out.println(sum);
	}
	public static void concat(String... strs) {	// ... means varargs
		
		String newStr = "";
		
		for(String str : strs) {
			
			newStr = newStr + str.charAt(2);
		}
		System.out.println(newStr);
		
	}

}
