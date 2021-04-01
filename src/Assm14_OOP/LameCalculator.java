package Assm14_OOP;

public class LameCalculator {
	
	int num1;
	int num2;
	
	public int plus(int num1, int num2) {
		return num1+num2;
	}
	public int minus(int num1, int num2) {
		return num1-num2;
	}
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	public int divide(int num1, int num2) {
		return num1/num2;
	}
	public static void main(String[] args) {
		
		LameCalculator lc = new LameCalculator();
		
		System.out.println(lc.plus(1, 1));
		System.out.println(lc.minus(1, 1));
		System.out.println(lc.multiply(2, 1));
		System.out.println(lc.divide(10, 2));
	}

}
