package day33_classObjects_constructors;

public class BankAccount {
	
	//instance variable
	double balance;

	// this constructor sets the starting balance to 0.0
	public BankAccount() {
		balance = 0.0; // this is not DEFAULT bc we assign value
	}

	// this constructor sets the starting balance to the value passes as an argument
	public BankAccount(double startBalance) {
		balance = startBalance;
	}

	// this constructor sets the starting balance to the value in the string argument
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}

	// deposit method makes a deposit into account
	public void deposit(String str) {
		balance = balance + Double.parseDouble(str);
	}

	public double getBalance() {

		return balance;
	}
}
