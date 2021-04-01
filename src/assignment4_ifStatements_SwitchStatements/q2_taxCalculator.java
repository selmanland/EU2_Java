package assignment4_ifStatements_SwitchStatements;

public class q2_taxCalculator {

	public static void main(String[] args) {
				
		int income=1300_000;
		double tax1, tax2,tax3,tax4;
		double totalTax;
		
		if(income<=150_000) {
			totalTax=income*0.25;
			System.out.println("Your Income: " + income);
			System.out.println("The tax amount you have to pay: " + totalTax);
		}else if(income>150_000 & income<=300_000) {
			tax1=150_000*0.25;
			totalTax=tax1 + (income-150_000)*0.30;
			System.out.println("Your Income: " + income);
			System.out.println("The tax amount you have to pay: " + totalTax);
			
		}else if(income>300_000 & income<=600_000) {
			tax2=(150_000*0.25) + (300_000*0.30);
			totalTax=tax2 + (income-300_000)*0.35;
			System.out.println("Your Income: " + income);
			System.out.println("The tax amount you have to pay: " + totalTax);
			
		}else if(income>600_000 & income<=1200_000) {
			tax3=(150_000*0.25) + (300_000*0.30) + (600_000*0.35);
			totalTax=tax3 + (income-600_000)*0.40;
			System.out.println("Your Income: " + income);
			System.out.println("The tax amount you have to pay: " + totalTax);
			
		}else if(income>1200_000) {
			tax4=(150_000*0.25) + (300_000*0.30) + (600_000*0.35) + (1200_000*0.40);
			totalTax=tax4 + (income-1200_000)*0.50;
			System.out.println("Your Income: " + income);
			System.out.println("The tax amount you have to pay: " + totalTax);
			
		}else {
			System.out.println("Your Income: " + income);
			System.out.println("The tax amount you have to pay: " + "?????");
		}	
		
	}

}
