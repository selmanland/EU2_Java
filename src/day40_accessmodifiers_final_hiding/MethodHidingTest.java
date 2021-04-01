package day40_accessmodifiers_final_hiding;

public class MethodHidingTest {

	public static void main(String[] args) {			

	}
}
class Bear{
	public static void eat() {
		System.out.println("Bear is eating");
	}
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}
class Panda extends Bear {
	
	public static void eat() {					// method hiding
		System.out.println("Panda is eating");
	}
	/*
	public void sneeze() {		// need to put static or error
		System.out.println("Panda is sneezing");
	}
	*/
	
	@Override
	public void hibernate() {					// method overriding
		System.out.println("Panda is hibernating");
	}
}
