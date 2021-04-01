package day34_constructors_passingObjectsToMethods;

public class Main {

	public static void main(String[] args) {
		
		Complex c1 = new Complex(10,15);
		Complex c2 = new Complex(c1);
		@SuppressWarnings("unused")
		Complex c3 = c1;
		System.out.println(c2.toString());

	}

}
