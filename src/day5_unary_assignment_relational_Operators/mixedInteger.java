package day5_unary_assignment_relational_Operators;

public class mixedInteger {

	public static void main(String[] args) {
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1 + i2;
		double res2 = i1 + f1;
		double res3 = i2 + d1; 
		
		short firstNumber=10;
		short secondNumber=20;
		int thirdNumber=firstNumber+secondNumber; //or casting below
		
		short thirdNumber2=(short)(firstNumber+secondNumber);
		
		//byte b1=20;
		//byte b2=2;
		//byte b3 = (byte) (b1*b2);
		
		int b1=126;
		int b2=1;
		
		byte res4 = (byte) (b1+b2); //Casting is required because variables (should cast or use integer)
		
		byte res5 = 126 + 1; // No casting is required because used directly values not variables
		
		
		

	}

}
