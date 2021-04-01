package assignment4_ifStatements_SwitchStatements;

public class q15_switchCasePractice {

	public static void main(String[] args) {
		
		int number=1;
		
		switch(number) {
		
		case(0): case(1): case (2):
			System.out.println("Low Number");
		break;
		
		case(3): case(4): case(5):
			System.out.println("Medium Number");
		break;
		
		default:System.out.println("Other Number");
		break;
		}

	}

}
