package day6_logicalOperators;

public class task23_operators {

	public static void main(String[] args) {
		
		double d1=20;
		double d2=80;
		double res, remainder;
		
		res=(d1+d2)*25;
		remainder=res%40;
		
		System.out.println("Remaining total is equal to 20 or less? - " + (remainder<=20));

	}

}
