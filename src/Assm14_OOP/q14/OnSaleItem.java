package Assm14_OOP.q14;

public class OnSaleItem extends Item {

	private double discount;

	public OnSaleItem(String name, int catalogNumber, int quantity, double price, double discount) {
		super(name, catalogNumber, quantity, price);
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "OnSaleItem{discount=" + discount + "%, name=" + getName() + ", price= " + getPrice() + "}";
//		
	}

}
