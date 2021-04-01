package day17_classObjects_Part2;

public class CapitalOne {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		
		acc1.accountHolder = "Mike Smith";
		acc1.accountNumber = 12345;
		
		acc1.deposit(250);
		
		acc1.showBalance();
		
		acc1.withdraw(100);
		
		acc1.showBalance();
		
		acc1.charge(50, "table");

	}

}
