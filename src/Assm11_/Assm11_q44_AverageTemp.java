package Assm11_;

public class Assm11_q44_AverageTemp {

	public static void main(String[] args) {
//		Given an array temps of doubles, containing temperature data, compute the average temperature. 

		Double[] temp = {80.0,88.0,88.0,84.0,82.0,78.0,60.0,68.0};
		
		Double average = 0.0;
		
		for(Double each : temp) {
			average += each.doubleValue()/temp.length;
		}
		
		System.out.println(average);
		
	}

}
