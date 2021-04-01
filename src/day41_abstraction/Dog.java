package day41_abstraction;

public class Dog extends Animal {

	@Override			// has to be overridden bc abstract methods in parent class
	public void eat() {
		System.out.println("Dog is eating dog food");
		
	}

	@Override
	public void breathe() {
		System.out.println("Dog is breathing");
	}
	
	

}
