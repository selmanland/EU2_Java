package day38_Inheritance_Part2;

public class Car extends Vehicle {

	int maxSpeed = 180;
	
	public void display() {
		System.out.println("Max speed: " + super.maxSpeed + " comes from parent class");
		System.out.println("Maximum speed: " + maxSpeed + " comes from child class");
	}
	
}
