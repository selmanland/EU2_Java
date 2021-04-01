package assignment4_ifStatements_SwitchStatements;

public class q9_fastFreightCharges {

	public static void main(String[] args) {
		// Fast Freight shipping charges
		double weightOfPackage;
		double ratePer500Miles=0;
		
		weightOfPackage=10.3;
		
		if(weightOfPackage<=2) {
			ratePer500Miles=1.10;
		}else if(weightOfPackage<=6) {
			ratePer500Miles=2.20;
		}else if(weightOfPackage<=10) {
			ratePer500Miles=3.70;
		}else if(weightOfPackage>10){
			ratePer500Miles=3.8;
		}
		System.out.println("Your shipping charges per 500 miles will be $" + ratePer500Miles);
}
}