package day36_staticClassMembers;

public class Dinner {

	static int pizzaSlice = 8;	// STATIC means SHARE the same value by each object
	
	public void takeASlice() {
		pizzaSlice--;
	}
	
	public void takeASlice(int count) {
		pizzaSlice -= count;
	}
}
