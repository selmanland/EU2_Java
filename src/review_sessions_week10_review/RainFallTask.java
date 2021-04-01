package review_sessions_week10_review;

import java.util.Scanner;

public class RainFallTask {

	public static void main(String[] args) {
		// 
		
double rain[] = new double[12];
        
        String months[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        System.out.println("Please enter in the following rainfall for the months ahead: ");
        System.out.println("Month\tRainfall (In inches)");


        Scanner keyboard = new Scanner(System.in);
        
        for (int i=0;i<months.length;i++) {
            System.out.print(months[i]+" :");
            double val = keyboard.nextDouble();
            while(val<0){
                System.out.println("Do not Enter a negative number. Re-ENTER");
                val = keyboard.nextDouble();
            }
            rain[i]=val;           
        }

        System.out.println("The sum of all the rain is: " + getSum(rain) + " inches");
        System.out.println("The average rainfall was: " + getAverage(rain) + " inches");
        System.out.println("The max rain is: " + getMaxValue(rain) + " inches");
        System.out.println("The min rain is: " + getMinValue(rain) + " inches");
    }
	
	public static double getSum(double[] rain) {
		double sum=0;
		for(double temp:rain) {
			sum+=temp;			
		}
		return sum;
	}
	
	public static double getAverage(double[] rain) {
		
		return getSum(rain)/rain.length;
		
	}
    public static double getMaxValue(double[] rain) {
        double max = 0;
        for (double i : rain) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double getMinValue(double[] rain) {

        double min = Double.MAX_VALUE;
        for (double i : rain) {
            if (i < min) {
                min = i;
            }
        }
        return min;
	}

}
