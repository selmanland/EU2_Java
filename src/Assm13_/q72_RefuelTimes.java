package Assm13_;

import java.util.ArrayList;

public class q72_RefuelTimes {

	public static void main(String[] args) {
		
		ArrayList<Integer> deliver = new ArrayList<Integer>();
		deliver.add(9);
		deliver.add(1);
		
		int tankCapacity = 3;
		
		System.out.println(refuel(deliver, tankCapacity));	
		

	}
	public static int refuel(ArrayList<Integer> arr, int tankCap) {
		double fuelFill = 0;
		double sum = 0;
		
		for(int i=0; i<arr.size(); i++) {
			sum += arr.get(i);
		}		
		fuelFill = sum/tankCap;
		
		if(sum%tankCap > 0) {
			return (int) (fuelFill +1);
		}else {
			return (int) fuelFill;
		}
		
		
		
	}

}
