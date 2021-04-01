package day41_abstraction;

public abstract class Animal {
	
	public abstract void eat();	// Abstract method so no {} body
	
	public abstract void breathe();
								// Abstract class can have both abstract and instance method as well
	
	
	public void move() {		// instance method
		System.out.println("Moving");
	}
								// any class has abstract method in must be abstract

}

