package exercises;

public class Calculator {

	
	Floor floor;
	Carpet carpet;	
	// to able to calculate total cost I need the floor area. To able to get the floor area, 
	// I need to access to floor class so I can use a floor object.
	
	// the same is with the carpet class...
	
	public Calculator(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost() {
		
		return floor.getArea() * carpet.getCost();
		
		// only way to access a class' properties or methods is through object...which is floor or carpet
	}
}
