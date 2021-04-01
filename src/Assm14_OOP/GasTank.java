package Assm14_OOP;

public class GasTank {

	private double amount = 0;
	private double capacity;

	public GasTank(double capacity) {
		this.capacity = capacity;
	}

	public void addGas(double parameter) {

		if (amount + parameter >= capacity) {
			amount = capacity;

		} else {
			amount += parameter;

		}
	}

	public void useGas(double parameter) {

		if (amount - parameter <= 0) {
			amount = 0;

		} else {
			amount -= parameter;

		}
	}

	public boolean isEmpty() {
		if (amount < 0.1) {
			return true;
		}
		return false;

	}

	public boolean isFull() {
		if (amount > capacity - 0.1) {
			return true;
		}
		return false;

	}

	public double getGasLevel() {
		return amount;
	}

	public double fillUp() {
		double fill = capacity - amount;
		amount = capacity;
		return fill;
	}

	public double getCapacity() {
		return capacity;
	}

	public static void main(String[] args) {

		GasTank tank = new GasTank(100);
		System.out.println(tank.getCapacity());
		tank.addGas(20);
		System.out.println(tank.fillUp());

	}

}
