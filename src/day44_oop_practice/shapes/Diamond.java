package day44_oop_practice.shapes;

public class Diamond extends Shape {
	
	public Diamond() {
		type = "diamond";
	}

	@Override
	public void draw() {
		System.out.println("drawing a diamond");
	}
	
	

}
