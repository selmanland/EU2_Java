package day44_oop_practice.shapes;

public class Triangle extends Shape {
	
	public Triangle() {
		type = "triangle";
	}

	@Override
	public void draw() {
		System.out.println("drawing a triangle");
	}
	

}
