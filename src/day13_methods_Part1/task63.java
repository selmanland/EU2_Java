package day13_methods_Part1;

public class task63 {

	public static void main(String[] args) {
		
		displayCelcius(77);

	}
	public static void displayCelcius(double fahrenheit) {
		double celcius=(fahrenheit-32)*5/9;
		System.out.println(fahrenheit + " fahrenheit --> " + celcius + " celcius");
	}
		
}
