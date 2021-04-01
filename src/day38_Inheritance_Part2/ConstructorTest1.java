package day38_Inheritance_Part2;

public class ConstructorTest1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		SubClass1 obj = new SubClass1();
		
	}

}
// RULE 1 : Parent constructor runs before child constructor
//			In parent-child relationship (using inheritance) AND if there is constructor 
//	        available in both sub class and super class, super class constructor is called 
//          automatically before sub class constructor (JVM puts super() automatically)

// RULE 2 : if you want to run PARENT class constructor from CHILD class, need to use super() keyword 

// RULE 3 : if you do not explicitly call a superclass constructor, 
//			JVM will automatically puts super() keyword to call no argument default constructor

/*
this	- represent current object
this()	- call constructor in same class
super	- 
super()	- call parent constructor from child class
*/