package day3_variables_dataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		
		byte b1 = 25;
		byte b2 = -25;
		//byte b3 = 128 gives error because must not exceed limits;
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_100;
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		long l1 = 5000; // suffix L is optional because literal 5000 is of int type
		long l2 = -2147683649L; // suffix L is mandatory this number is out of int range
		long creditCardNumber = 5876_1234_3453_9832L;
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);
		
		//floating numbers w decimals : default is double
		float f1 = 2.1f;
		
		double d1 = 3.146878542215554;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		
		char c1 ='A';
		char c2 =65; //decimal value corresponding to character 'A'
		System.out.println(c2);
		
		char c3 = '\u0041';
		System.out.println(c3);
		
		char c4 = 181;
		System.out.println(c4);
		
		boolean status = true;
		boolean status2 = false;
		
		System.out.println("Eligible to take the exam: " + status);
		System.out.println("Eligible to take the exam: " + status2);
		
		String name = "Halim";
		System.out.println("My name is " + name);
		
	}

}
