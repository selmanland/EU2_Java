package day44_oop_practice.shapes;

public class Square extends Shape {
	
	public Square() {
		type = "square";
	}

	@Override
	public void draw() {
		System.out.println("drawing a square");
	}
	public void squareMethod() {
		System.out.println("square method");
	}
}
