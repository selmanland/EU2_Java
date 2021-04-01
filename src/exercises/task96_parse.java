package exercises;

public class task96_parse {

	public static void main(String[] args) {
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String[] arr = str1.split("and ");
		arr = arr[1].split(" degree");
		Double tempF = Double.valueOf(arr[0]);
		Double tempC = (tempF-32)/1.8;
		System.out.println(tempF + " degree Fahrenheit is equal to " + Math.round(tempC) + " celcius");
		
		

	}

}
