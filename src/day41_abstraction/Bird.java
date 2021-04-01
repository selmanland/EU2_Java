package day41_abstraction;

public class Bird extends Animal {

	@Override
	public void eat() {
		System.out.println("Bird Class eat");
		
	}

	@Override
	public void breathe() {
		System.out.println("Bird Class breathe");
		
	}
	
	// first concrete class of parent so should inherit implement all abstract methods

}
