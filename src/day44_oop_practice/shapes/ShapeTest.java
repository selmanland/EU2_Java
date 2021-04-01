package day44_oop_practice.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		// create 4 shapes using polymorphism
		
		Shape square = new Square();
		Shape triangle = new Triangle();
		Shape diamond = new Diamond();
		Object shapeObject = new Shape();
		
		square.draw();
		triangle.draw();
		
		((Square)square).squareMethod();	// down-casting: cast reference type to object type
		

	}

}
