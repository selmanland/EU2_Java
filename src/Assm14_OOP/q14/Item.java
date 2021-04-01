package Assm14_OOP.q14;

public class Item {
	
	//private instance variables
	private String name;    
	private int catalogNumber;    
	private int quantity;    
	private double price;
	
	public Item(String name, int catalogNumber, int quantity, double price) {
		
		this.name = name;
		this.catalogNumber = catalogNumber;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		//TODO
		return -1;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCatalogNumber() {
		//TODO
		return -1;
	}

	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	@Override
	public String toString() {
		return "Regular Item {name=" + name + ", catalogNumber=" + catalogNumber + ", quantity=" + quantity + ", price=" + price
				+ "}";
	}
	
}
