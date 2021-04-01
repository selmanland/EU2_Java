package day34_constructors_passingObjectsToMethods;

public class Light {

	int noOfWatts;
	boolean indicator;
	String location;

	public Light() {
		this(0, false); // calling constructor
		System.out.println("returning from no-argument constructor no.1");
	}

	public Light(int watt, boolean ind) {
		this(watt, ind, "X");
		System.out.println("returning from constructor no.2");
	}

	public Light(int noOfWatts, boolean indicator, String location) {

		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("returning from constructor no.3");
	}

}
