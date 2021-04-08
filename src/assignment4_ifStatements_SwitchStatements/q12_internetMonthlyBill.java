package assignment4_ifStatements_SwitchStatements;

public class q12_internetMonthlyBill {

	public static void main(String[] args) {
		
		String internetPackage="A";
		int usage=101;
		
		switch(internetPackage) {
		case "A":
			if(usage>10) {
			System.out.println("Your total bill charge amount is $" + ((usage-10)*2+9.95));
			break;
			
			}else {
				System.out.println("Your total bill charge amount is $" + 9.95);
				break;
			}
			
		case "B":
			if(usage>20) {
			System.out.println("Your total bill charge amount is $" + ((usage-20)*1+13.95));
			break;
			
			}else {
				System.out.println("Your total bill charge amount is $" + 13.95);
				break;
			}
			
		case "C":
			System.out.println("Your total bill charge amount is $" + 19.95);
			break;
			
		default:
			System.out.println("Invalid Entry");
		}
		
		}
	}


