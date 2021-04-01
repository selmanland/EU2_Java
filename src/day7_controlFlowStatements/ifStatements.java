package day7_controlFlowStatements;

public class ifStatements {

	public static void main(String[] args) {
		int score=80;
		
		if (score>=70 ) {
			
			System.out.println("Your grade is " + score);
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
		}
		
		System.out.println("**********************************");
		
		int sales, bonus;
		double commisionRate, salary;
		
		sales=5000;
		salary=10000;
		
		if (sales>=5000) {
			bonus=500;
			commisionRate=1.12;
			
			salary = salary * commisionRate + bonus;
			
			
			
		}

		System.out.println("Salary = " + salary);
	}

}
