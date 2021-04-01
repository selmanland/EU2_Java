package assignment4_ifStatements_SwitchStatements;

public class q3_leapYear {

	public static void main(String[] args) {
		
		int year=2000;
		
		if(year % 4 == 0) {
			if(year % 100 == 0 && year % 400 != 0) {
				System.out.println(year + " >>> " + "NOT a Leap Year" );
			}else {
				System.out.println(year + " >>> " + "Leap Year");
			}
		}else {
			System.out.println(year + " >>> " + "NOT a Leap Year");
		}
	}
	}

