package Assm14_OOP;

public class Calculator {
	
public static int minus(int a ,int b) {
		
		return a-b;
	}
	
	public static int plus(int a ,int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Calculator.minus(1,1));
		System.out.println(Calculator.plus(10,1));
	}

}
