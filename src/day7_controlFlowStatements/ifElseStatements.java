package day7_controlFlowStatements;

public class ifElseStatements {

	public static void main(String[] args) {
		int score=79;
		
		if (score>=70 ) {
			
			System.out.println("Your grade is " + score);
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			
		} else {
			System.out.println("Your grade is " + "\"" + score + "\"");
			System.out.println("You are FAILED !");
		}
		System.out.println("********************************");
		
		int sales, bonus;
		double commisionRate, salary;
		
		sales=5000;
		salary=10000;
		
		if (sales>=5000) {
			bonus=500;
			commisionRate=1.5;
			
			salary = salary * commisionRate + bonus;

	} else {
		bonus=100;
		commisionRate=1.0;
		
}
		salary = salary * commisionRate + bonus;
		System.out.println("salary = $" + salary);
}
}