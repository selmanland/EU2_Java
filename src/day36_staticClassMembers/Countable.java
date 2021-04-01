package day36_staticClassMembers;

public class Countable {

	static int instanceCount; 	// static variable
	
	// int instanceCount;		// instance variable (belongs to object)

	public Countable() {
		instanceCount++;
	}

	public int getInstanceCount() {
		return instanceCount;
	}

}
