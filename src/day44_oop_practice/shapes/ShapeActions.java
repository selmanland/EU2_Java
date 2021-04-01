package day44_oop_practice.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static day44_oop_practice.shapes.ShapeManager.*;

// Using static import: before we could write className.methodName but with this we can delete className
// and directly call methodName...I

public class ShapeActions {

	public static void main(String[] args) {
		
		drawSquare( (Square) buildShape("square"));		// down-casting
		
		Object rand = new Random();
		System.out.println(((Random) rand).nextInt(5));
		
		System.out.println("+++++++++");
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Triangle());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Triangle());

		drawShape(myList);

	}

}
