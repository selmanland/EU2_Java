package day33_classObjects_constructors;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle R1 = new Rectangle(3.8 , 8.5);  	// new keyword invoked the constructor
													// which constructor? accepting 2 arguments which are doubles
		
		System.out.println(R1.length);
		System.out.println(R1.width);

//		R1.length = 5.4;
//		R1.width = 3.2;

		R1.getArea(); 

		Rectangle R2 = new Rectangle();

		R2.getArea();

		Rectangle R3 = new Rectangle();
		R3.getArea();
	}

}
