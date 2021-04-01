package day42_interface;

public class Ford extends ElectricCar {

	private int year;

	public Ford(String model, double price, String color, int year) {
		super(model, price, color);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	@Override
	public void start() {
		System.out.println("Ford - Push start button to start...");

	}

	@Override
	public void charge() {
		System.out.println("Ford - plugin to electric outlet...");

	}

	@Override
	public void drive() {
		System.out.println("Ford is driving...");

	}

}
