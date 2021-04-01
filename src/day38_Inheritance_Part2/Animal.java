package day38_Inheritance_Part2;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;			// set the value using constructor
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
									// used getters
	public void eat() {
		System.out.println("Animal eat() is called");
	}
	public void move(int speed) {
		System.out.println("Animal.move() called. Animal is moving at " + speed);
	}

	public String getName() {
		return name;
	}

	public int getBrain() {
		return brain;
	}

	public int getBody() {
		return body;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}
	
	
}
