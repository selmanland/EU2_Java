package day7_controlFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
		// Task 1
		int x, y;
		y = 20;
		x = 10;
		
		if (y==20) {
			x = 3; 
			}
		System.out.println("x = " + x + "   y = " + y);
		System.out.println("*******************************");
		
		// Task 2
		int hours;
		double payRate = 5000;
		
		hours = 41;
				
		if (hours > 40) {
			payRate = payRate * 1.5;
		}
		
		System.out.println("Monthly income is $ " + payRate);
		System.out.println("****************************");
		
		// Task 3
		boolean max = true;
		int fee = 20;
		
		if (max==true) {
			fee=50;
		}
		System.out.println("Fee is " + fee);
		System.out.println("***********************");
		
		// Task 4
		int a=100;
		int b=50;
		int c=99;
		
		if (b==50 && c>=100) {
			a=20;
		}
		System.out.println("a = " + a);
		System.out.println("**********************");
		
		// Task 5
		int temp=75;
		
		if (temp>=70 && temp<=80) {
			System.out.println("Ideal TEMP");
		}
		System.out.println("*********************");
	}

}
