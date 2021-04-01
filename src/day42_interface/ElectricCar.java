package day42_interface;

public abstract class ElectricCar {
	
	private String model;
	private double price;
	private String color;
	
	@Override
	public String toString() {
		return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
	public ElectricCar(String model, double price, String color) { // constructor is for setting values
		this.model = model;									// acts as setter method
		this.price = price;
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void stop() {
		System.out.println("Electric car is stopping by pushing the break...");
	}
	
	public abstract void start(); 		// what to do, instead of How to do
	public abstract void charge();		// it needs to there in child classes but no need to worry 
	public abstract void drive();		// about how it is implemented

}
