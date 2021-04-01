package day38_Inheritance_Part2;

public class FulltimeEmployee extends Employee {

	@Override
	public void calculatePay(int hours, double rate) {	// overriding (same name same parameters)
		double total = (hours*rate)*1.05;
		System.out.println("Fulltimeemployee total pay:" + total);
	}	
	
}
