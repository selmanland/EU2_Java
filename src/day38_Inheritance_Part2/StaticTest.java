package day38_Inheritance_Part2;

public class StaticTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		obj.num = 5;	// by using object belongs to sub-child class, I changed the value...
		obj.print();
		
		StaticSuper.num = 10;	// calling thru class-name
		obj.print();
		System.out.println(StaticSub.num);
		
//		StaticSub.m2(); not possible to call bc m2 is not STATIC, should be called by only object name		
		StaticSub.m1();				// possible bc m1() static
		obj.m2();					// can call thru obj name

	}

}
