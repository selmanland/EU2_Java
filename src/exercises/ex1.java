package exercises;

public class ex1 {

	public static void main(String[] args) {

		//int currentAge = calculateAge(2021, 1986);
        //System.out.println(currentAge);

        yearsuntilRetirement("mike", 65, 2021, 1996);


        // System.out.println(" "+ "is retire in "+ years+ "years");
        //  System.out.println(years);
        //System.out.println(name);


    }


    public static int calculateAge(int year , int yearBirth) {
        int age;
        age=year-yearBirth;
        return age;



    }
    public static int yearsuntilRetirement(String name, int retirementAge, int year, int yearBirth) {

        //int retirementAge=65;
        int currentAge = calculateAge(year, yearBirth);
        int years = retirementAge-currentAge;
        System.out.println(name + " is " + currentAge + " years old and has " + years + " years to retire...");
        //System.out.println(name+"will be retire in "+ years+" years");

        //System.out.println(name);
        return years;




    }

}