package exercises;

public class task96_exercise {

	public static void main(String[] args) {

		String str = "Today weather is sunny and 78 degree. It is a perfect day to practice java.";

		convertToCelc(str);

	}

	public static void convertToCelc(String sentence) {

		String[] s1 = sentence.split(" and ");
		s1 = s1[1].split(" degree");
		String temp = s1[0];
		Double tempF = Double.valueOf(temp);
		Double tempC = (double) Math.round((tempF - 32) * 5 / 9);

		System.out.println(tempF + " Fahrenheit is equal to " + tempC + " Celcius");

	}

}
