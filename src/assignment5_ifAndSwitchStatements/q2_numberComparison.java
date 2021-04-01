package assignment5_ifAndSwitchStatements;

public class q2_numberComparison {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=12;
		num2=11;
		
		if(num1==num2) {
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + num2);
			System.out.println(num1 + " and " + num2 + " are equal");
		}else if(num1>num2) {
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + num2);
			System.out.println(num1 + " is greater than " + num2);
		}else {
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + num2);
			System.out.println(num2 + " is greater than " + num1);
		}
		
	}

}
