package day33_classObjects_constructors;

public class CarTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		Car c1 = new Car();
		
		Car c2 = new Car("Honda", "Civic", 2020, 5000, "White");
		
		Car c3 = new Car("BMW", "320", 2017, 30000, "red");
		
		//1-new-call or invoke constructor
		//2-which constructor?
		//3-constructor with no parameter in Car class-default constructor not created by user so JVM creates it

		System.out.println(c1.make);
		System.out.println(c2.make);
		
	}

}
