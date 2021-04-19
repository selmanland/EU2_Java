package exercises;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Females: ");
        int female = sc.nextInt();

        System.out.print("Enter number of Males: ");
        int male = sc.nextInt();

        double percentageOfFemale = ((double) female / (female + male)) * 100;
        double percentageOfMale = ((double) male / (female + male)) * 100;

        System.out.println("Percentage of Female is: " + percentageOfFemale);
        System.out.println("Percentage of Male is: " + percentageOfMale);
		
        
        sc.close();
	}
	

}
