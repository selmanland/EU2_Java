package day14_methods_Part2;

public class task68_ageRetirement {

	public static void main(String[] args) {
		
		calculateAge(2020, 1973);
		yearsUntilRetirement("Halim", 7);

	}

	public static int calculateAge(int year, int birthYear) {

		int age = year - birthYear;
		
		System.out.println("Age = " + age);
		
		return age;
	}
	public static int yearsUntilRetirement(String name, int year) {
		int years=year;
		
		System.out.println(name + " retires in "+ year + " years");
		
		return years;
	}

}
