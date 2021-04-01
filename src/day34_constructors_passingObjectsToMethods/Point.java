package day34_constructors_passingObjectsToMethods;

public class Point {

	int k, l;
	
	public Point(int x, int y) {
		k = x; l = y;
	}
	
	public Point() {
		this(10,10);
	}
	
	public int getX() {
		return k;
	}
	
	public int getY() {
		return l;
	}
}
