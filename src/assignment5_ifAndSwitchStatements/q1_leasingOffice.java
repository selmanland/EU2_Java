package assignment5_ifAndSwitchStatements;

public class q1_leasingOffice {

	public static void main(String[] args) {
		
		int numberOfBedrooms=2;
		int startingPrice=0;
		
		switch(numberOfBedrooms) {
		
		case(1):
			startingPrice=1100;
		System.out.println("One Bedroom Selected");
		break;
		
		case(2):
			startingPrice=1850;
		System.out.println("Two Bedroom Selected");
		break;
		
		case(3):
			startingPrice=2550;
		System.out.println("Three Bedroom Selected");
		break;
		
		default: System.out.println("No such Bedrooms available");
		}
		System.out.println("Starting Price: $" + startingPrice);
	}

}
