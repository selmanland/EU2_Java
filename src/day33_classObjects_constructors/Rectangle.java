package day33_classObjects_constructors;

public class Rectangle {
	
	//constructor overloading there are many constructors with the same name but accepting different arguments

	double length;
	double width;

	public void getArea() {
		System.out.println(length * width);
	}

	// created a constructor accepts 2 arguments type double

	public Rectangle(double a, double b) {		// parameterized constructor

		length = a;
		width = b;
	}

	public Rectangle() { 	// constructor 2 with no parameters/arguments => Default constructor JVM creates this
						 	//	and assign default values
							// now we created but IF DEFAULT CONSTRUCTOR, WE DO NOT SEE THIS...
	
	}
	public Rectangle(int a, float b) {

	}
	

}
