package Assm14_OOP;

public class Telephone {

	private String number;
	public  static int quantity = 250;
	public static double total = 15658.92;
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
		Telephone.quantity++;
		double num = Double.valueOf(number);
		Telephone.total += num;
		
	}
	
	
	public static void main(String[] args) {
		Telephone ayse = new Telephone();
		ayse.setNumber("1234564");
		
		Telephone murat = new Telephone();
		murat.setNumber("6546451");
		
		System.out.println(Telephone.quantity);
		System.out.println(Telephone.total);
	}
	
}
