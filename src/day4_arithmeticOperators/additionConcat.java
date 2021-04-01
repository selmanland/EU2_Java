package day4_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {
		// Number + Number = Addition
		System.out.println(2 + 2); //4
		System.out.println(20 + 200); //220
		
		//Number + String = Concatenation
		System.out.println(5 + "hello"); //5hello
		
		//String + Boolean = Concatenation
		System.out.println("hello" + true); //hellotrue
		
		//String + String = Concatenation
		System.out.println("hello" + "world"); //helloworld
		
		//Boolean + Number = error
		//System.out.println(true + 1); e r r o r
		
		System.out.println(2 + 0 + 3 + "Cybertek");       //5Cybertek
		System.out.println("Cybertek" + 2 + 0 + 5);       //Cybertek205
		System.out.println(2 + 0 + 5 + "Cybertek" + 2 + 0 + 5); //7Cybertek205
		System.out.println(2 + 0 + 5 + "Cybertek" + (2+0+1));   //7Cybertek3
		

	}

}
