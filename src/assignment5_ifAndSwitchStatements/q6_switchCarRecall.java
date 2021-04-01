package assignment5_ifAndSwitchStatements;

public class q6_switchCarRecall {

	public static void main(String[] args) {

		int vehicleYear=2018;
		byte modelYear=0;
		
		if(vehicleYear>=1995 && vehicleYear<=1998) {
			modelYear=1;
		}else if(vehicleYear>=2001 && vehicleYear<=2002) {
			modelYear=1;
		}else if(vehicleYear>=2004 && vehicleYear<=2006) {
			modelYear=1;
		}else if(vehicleYear>=2015 && vehicleYear<=2017) {
			modelYear=1;
		}else {
			modelYear=0;
		}
	
		switch (modelYear) {
		case (0):
			System.out.println("Your car is fine, enjoy");
		break;
		case (1):
			System.out.println("Your vehicle needs to be recalled!");
		break;
			
		}

}
}