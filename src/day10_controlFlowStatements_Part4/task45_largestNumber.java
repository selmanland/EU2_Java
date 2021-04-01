package day10_controlFlowStatements_Part4;

public class task45_largestNumber {

	public static void main(String[] args) {
		
		int num1=50;
		int num2=50;
//		int repeatTime=5;
								
		for(int x=1; x<=5; x++) {
			if(num1<num2) {
				System.out.println(num2 + " is greater " + num1);
			}else if(num1>num2) {
				System.out.println(num1 + " is greater than " + num2);
			}else {
				System.out.println(num1 + " equals to " + num2);
			}
		}
	}

}
