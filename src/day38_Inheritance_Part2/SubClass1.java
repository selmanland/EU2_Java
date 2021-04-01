package day38_Inheritance_Part2;

public class SubClass1 extends SuperClass1 {

	public SubClass1() {
		// super(); JVM puts this keyword which we don't see
		System.out.println("This is the SUBclass constructor");
	}
}
// constructors not inherited but adjust them using super() keyword
