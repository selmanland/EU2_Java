package day30_wrapperClass;

public class parsingValues {

	public static void main(String[] args) {
		
		String numberAsString = "2018";
		System.out.println(numberAsString);				// String
		
		int number = Integer.parseInt(numberAsString);
		System.out.println(number);						// integer
		
		System.out.println("------------------");
		
		numberAsString = numberAsString + 1;
		number = number + 1;					// String concat
		
		System.out.println(numberAsString);
		System.out.println(number);				// int calculation
		
		int i = 10;
		String s = String.valueOf(i);	 // using String class value of method
		System.out.println(s); 							// it will return "10" as a String NOT int
		
		String s2 = Integer.toString(i); // using Integer wrapper class toString method
		System.out.println(s2); 						// it will return again "10" as a String

	}

}
