package day40_accessmodifiers_final_hiding;

public class Mouse extends Rodent {
	
	protected int tailLength = 8;
	
	public void getMouseDetails() {
		System.out.println("tail: " + tailLength + ", parentTail: " + tailLength);
	}

}
