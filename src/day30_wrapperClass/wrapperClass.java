package day30_wrapperClass;

public class wrapperClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		int n1 = 10;
		Integer n2 = new Integer(10);				// this is object right now and can use with many methods
		System.out.println(n1);
		System.out.println(n2);
		// n2.equals(n1)  when you write n2. you see many methods are ready to use bc not primitive but object now
		
		Integer num1 = Integer.valueOf(1234);
		System.out.println(num1); 				 	// this way no warning bc java version want us to create like this
		
		double d1 = 44.5;
		Double d2 = new Double(44.5);
		Double d3 = new Double("44.5"); 			// accepting as a string but converting to double object
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1+d2+d3);
		
		char ch1 = 'a';
		Character ch2 = new Character('a');
		System.out.println(ch1);
		System.out.println(ch2);
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)100);
		System.out.println(b1);
		System.out.println(b2);
		
		Integer num2 = Integer.valueOf(1234);
		System.out.println(num2);  // this way no warning bc java version want us to create like this
		
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("false");
		System.out.println(bool1);
		System.out.println(bool2);

	}

}
