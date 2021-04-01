package day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();

		System.out.println("Total slices: " + Dinner.pizzaSlice);
		System.out.println("Total slices: " + mom.pizzaSlice);
		System.out.println("Total slices: " + dad.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		System.out.println("Now pizza has " + Dinner.pizzaSlice + " slices");
	
		mom.takeASlice();		
		System.out.println("Now pizza has " + Dinner.pizzaSlice + " slices");
		//because SHARING the same value so have 5 slices of pizza...
		
		kid.takeASlice(3);
		dad.takeASlice(2);
		
		System.out.println("Now pizza has " + Dinner.pizzaSlice + " slices");
		
		// S T A T I C  means  S H A R E  the same value by each object
			
	}

}
