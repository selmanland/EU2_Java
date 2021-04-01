package assignment4_ifStatements_SwitchStatements;

public class q4_telephoneBill {

	public static void main(String[] args) {
		
		int callNumber=201;
		double billTotal=200;
		
		if(callNumber<=100 && callNumber>=0) {
			System.out.println("Total Bill is $ " + billTotal);
			
		}else if(callNumber>100 && callNumber<=150) {
			billTotal=billTotal + (callNumber-100)*0.60;
			System.out.println("Total Bill is $ " + billTotal);
			
		}else if(callNumber>150 && callNumber<=200) {
			billTotal=billTotal  + (150-100)*0.60 + (callNumber-150)*0.50;
			System.out.println("Total Bill is $ " + billTotal);
			
		}else if(callNumber>200) {
			billTotal=billTotal +  + (150-100)*0.60 + (200-150)*0.50 + (callNumber-200)*0.40;
			System.out.println("Total Bill is $ " + billTotal);

}else {
	System.out.println("Invalid Entry");
}
}}