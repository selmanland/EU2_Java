package day36_staticClassMembers;

public class Calculator {
	
	int x; 	// we not use any instance variables below methods so STATIC methods not instance...
			// no dependency with int x above and methods below... SO can use static...
	
	// q: if we are given a class and asked to create a method...how to know to create instance or static method???
	// then ask are we gonna use any instance variable inside the method or not?
	// if answer is yes then create instance method with instance variable like int x above...
	// if answer is no then no instance variable and create static method...

	public static double plus(double num1, double num2) {
		return num1 + num2;
	}

	public static double minus(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	public int m1() {	// here we have an instance method which has dependency with the variable x above...
		return x+4;		// so no put static or JVM gives error...
	}
}