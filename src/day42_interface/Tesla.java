package day42_interface;

public class Tesla extends ElectricCar {

	public Tesla(String model, double price, String color) {
		super(model, price, color);

	}

	@Override
	public void start() {
		System.out.println("Tesla is starting quitely...");
		System.out.println("Change to Drive mode...");

	}

	@Override
	public void charge() {
		System.out.println("Tesla charging - Plugin to Electric outlet...");

	}

	@Override
	public void drive() {
		System.out.println("Tesla is driving");

	}
}
