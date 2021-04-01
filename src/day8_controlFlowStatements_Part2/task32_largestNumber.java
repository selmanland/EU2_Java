package day8_controlFlowStatements_Part2;

public class task32_largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=200;
		int num3=300;
		
		if((num1>num2) && (num1>num3)) {
			System.out.println("num1 is the greatest");
		}else if ((num2>num1) && (num2>num3)) {
			System.out.println("num2 is the greatest");
		}else if ((num3>num1) && (num3>num2)) {
			System.out.println("num3 is the greatest");
		}else {
			System.out.println("all numbers are equal");
		}
			
			
	}

}
