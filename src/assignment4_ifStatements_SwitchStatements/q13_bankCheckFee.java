package assignment4_ifStatements_SwitchStatements;

public class q13_bankCheckFee {

	public static void main(String[] args) {
		int checkNumber=10;
		
		if(checkNumber<0) {
			System.out.println("please write a valid number");
			
		}else if(checkNumber<20) {
			System.out.println("Bank Service Fee total is $" + (checkNumber*.10 + 10));
		}else if(checkNumber<40) {
			System.out.println("Bank Service Fee total is $" + (checkNumber*.08 + 10));
		}else if(checkNumber<60) {
			System.out.println("Bank Service Fee total is $" + (checkNumber*.06 + 10));
		}else if(checkNumber>=60) {
			System.out.println("Bank Service Fee total is $" + (checkNumber*.04 + 10));	

}else {
	System.out.println("invalid entry");
}
}}