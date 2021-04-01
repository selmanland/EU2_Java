package day7_controlFlowStatements;

public class task31_triangle {

	public static void main(String[] args) {
		// A triangle is valid if the sum of all three angles is equal to 180 degrees.
		// Write a program that declares three integers as angles and check whether a triangle is valid or not.
		
		int a, b, c, sum;
		a=60;
		b=70;
		c=50;
		sum=a+b+c;//we may not assign sum variable and instead we may use (a+b+c) == 180 below...
		
		if(sum == 180) {
			System.out.println("abc is a valid \"triangle\"");
		}else {
			System.out.println("abc is NOT a valid \"triangle\"");
		}

	}

}
