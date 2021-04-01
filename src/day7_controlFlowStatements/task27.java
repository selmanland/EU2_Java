package day7_controlFlowStatements;

public class task27 {

	public static void main(String[] args) {
		
		int hour=15;
		
		if(hour<12) {
			System.out.println("Good Morning");
		}
		
		if (hour>=12 && hour<15) {
			System.out.println("Good afternoon");
		}
		
		if (hour>=15) {
			System.out.println("Good evening");
		}

	}

}
