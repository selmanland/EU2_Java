package assignment4_ifStatements_SwitchStatements;

public class q14_bookAwardPoints {

	public static void main(String[] args) {
		
		String numBook="3";
		
		switch(numBook) {
		
		case "0":
			System.out.println("Number of points awarded is " + 0);
			break;
		
		case "1":
			System.out.println("Number of points awarded is " + 5);
			break;
			
		case "2":
			System.out.println("Number of points awarded is " + 15);
			break;
			
		case "3":
			System.out.println("Number of points awarded is " + 30);
			break;
			
		case "4":
			System.out.println("Number of points awarded is " + 60);
			break;
			
			default: System.out.println("Please consult to Customer Service");
			break;
		}
			
		}

	}

