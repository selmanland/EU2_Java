package day33_classObjects_constructors;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;

	// constructor 1
	public Mouse(int weight) {
		this(30, weight); 							// u calling constructor and has to be first line
		this.weight = weight;

	}

	// constructor 2
	public Mouse(int numTeeth, int weight) {
		this(numTeeth, 20, weight); 				// calling another constructor using same values weight and numTeeth
		this.numTeeth = numTeeth;
		this.weight = weight;
	}

	// constructor 3
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
	}

	// method
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}

}
