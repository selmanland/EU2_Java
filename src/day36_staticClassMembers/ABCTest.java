package day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		// q: modify sthg in class then call a method by static way only not by creating object o1 below?
		// answer: by making ABC() constructor private in class
		
		ABC.m1(); 				// call method thru only static way

		/*
		ABC o1 = new ABC(); // error means we cut the access by making constructor private
		o1.m1();
		*/

		// Whenever all of your methods in your class are static, 
		// and you want everyone to call them static way Classname.methodname(), 
		// then you can simply make your constructor private 

	}

	public static void print() {
		//static int a = 5; // local variables can not be static

	}

}
