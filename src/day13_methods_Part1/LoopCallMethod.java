package day13_methods_Part1;

public class LoopCallMethod {

	public static void main(String[] args) {
		
		System.out.println("hello from the main method");
		for(int i=0; i<5; i++) {
			displayMessage();
		}

	}

	private static void displayMessage() {
		System.out.println("Hello from displayMessage method");
		
	}

}
