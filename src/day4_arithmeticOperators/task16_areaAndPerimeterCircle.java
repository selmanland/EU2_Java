package day4_arithmeticOperators;

public class task16_areaAndPerimeterCircle {

	public static void main(String[] args) {
		// perimeter = 2 * radius * pi number
		// area = radius * radius * pi number
		
		final double PI=3.14;
		double perimeter, area, radius;
		
		radius=5.5;
		perimeter=2*radius*PI;
		area=radius*radius*PI;
		
		System.out.println("When radius is " + radius + ", then perimeter of a circle is = " + perimeter + " and area is equal to = " + area);
		
		

	}

}
