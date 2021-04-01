package day40_accessmodifiers_final_hiding;

public class TestParentChild {

	public static void main(String[] args) {
		
		Child s = new Child();
		System.out.println("Value of x before increemnt " + s.x);

		s.increment();

		System.out.println("Vlue of x after increement " + s.x);

		Parent p = new Parent();

		System.out.println("Value of x before increemnt " + p.x);

		p.increment();

		System.out.println("Value of x after increemnt " + p.x);
	}

}
