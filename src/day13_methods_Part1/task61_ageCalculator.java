package day13_methods_Part1;

public class task61_ageCalculator {

	public static void main(String[] args) {
		
		ageCalculator(1973, 2020);
		ageCalculator(1978, 2020);
		ageCalculator(1999, 2020);
		ageCalculator(2006, 2020);
		ageCalculator(1949, 2020);
		ageCalculator(1953, 2020);

	}
	public static void ageCalculator(int birthYear, int currentYear) {
		System.out.println("Since you were born in " + birthYear + ", your age is " + (currentYear-birthYear));
	}

}
