package day16_classObjects;

public class CarObjects {

	public static void main(String[] args) {

		Car car1 = new Car(); // New Object so compiler knows there is Car class

		car1.printCarInfo(); //Compiler knows now there is printCarInfo method in Car class
							 // and executes it

		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;

		car1.printCarInfo();

		car1.showCurrentSpeed(70); // speed limit 70 so NOT over
		car1.showCurrentSpeed(35); // speed limit 35 so over

		car1.drive();

		System.out.println("before: " + car1.currentSpeed);

		car1.accelerate(20);

		System.out.println("after: " + car1.currentSpeed);

	}

}
