package day30_wrapperClass;

public class boxing {

	public static void main(String[] args) {
		
		// AUTOBOXING -> primitive to object								*** NOT FORGET 111 ***
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;					// converting primitive n to object num2
		
		
		// UNBOXING -> object to primitive									*** NOT FORGET 222 ***
		Double d1 = new Double(34.2);
		double d2 = d1;						// converting object d1 to primitive d2
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		long l1 = new Long(6000000L);	// unboxing
		Long l2 = new Long(345699459);	// no boxing only creating 
		long l3 = l2;					// unboxing
		
		int x = 345;
		double y = x; // implicit casting
		
		// How to create 													*** NOT FORGET 333 ***
		Integer num3 = Integer.valueOf(345);	// create using VALUE OF method  
		// Double d3 = num3; // casting not possible with wrapper classes

	}

}
